package com.lzw.iframe;

import javax.swing.JInternalFrame;
import javax.swing.JTabbedPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;

import com.lzw.iframe.shangPinGuanLi.*;
public class ShangPinGuanLi extends JInternalFrame {
	public ShangPinGuanLi() {
		setIconifiable(true);
		setClosable(true);
		setTitle("商品管理");
		JTabbedPane tabPane = new JTabbedPane();
		final ShangPinXiuGaiPanel spxgPanel = new ShangPinXiuGaiPanel();
		final ShangPinTianJiaPanel sptjPanel = new ShangPinTianJiaPanel();
		tabPane.addTab("商品信息添加", null, sptjPanel, "商品添加");
		tabPane.addTab("商品信息修改与删除", null, spxgPanel, "修改与删除");
		getContentPane().add(tabPane);
		tabPane.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				spxgPanel.initComboBox();
				spxgPanel.initGysBox();
			}
		});
		//在商品管理窗口被激活时，初始化商品添加界面的供应商下拉选择框
		addInternalFrameListener(new InternalFrameAdapter(){
			public void internalFrameActivated(InternalFrameEvent e) {
				super.internalFrameActivated(e);
				sptjPanel.initGysBox();
			}
		});
		pack();
		setVisible(true);
	}
}
