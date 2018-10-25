package com.lzw.iframe;
import java.awt.Component;
import java.sql.*;
import java.util.EventObject;

import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.TableCellEditor;

import com.lzw.dao.Dao;
import com.lzw.dao.model.TbSpinfo;
public class customCellEditor extends JComboBox implements TableCellEditor {
	private CellEditorListener list;
	private String gysName;
	private ChangeEvent ce = new ChangeEvent(this);
	public customCellEditor() {
		super();
	}
	public Object getCellEditorValue() {
		return getSelectedItem();
	}
	public Component getTableCellEditorComponent(JTable table, Object value,
			boolean isSelected, int row, int column) {
		ResultSet set = Dao.query("select * from tb_spinfo where gysName='"
				+gysName+"'");
		DefaultComboBoxModel dfcbm = (DefaultComboBoxModel) getModel();
		dfcbm.removeAllElements();
		dfcbm.addElement(new TbSpinfo());
		try {
			while (set.next()) {
				TbSpinfo spinfo=new TbSpinfo();
				spinfo.setId(set.getString("id").trim());
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
				dfcbm.addElement(spinfo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return this;
	}
	public void addCellEditorListener(CellEditorListener arg0) {
		list = arg0;
	}
	public void cancelCellEditing() {
		list.editingCanceled(ce);
	}
	public boolean isCellEditable(EventObject arg0) {
		return true;
	}
	public void removeCellEditorListener(CellEditorListener arg0) {
	}
	public boolean shouldSelectCell(EventObject arg0) {
		return true;
	}
	public boolean stopCellEditing() {
		list.editingStopped(ce);
		return true;
	}
	public String getGysName() {
		return gysName;
	}
	public void setGysName(String gysName) {
		this.gysName = gysName;
	}
}
