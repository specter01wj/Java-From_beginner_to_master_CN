package com.lzw;

import java.awt.*;
import java.net.URL;

import javax.swing.*;

public class DesktopPanel extends JDesktopPane {

	private static final long serialVersionUID = 1L;
	private final Image backImage;

	/**
	 * 默认的构造方法
	 */
	public DesktopPanel() {
		super();
		URL url = DesktopPanel.class.getResource("/res/back.jpg");
		backImage = new ImageIcon(url).getImage();
	}
	@Override
	protected void paintComponent(Graphics g) {
//		super.paintComponent(g);
		int width = getWidth();
		int height = this.getHeight();
		g.drawImage(backImage, 0, 0, width, height, this);
	}
}
