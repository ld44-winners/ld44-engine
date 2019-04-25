package net.bobmandude9889.render;

import javax.swing.JFrame;

public class Window extends JFrame {
	private static final long serialVersionUID = -5702106306252895451L;

	public Window(int width, int height, String name, boolean resizable, Camera camera) {
		super(name);
		this.setResizable(resizable);
		this.setSize(width, height);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.add(camera);
		this.setVisible(true);
		
		new Thread(() -> {
			this.repaint();
		}).start();
	}
	
}
