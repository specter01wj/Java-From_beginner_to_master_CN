package com.lzw.iframe.gysGuanLi;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.List;

import javax.swing.*;

import keyListener.InputKeyListener;

import com.lzw.Item;
import com.lzw.dao.Dao;
import com.lzw.dao.model.TbGysinfo;
public class GysXiuGaiPanel extends JPanel {
	private JTextField EMailF;
	private JTextField yinHangF;
	private JTextField lianXiRenDianHuaF;
	private JTextField lianXiRenF;
	private JTextField chuanZhenF;
	private JTextField dianHuaF;
	private JTextField diZhiF;
	private JTextField bianMaF;
	private JTextField jianChengF;
	private JTextField quanChengF;
	private JButton resetButton;
	private JComboBox gys;
	public GysXiuGaiPanel() {
		setLayout(new GridBagLayout());
		setBounds(10, 10, 510, 302);

		setupComponet(new JLabel("供应商全称："), 0, 0, 1, 1, false);
		quanChengF = new JTextField();
		quanChengF.setEditable(false);
		setupComponet(quanChengF, 1, 0, 3, 400, true);

		setupComponet(new JLabel("简称："), 0, 1, 1, 1, false);

		jianChengF = new JTextField();
		setupComponet(jianChengF, 1, 1, 1, 160, true);

		setupComponet(new JLabel("邮政编码："), 2, 1, 1, 1, false);
		bianMaF = new JTextField();
		bianMaF.addKeyListener(new InputKeyListener());
		setupComponet(bianMaF, 3, 1, 1, 0, true);

		setupComponet(new JLabel("地址："), 0, 2, 1, 1, false);
		diZhiF = new JTextField();
		setupComponet(diZhiF, 1, 2, 3, 0, true);

		setupComponet(new JLabel("电话："), 0, 3, 1, 1, false);
		dianHuaF = new JTextField();
		dianHuaF.addKeyListener(new InputKeyListener());
		setupComponet(dianHuaF, 1, 3, 1, 0, true);

		setupComponet(new JLabel("传真："), 2, 3, 1, 1, false);
		chuanZhenF = new JTextField();
		chuanZhenF.addKeyListener(new InputKeyListener());
		setupComponet(chuanZhenF, 3, 3, 1, 0, true);

		setupComponet(new JLabel("联系人："), 0, 4, 1, 1, false);
		lianXiRenF = new JTextField();
		setupComponet(lianXiRenF, 1, 4, 1, 0, true);

		setupComponet(new JLabel("联系人电话："), 2, 4, 1, 1, false);
		lianXiRenDianHuaF = new JTextField();
		lianXiRenDianHuaF.addKeyListener(new InputKeyListener());
		setupComponet(lianXiRenDianHuaF, 3, 4, 1, 0, true);

		setupComponet(new JLabel("开户银行："), 0, 5, 1, 1, false);
		yinHangF = new JTextField();
		setupComponet(yinHangF, 1, 5, 1, 0, true);

		setupComponet(new JLabel("电子信箱："), 2, 5, 1, 1, false);
		EMailF = new JTextField();
		setupComponet(EMailF, 3, 5, 1, 0, true);

		setupComponet(new JLabel("选择供应商"), 0, 7, 1, 0, false);
		gys = new JComboBox();
		gys.setPreferredSize(new Dimension(230, 21));
		initComboBox();// 初始化下拉选择框
		// 处理供应商信息的下拉选择框的选择事件
		gys.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				doGysSelectAction();
			}
		});
		// 定位供应商信息的下拉选择框
		setupComponet(gys, 1, 7, 2, 0, true);
		JButton modifyButton = new JButton("修改");
		JButton delButton = new JButton("删除");
		JPanel panel = new JPanel();
		panel.add(modifyButton);
		panel.add(delButton);
		// 定位按钮
		setupComponet(panel, 3, 7, 1, 0, false);
		// 处理删除按钮的单击事件
		delButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Item item = (Item) gys.getSelectedItem();
				if (item == null || !(item instanceof Item))
					return;
				int confirm = JOptionPane.showConfirmDialog(
						GysXiuGaiPanel.this, "确认删除供应商信息吗？");
				if (confirm == JOptionPane.YES_OPTION) {
					int rs = Dao.delete("delete tb_gysInfo where id='"
							+ item.getId() + "'");
					if (rs > 0) {
						JOptionPane.showMessageDialog(GysXiuGaiPanel.this,
								"供应商：" + item.getName() + "。删除成功");
						gys.removeItem(item);
					} else {
						JOptionPane.showMessageDialog(GysXiuGaiPanel.this,
								"无法删除客户：" + item.getName() + "。");
					}
				}
			}
		});
		// 处理修改按钮的单击事件
		modifyButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Item item = (Item) gys.getSelectedItem();
				TbGysinfo gysInfo = new TbGysinfo();
				gysInfo.setId(item.getId());
				gysInfo.setAddress(diZhiF.getText().trim());
				gysInfo.setBianma(bianMaF.getText().trim());
				gysInfo.setFax(chuanZhenF.getText().trim());
				gysInfo.setYh(yinHangF.getText().trim());
				gysInfo.setJc(jianChengF.getText().trim());
				gysInfo.setName(quanChengF.getText().trim());
				gysInfo.setLian(lianXiRenF.getText().trim());
				gysInfo.setLtel(lianXiRenDianHuaF.getText().trim());
				gysInfo.setMail(EMailF.getText().trim());
				gysInfo.setTel(dianHuaF.getText().trim());
				if (Dao.updateGys(gysInfo) == 1)
					JOptionPane.showMessageDialog(GysXiuGaiPanel.this, "修改完成");
				else
					JOptionPane.showMessageDialog(GysXiuGaiPanel.this, "修改失败");
			}
		});
	}
	// 初始化供应商下拉选择框
	public void initComboBox() {
		List gysInfo = Dao.getGysInfos();
		List<Item> items = new ArrayList<Item>();
		gys.removeAllItems();
		for (Iterator iter = gysInfo.iterator(); iter.hasNext();) {
			List element = (List) iter.next();
			Item item = new Item();
			item.setId(element.get(0).toString().trim());
			item.setName(element.get(1).toString().trim());
			if (items.contains(item))
				continue;
			items.add(item);
			gys.addItem(item);
		}
		doGysSelectAction();
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
		add(component, gridBagConstrains);
	}
	// 处理供应商选择事件
	private void doGysSelectAction() {
		Item selectedItem;
		if (!(gys.getSelectedItem() instanceof Item)) {
			return;
		}
		selectedItem = (Item) gys.getSelectedItem();
		TbGysinfo gysInfo = Dao.getGysInfo(selectedItem);
		quanChengF.setText(gysInfo.getName());
		diZhiF.setText(gysInfo.getAddress());
		jianChengF.setText(gysInfo.getJc());
		bianMaF.setText(gysInfo.getBianma());
		dianHuaF.setText(gysInfo.getTel());
		chuanZhenF.setText(gysInfo.getFax());
		lianXiRenF.setText(gysInfo.getLian());
		lianXiRenDianHuaF.setText(gysInfo.getLtel());
		EMailF.setText(gysInfo.getMail());
		yinHangF.setText(gysInfo.getYh());
	}
}
