package com.lzw.iframe;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;
import java.util.Date;
import java.util.List;

import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.*;

import com.lzw.*;
import com.lzw.dao.Dao;
import com.lzw.dao.model.*;

public class XiaoShouDan extends JInternalFrame {
	private final JTable table;

	private final JTextField sellDate = new JTextField(); // 销售日期

	private JComboBox jsr = null; // 经手人

	private final JComboBox jsfs = new JComboBox(); // 计算方式

	private final JTextField lian = new JTextField(); // 联系人

	private final JComboBox kehu = new JComboBox(); // 客户

	private final JTextField piaoHao = new JTextField(); // 票号

	private final JTextField pzs = new JTextField("0"); // 品种数量

	private final JTextField hpzs = new JTextField("0"); // 货品总数

	private final JTextField hjje = new JTextField("0"); // 合计金额

	private final JTextField ysjl = new JTextField(); // 验收结论

	private final JTextField czy = new JTextField();// 操作员

	private Date jhsjDate;

	private JComboBox sp;

	public XiaoShouDan() {
		super();
		setMaximizable(true);
		setIconifiable(true);
		setClosable(true);
		getContentPane().setLayout(new GridBagLayout());
		setTitle("销售单");
		setBounds(50, 50, 700, 400);

		setupComponet(new JLabel("销售票号："), 0, 0, 1, 0, false);
		piaoHao.setFocusable(false);
		setupComponet(piaoHao, 1, 0, 1, 140, true);

		setupComponet(new JLabel("客户："), 2, 0, 1, 0, false);
		kehu.setPreferredSize(new Dimension(160, 21));
		// 供应商下拉选择框的选择事件
		kehu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				doKhSelectAction();
			}
		});
		setupComponet(kehu, 3, 0, 1, 1, true);

		setupComponet(new JLabel("联系人："), 4, 0, 1, 0, false);
		lian.setFocusable(false);
		lian.setPreferredSize(new Dimension(80, 21));
		setupComponet(lian, 5, 0, 1, 0, true);

		setupComponet(new JLabel("结算方式："), 0, 1, 1, 0, false);
		jsfs.addItem("现金");
		jsfs.addItem("支票");
		jsfs.setEditable(true);
		setupComponet(jsfs, 1, 1, 1, 1, true);

		setupComponet(new JLabel("销售时间："), 2, 1, 1, 0, false);
		sellDate.setFocusable(false);
		setupComponet(sellDate, 3, 1, 1, 1, true);

		setupComponet(new JLabel("经手人："), 4, 1, 1, 0, false);
		setupComponet(getJsrComboBox(), 5, 1, 1, 1, true);

		sp = new JComboBox();
		sp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TbSpinfo info = (TbSpinfo) sp.getSelectedItem();
				// 如果选择有效就更新表格
				if (info != null && info.getId() != null) {
					updateTable();
				}
			}
		});

		table = new JTable();
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		initTable();
		// 添加事件完成品种数量、货品总数、合计金额的计算
		table.addContainerListener(new computeInfo());
		JScrollPane scrollPanel = new JScrollPane(table);
		scrollPanel.setPreferredSize(new Dimension(380, 200));
		setupComponet(scrollPanel, 0, 2, 6, 1, true);

		setupComponet(new JLabel("品种数量："), 0, 3, 1, 0, false);
		pzs.setFocusable(false);
		setupComponet(pzs, 1, 3, 1, 1, true);

		setupComponet(new JLabel("货品总数："), 2, 3, 1, 0, false);
		hpzs.setFocusable(false);
		setupComponet(hpzs, 3, 3, 1, 1, true);

		setupComponet(new JLabel("合计金额："), 4, 3, 1, 0, false);
		hjje.setFocusable(false);
		setupComponet(hjje, 5, 3, 1, 1, true);

		setupComponet(new JLabel("验收结论："), 0, 4, 1, 0, false);
		setupComponet(ysjl, 1, 4, 1, 1, true);

		setupComponet(new JLabel("操作人员："), 2, 4, 1, 0, false);
		czy.setFocusable(false);
		czy.setText(MainFrame.getCzyStateLabel().getText());
		setupComponet(czy, 3, 4, 1, 1, true);

		// 单击添加按钮在表格中添加新的一行
		JButton tjButton = new JButton("添加");
		tjButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 初始化票号
				initPiaoHao();
				// 结束表格中没有编写的单元
				stopTableCellEditing();
				// 如果表格中还包含空行，就再添加新行
				for (int i = 0; i < table.getRowCount(); i++) {
					TbSpinfo info = (TbSpinfo) table.getValueAt(i, 0);
					if (table.getValueAt(i, 0) == null)
						return;
				}
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Vector());
			}
		});
		setupComponet(tjButton, 4, 4, 1, 1, false);

		// 单击销售按钮保存进货信息
		JButton sellButton = new JButton("销售");
		sellButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				stopTableCellEditing(); // 结束表格中没有编写的单元
				clearEmptyRow(); // 清除空行
				String hpzsStr = hpzs.getText(); // 货品总数
				String pzsStr = pzs.getText(); // 品种数
				String jeStr = hjje.getText(); // 合计金额
				String jsfsStr = jsfs.getSelectedItem().toString(); // 结算方式
				String jsrStr = jsr.getSelectedItem() + ""; // 经手人
				String czyStr = czy.getText(); // 操作员
				String rkDate = jhsjDate.toLocaleString(); // 销售时间
				String ysjlStr = ysjl.getText().trim(); // 验收结论
				String id = piaoHao.getText(); // 票号
				String kehuName = kehu.getSelectedItem().toString();// 供应商名字
				if (jsrStr == null || jsrStr.isEmpty()) {
					JOptionPane.showMessageDialog(XiaoShouDan.this, "请填写经手人");
					return;
				}
				if (ysjlStr == null || ysjlStr.isEmpty()) {
					JOptionPane.showMessageDialog(XiaoShouDan.this, "填写验收结论");
					return;
				}
				if (table.getRowCount() <= 0) {
					JOptionPane.showMessageDialog(XiaoShouDan.this, "填加销售商品");
					return;
				}
				TbSellMain sellMain = new TbSellMain(id, pzsStr, jeStr,
						ysjlStr, kehuName, rkDate, czyStr, jsrStr, jsfsStr);
				Set<TbSellDetail> set = sellMain.getTbSellDetails();
				int rows = table.getRowCount();
				for (int i = 0; i < rows; i++) {
					TbSpinfo spinfo = (TbSpinfo) table.getValueAt(i, 0);
					String djStr = (String) table.getValueAt(i, 6);
					String slStr = (String) table.getValueAt(i, 7);
					Double dj = Double.valueOf(djStr);
					Integer sl = Integer.valueOf(slStr);
					TbSellDetail detail = new TbSellDetail();
					detail.setSpid(spinfo.getId());
					detail.setTbSellMain(sellMain.getSellId());
					detail.setDj(dj);
					detail.setSl(sl);
					set.add(detail);
				}
				boolean rs = Dao.insertSellInfo(sellMain);
				if (rs) {
					JOptionPane.showMessageDialog(XiaoShouDan.this, "销售完成");
					DefaultTableModel dftm = new DefaultTableModel();
					table.setModel(dftm);
					initTable();
					pzs.setText("0");
					hpzs.setText("0");
					hjje.setText("0");
				}
			}
		});
		setupComponet(sellButton, 5, 4, 1, 1, false);
		// 添加窗体监听器，完成初始化
		addInternalFrameListener(new initTasks());
	}

	private JComboBox getJsrComboBox() {
		if (jsr == null) {
			jsr = new JComboBox();
			List<List> czyList = Dao.getJsrs();
			for (List<String> list : czyList) {
				String id = list.get(0);
				String name = list.get(1);
				Item item = new Item(id, name);
				item.setId(id + "");
				item.setName(name);
				jsr.addItem(item);
			}
		}
		return jsr;
	}

	// 初始化表格
	private void initTable() {
		String[] columnNames = { "商品名称", "商品编号", "供应商", "产地", "单位", "规格", "单价",
				"数量", "包装", "批号", "批准文号" };
		((DefaultTableModel) table.getModel())
				.setColumnIdentifiers(columnNames);
		TableColumn column = table.getColumnModel().getColumn(0);
		final DefaultCellEditor editor = new DefaultCellEditor(sp);
		editor.setClickCountToStart(2);
		column.setCellEditor(editor);
	}

	// 初始化商品下拉选择框
	private void initSpBox() {
		List list = new ArrayList();
		ResultSet set = Dao.query(" select * from tb_spinfo"
				+ " where id in (select id from tb_kucun where kcsl>0)");
		sp.removeAllItems();
		sp.addItem(new TbSpinfo());
		for (int i = 0; table != null && i < table.getRowCount(); i++) {
			TbSpinfo tmpInfo = (TbSpinfo) table.getValueAt(i, 0);
			if (tmpInfo != null && tmpInfo.getId() != null)
				list.add(tmpInfo.getId());
		}
		try {
			while (set.next()) {
				TbSpinfo spinfo = new TbSpinfo();
				spinfo.setId(set.getString("id").trim());
				// 如果表格中以存在同样商品，商品下拉框中就不再包含该商品
				if (list.contains(spinfo.getId()))
					continue;
				spinfo.setSpname(set.getString("spname").trim());
				spinfo.setCd(set.getString("cd").trim());
				spinfo.setJc(set.getString("jc").trim());
				spinfo.setDw(set.getString("dw").trim());
				spinfo.setGg(set.getString("gg").trim());
				spinfo.setBz(set.getString("bz").trim());
				spinfo.setPh(set.getString("ph").trim());
				spinfo.setPzwh(set.getString("pzwh").trim());
				spinfo.setMemo(set.getString("memo").trim());
				spinfo.setGysname(set.getString("gysname").trim());
				sp.addItem(spinfo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// 设置组件位置并添加到容器中
	private void setupComponet(JComponent component, int gridx, int gridy,
			int gridwidth, int ipadx, boolean fill) {
		final GridBagConstraints gridBagConstrains = new GridBagConstraints();
		gridBagConstrains.gridx = gridx;
		gridBagConstrains.gridy = gridy;
		if (gridwidth > 1)
			gridBagConstrains.gridwidth = gridwidth;
		if (ipadx > 0)
			gridBagConstrains.ipadx = ipadx;
		gridBagConstrains.insets = new Insets(5, 1, 3, 1);
		if (fill)
			gridBagConstrains.fill = GridBagConstraints.HORIZONTAL;
		getContentPane().add(component, gridBagConstrains);
	}

	// 供应商选择时更新联系人字段
	private void doKhSelectAction() {
		Item item = (Item) kehu.getSelectedItem();
		TbKhinfo khInfo = Dao.getKhInfo(item);
		lian.setText(khInfo.getLian());
	}

	// 在事件中计算品种数量、货品总数、合计金额
	private final class computeInfo implements ContainerListener {
		public void componentRemoved(ContainerEvent e) {
			// 清除空行
			clearEmptyRow();
			// 计算代码
			int rows = table.getRowCount();
			int count = 0;
			double money = 0.0;
			// 计算品种数量
			TbSpinfo column = null;
			if (rows > 0)
				column = (TbSpinfo) table.getValueAt(rows - 1, 0);
			if (rows > 0 && (column == null || column.getId().isEmpty()))
				rows--;
			// 计算货品总数和金额
			for (int i = 0; i < rows; i++) {
				String column7 = (String) table.getValueAt(i, 7);
				String column6 = (String) table.getValueAt(i, 6);
				int c7 = (column7 == null || column7.isEmpty()) ? 0 : Integer
						.valueOf(column7);
				Double c6 = (column6 == null || column6.isEmpty()) ? 0 : Double
						.valueOf(column6);
				count += c7;
				money += c6 * c7;
			}
			pzs.setText(rows + "");
			hpzs.setText(count + "");
			hjje.setText(money + "");
			// /////////////////////////////////////////////////////////////////
		}

		public void componentAdded(ContainerEvent e) {
		}
	}

	// 窗体的初始化任务
	private final class initTasks extends InternalFrameAdapter {
		public void internalFrameActivated(InternalFrameEvent e) {
			super.internalFrameActivated(e);
			initTimeField();
			initKehuField();
			initPiaoHao();
			initSpBox();
		}

		private void initKehuField() {// 初始化客户字段
			List gysInfos = Dao.getKhInfos();
			for (Iterator iter = gysInfos.iterator(); iter.hasNext();) {
				List list = (List) iter.next();
				Item item = new Item();
				item.setId(list.get(0).toString().trim());
				item.setName(list.get(1).toString().trim());
				kehu.addItem(item);
			}
			doKhSelectAction();
		}

		private void initTimeField() {// 启动进货时间线程
			new Thread(new Runnable() {
				public void run() {
					try {
						while (true) {
							jhsjDate = new Date();
							sellDate.setText(jhsjDate.toLocaleString());
							Thread.sleep(100);
						}
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}).start();
		}
	}

	private void initPiaoHao() {
		java.sql.Date date = new java.sql.Date(System.currentTimeMillis());
		String maxId = Dao.getSellMainMaxId(date);
		piaoHao.setText(maxId);
	}

	// 根据商品下拉框的选择，更新表格当前行的内容
	private synchronized void updateTable() {
		TbSpinfo spinfo = (TbSpinfo) sp.getSelectedItem();
		Item item = new Item();
		item.setId(spinfo.getId());
		TbKucun kucun = Dao.getKucun(item);
		int row = table.getSelectedRow();
		if (row >= 0 && spinfo != null) {
			table.setValueAt(spinfo.getId(), row, 1);
			table.setValueAt(spinfo.getGysname(), row, 2);
			table.setValueAt(spinfo.getCd(), row, 3);
			table.setValueAt(spinfo.getDw(), row, 4);
			table.setValueAt(spinfo.getGg(), row, 5);
			table.setValueAt(kucun.getDj() + "", row, 6);
			table.setValueAt(kucun.getKcsl() + "", row, 7);
			table.setValueAt(spinfo.getBz(), row, 8);
			table.setValueAt(spinfo.getPh(), row, 9);
			table.setValueAt(spinfo.getPzwh(), row, 10);
			table.editCellAt(row, 7);
		}
	}

	// 清除空行
	private synchronized void clearEmptyRow() {
		DefaultTableModel dftm = (DefaultTableModel) table.getModel();
		for (int i = 0; i < table.getRowCount(); i++) {
			TbSpinfo info2 = (TbSpinfo) table.getValueAt(i, 0);
			if (info2 == null || info2.getId() == null
					|| info2.getId().isEmpty()) {
				dftm.removeRow(i);
			}
		}
	}

	// 停止表格单元的编辑
	private void stopTableCellEditing() {
		TableCellEditor cellEditor = table.getCellEditor();
		if (cellEditor != null)
			cellEditor.stopCellEditing();
	}
}
