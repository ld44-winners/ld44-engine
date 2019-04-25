package net.bobmandude9889.world.map;

public class Map {

	public int width;
	public int height;
	public int tileWidth;
	public int tileHeight;
	
	// Array of layers, Each layer is an array of ids representing the tile at any given position in the world
	private int[][] layers;
	
	// All tiles that are used in the world
	private Tile[] tileset;
	
	public Map(int width, int height, int tileWidth, int tileHeight, int[][] layers) {
		this.width = width;
		this.height = height;
		this.tileWidth = tileWidth;
		this.tileHeight = tileHeight;
		
		this.layers = layers;
	}
	
	public Tile getTile(int layer, int x, int y) {
		int id = layers[layer][x + (y * width)];
		return tileset[id];
	}
	
}
