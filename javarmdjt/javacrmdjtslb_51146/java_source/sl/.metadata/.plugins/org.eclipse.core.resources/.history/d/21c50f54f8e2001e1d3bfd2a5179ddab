package com.lzw.iframe;

import java.awt.*;
import java.awt.event.*;
import java.io.File;

import javax.swing.*;
import javax.swing.border.TitledBorder;

import com.lzw.dao.Dao;

public class BackupAndRestore extends JInternalFrame {

	private JPanel jContentPane = null;
	private JPanel backupPanel = null;
	private JPanel restorePanel = null;
	private JTextField backupTextField = null;
	private JTextField restoreTextField = null;
	private JButton backupButton = null;
	private JButton browseButton1 = null;
	private JButton browseButton2 = null;
	private JButton restoreButton = null;
	/**
	 * This is the xxx default constructor
	 */
	public BackupAndRestore() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(475, 221);
		this.setIconifiable(true);
		this.setClosable(true);
		this.setTitle("数据库备份与恢复");
		this.setContentPane(getJContentPane());
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jContentPane = new JPanel();
			jContentPane.setLayout(new BoxLayout(getJContentPane(), BoxLayout.Y_AXIS));
			jContentPane.add(getBackupPanel(), null);
			jContentPane.add(getRestorePanel(), null);
		}
		return jContentPane;
	}

	/**
	 * This method initializes backupPanel	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getBackupPanel() {
		if (backupPanel == null) {
			GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
			gridBagConstraints2.gridx = 1;
			gridBagConstraints2.anchor = GridBagConstraints.EAST;
			gridBagConstraints2.weightx = 1.0;
			gridBagConstraints2.insets = new Insets(0, 0, 0, 10);
			gridBagConstraints2.gridy = 1;
			GridBagConstraints gridBagConstraints1 = new GridBagConstraints();
			gridBagConstraints1.gridx = 2;
			gridBagConstraints1.anchor = GridBagConstraints.EAST;
			gridBagConstraints1.gridy = 1;
			GridBagConstraints gridBagConstraints = new GridBagConstraints();
			gridBagConstraints.fill = GridBagConstraints.BOTH;
			gridBagConstraints.gridy = 0;
			gridBagConstraints.weightx = 1.0;
			gridBagConstraints.gridwidth = 2;
			gridBagConstraints.gridx = 1;
			backupPanel = new JPanel();
			backupPanel.setLayout(new GridBagLayout());
			backupPanel.setBorder(BorderFactory.createTitledBorder(null, "\u6570\u636e\u5e93\u5907\u4efd", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, new Font("Dialog", Font.BOLD, 12), Color.blue));
			backupPanel.add(getBackupTextField(), gridBagConstraints);
			backupPanel.add(getBackupButton(), gridBagConstraints1);
			backupPanel.add(getBrowseButton1(), gridBagConstraints2);
		}
		return backupPanel;
	}

	/**
	 * This method initializes restorePanel	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getRestorePanel() {
		if (restorePanel == null) {
			GridBagConstraints gridBagConstraints5 = new GridBagConstraints();
			gridBagConstraints5.gridx = 1;
			gridBagConstraints5.gridy = 1;
			GridBagConstraints gridBagConstraints4 = new GridBagConstraints();
			gridBagConstraints4.gridx = 0;
			gridBagConstraints4.weightx = 1.0;
			gridBagConstraints4.anchor = GridBagConstraints.EAST;
			gridBagConstraints4.insets = new Insets(0, 0, 0, 10);
			gridBagConstraints4.gridy = 1;
			GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
			gridBagConstraints3.fill = GridBagConstraints.HORIZONTAL;
			gridBagConstraints3.gridy = 0;
			gridBagConstraints3.weightx = 1.0;
			gridBagConstraints3.gridwidth = 2;
			gridBagConstraints3.gridx = 0;
			restorePanel = new JPanel();
			restorePanel.setLayout(new GridBagLayout());
			restorePanel.setBorder(BorderFactory.createTitledBorder(null, "\u6570\u636e\u5e93\u6062\u590d", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, new Font("Dialog", Font.BOLD, 12), Color.red));
			restorePanel.add(getRestoreTextField(), gridBagConstraints3);
			restorePanel.add(getBrowseButton2(), gridBagConstraints4);
			restorePanel.add(getRestoreButton(), gridBagConstraints5);
		}
		return restorePanel;
	}

	/**
	 * This method initializes backupTextField	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getBackupTextField() {
		if (backupTextField == null) {
			backupTextField = new JTextField();
		}
		return backupTextField;
	}

	/**
	 * This method initializes backupButton	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBackupButton() {
		if (backupButton == null) {
			backupButton = new JButton();
			backupButton.setText("备份(K)");
			backupButton.setMnemonic(KeyEvent.VK_K);
			backupButton.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String path = backupTextField.getText();
					File backupFile=new File(path);
					String sql="backup database db_Database28 to DISK='"+backupFile.getAbsolutePath()+"'";
					try {
						Dao.restoreOrBackup(sql);
					} catch (Exception e1) {
						e1.printStackTrace();
						String message = e1.getMessage();
						int index = message.lastIndexOf(']');
						message=message.substring(index+1);
						JOptionPane.showMessageDialog(BackupAndRestore.this, message);
						return;
					}
					JOptionPane.showMessageDialog(BackupAndRestore.this, "备份成功");
				}
			});
		}
		return backupButton;
	}

	/**
	 * This method initializes browseButton1	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBrowseButton1() {
		if (browseButton1 == null) {
			browseButton1 = new JButton();
			browseButton1.setText("浏览(B)……");
			browseButton1.setMnemonic(KeyEvent.VK_B);
			browseButton1.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					
					JFileChooser dirChooser=new JFileChooser(".");
					int option = dirChooser.showSaveDialog(BackupAndRestore.this);
					if(option==JFileChooser.APPROVE_OPTION){
						File selFile = dirChooser.getSelectedFile();
						backupTextField.setText(selFile.getAbsolutePath());
					}
				}
			});
		}
		return browseButton1;
	}

	/**
	 * This method initializes restoreTextField	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getRestoreTextField() {
		if (restoreTextField == null) {
			restoreTextField = new JTextField();
		}
		return restoreTextField;
	}

	/**
	 * This method initializes browseButton2	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBrowseButton2() {
		if (browseButton2 == null) {
			browseButton2 = new JButton();
			browseButton2.setText("浏览(W)……");
			browseButton2.setMnemonic(KeyEvent.VK_W);
			browseButton2.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					JFileChooser dirChooser=new JFileChooser(".");
					int option = dirChooser.showOpenDialog(BackupAndRestore.this);
					if(option==JFileChooser.APPROVE_OPTION){
						File selFile = dirChooser.getSelectedFile();
						restoreTextField.setText(selFile.getAbsolutePath());
					}
				}
			});
		}
		return browseButton2;
	}

	/**
	 * This method initializes restoreButton	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getRestoreButton() {
		if (restoreButton == null) {
			restoreButton = new JButton();
			restoreButton.setText("恢复(R)");
			restoreButton.setMnemonic(KeyEvent.VK_R);
			restoreButton.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					String path = restoreTextField.getText();
					if(path==null||path.isEmpty())
						return;
					File restoreFile=new File(path);
					String sql="restore database db_Database28 from DISK='"+restoreFile.getAbsolutePath()+"' WITH REPLACE";
					try {
						Dao.restoreOrBackup(sql);
					} catch (Exception e1) {
						e1.printStackTrace();
						String message = e1.getMessage();
						int index = message.lastIndexOf(']');
						message=message.substring(index+1);
						JOptionPane.showMessageDialog(BackupAndRestore.this, message);
						return;
					}
					JOptionPane.showMessageDialog(BackupAndRestore.this, "恢复成功");
				}
			});
		}
		return restoreButton;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
