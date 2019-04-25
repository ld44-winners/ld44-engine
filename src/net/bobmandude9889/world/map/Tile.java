package net.bobmandude9889.world.map;

import java.awt.image.BufferedImage;
import java.util.HashMap;

public class Tile {

	// Image used to render the tile
	BufferedImage img;
	// Map of property name to it's value
	// Ex: color : #ff00ff
	//     collision : true
	HashMap<String, String> properties;
	
	public Tile(BufferedImage img, HashMap<String, String> properties) {
		this.img = img;
		this.properties = properties;
	}
	
}
