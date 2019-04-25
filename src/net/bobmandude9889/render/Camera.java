package net.bobmandude9889.render;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

import net.bobmandude9889.world.Location;

public class Camera extends JPanel {
	private static final long serialVersionUID = 4650114692439341962L;
	
	Location location;
	float zoom;
	
	public Camera(Location location, float zoom) {
		this.location = location;
		this.zoom = zoom;
	}
	
	@Override
	public void paintComponent(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect(100, 100, 100, 100);
	}
	
}
