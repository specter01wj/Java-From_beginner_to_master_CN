package com.wsy;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class TestThread extends JFrame {
	JPanel jPanel1 = new JPanel();
	JButton startButton = new JButton();
	JButton stopButton = new JButton();
	MyThread thread = null;
	public TestThread() {
		try {
			jbInit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void jbInit() throws Exception {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		startButton.setText("start");
		startButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				startButton_actionPerformed(e);
			}
		});
		stopButton.setText("stop");
		stopButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(ActionEvent e) {
				stopButton_actionPerformed(e);
			}
		});
		this.getContentPane().add(jPanel1, BorderLayout.CENTER);
		jPanel1.add(startButton);
		startButton.setBounds(36, 105, 82, 30);
		jPanel1.add(stopButton);
		stopButton.setBounds(160, 108, 100, 31);
	}
	
	void startButton_actionPerformed(ActionEvent e) {
		if (thread != null)
			thread.stop();
		thread = new MyThread();
		thread.start();
	}
	
	void stopButton_actionPerformed(ActionEvent e) {
		if (thread != null)
			thread.stop();
		thread = null;
	}
	
	public static void main(String[] args) {
		TestThread test = new TestThread();
		test.setBounds(300,300,300, 80);
		test.show();
	}
	
	private class MyThread extends Thread {
		public MyThread() {
		}
		
		public void run() {
			System.out.println("\n\n");
			while (true) {
				try {
					sleep(200);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Java ±à³Ì´Êµä\thttp://www.mrbccd.com");
			}
		}
	}
}
