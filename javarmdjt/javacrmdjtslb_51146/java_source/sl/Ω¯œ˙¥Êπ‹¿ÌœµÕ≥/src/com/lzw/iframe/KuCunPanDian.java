package com.lzw.iframe;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.List;

import javax.swing.*;
import javax.swing.table.*;

import com.lzw.*;
import com.lzw.dao.Dao;
import com.lzw.dao.model.TbSpinfo;

public class KuCunPanDian extends JInternalFrame {

	private final JTable table;

	private final JTextField pdsj = new JTextField(); // 进货时间

	private final JTextField pzs = new JTextField("0"); // 品种数量

	private JTextField czy = new JTextField();// 盘点员
	
	private Date pdDate = new Date();

	public KuCunPanDian() {
		super();
		setMaximizable(true);
		setIconifiable(true);
		setClosable(true);
		getContentPane().setLayout(new GridBagLayout());
		setTitle("库存盘点");
		setBounds(50, 50, 750, 400);

		setupComponet(new JLabel("操 作 员："), 0, 0, 1, 0, false);
		czy.setFocusable(false);
		czy.setText(MainFrame.getCzyStateLabel().getText());
		czy.setPreferredSize(new Dimension(120, 21));
		setupComponet(czy, 1, 0, 1, 0, true);

		setupComponet(new JLabel("盘点时间："), 2, 0, 1, 0, false);
		pdsj.setFocusable(false);
		pdsj.setText(pdDate.toLocaleString());
		pdsj.setPreferredSize(new Dimension(180, 21));
		setupComponet(pdsj, 3, 0, 1, 1, true);

		setupComponet(new JLabel("品 种 数："), 4, 0, 1, 0, false);
		pzs.setFocusable(false);
		pzs.setPreferredSize(new Dimension(80, 21));
		setupComponet(pzs, 5, 0, 1, 20, true);

		table = new JTable();
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		initTable();

		JScrollPane scrollPanel = new JScrollPane(table);
		scrollPanel.setPreferredSize(new Dimension(700, 300));
		setupComponet(scrollPanel, 0, 2, 6, 1, true);
	}

	// 初始化表格
	private void initTable() {
		String[] columnNames = { "商品名称", "商品编号", "供应商", "产地", "单位", "规格", "单价",
				"数量", "包装", "盘点数量", "损益数量" };
		DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
		tableModel.setColumnIdentifiers(columnNames);
		// 设置盘点字段只接收数字输入
		final JTextField pdField = new JTextField(0);
		pdField.setEditable(false);
		pdField.addKeyListener(new PanDianKeyAdapter(pdField));
		JTextField readOnlyField = new JTextField(0);
		readOnlyField.setEditable(false);

		DefaultCellEditor pdEditor = new DefaultCellEditor(pdField);
		DefaultCellEditor readOnlyEditor = new DefaultCellEditor(readOnlyField);
		// 设置表格单元为只读格式
		for (int i = 0; i < columnNames.length; i++) {
			TableColumn column = table.getColumnModel().getColumn(i);
			column.setCellEditor(readOnlyEditor);
		}

		TableColumn pdColumn = table.getColumnModel().getColumn(9);
		TableColumn syColumn = table.getColumnModel().getColumn(10);
		pdColumn.setCellEditor(pdEditor);
		syColumn.setCellEditor(readOnlyEditor);
		// 初始化表格内容
		List kcInfos = Dao.getKucunInfos();
		for (int i = 0; i < kcInfos.size(); i++) {
			List info = (List) kcInfos.get(i);
			Item item = new Item();
			item.setId((String) info.get(0));
			item.setName((String) info.get(1));
			TbSpinfo spinfo = Dao.getSpInfo(item);
			Object[] row = new Object[columnNames.length];
			if (spinfo.getId() != null && !spinfo.getId().isEmpty()) {
				row[0] = spinfo.getSpname();
				row[1] = spinfo.getId();
				row[2] = spinfo.getGysname();
				row[3] = spinfo.getCd();
				row[4] = spinfo.getDw();
				row[5] = spinfo.getGg();
				row[6] = info.get(2).toString();
				row[7] = info.get(3).toString();
				row[8] = spinfo.getBz();
				row[9] = 0;
				row[10] = 0;
				tableModel.addRow(row);
				String pzsStr = pzs.getText();
				int pzsInt = Integer.parseInt(pzsStr);
				pzsInt++;
				pzs.setText(pzsInt + "");
			}
		}
	}
	// 盘点字段的按键监听器
	private class PanDianKeyAdapter extends KeyAdapter {
		private final JTextField field;
		private PanDianKeyAdapter(JTextField field) {
			this.field = field;
		}
		public void keyTyped(KeyEvent e) {
			if (("0123456789" + (char) 8).indexOf(e.getKeyChar() + "") < 0) {
				e.consume();
			}
			field.setEditable(true);
		}
		public void keyReleased(KeyEvent e) {
			String pdStr = field.getText();
			String kcStr = "0";
			int row = table.getSelectedRow();
			if (row >= 0) {
				kcStr = (String) table.getValueAt(row, 7);
			}
			try {
				int pdNum = Integer.parseInt(pdStr);
				int kcNum = Integer.parseInt(kcStr);
				if (row >= 0) {
					table.setValueAt(kcNum - pdNum, row, 10);
				}
				if (e.getKeyChar() != 8)
					field.setEditable(false);
			} catch (NumberFormatException e1) {
				field.setText("0");
			}
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
		gridBagConstrains.insets = new Insets(5, 1, 3, 5);
		if (fill)
			gridBagConstrains.fill = GridBagConstraints.HORIZONTAL;
		getContentPane().add(component, gridBagConstrains);
	}
}
