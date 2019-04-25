package net.bobmandude9889.test;

import net.bobmandude9889.render.Camera;
import net.bobmandude9889.render.Window;

public class Main {

	public static void main(String[] args) {
		Window window = new Window(800, 600, "Test", true, new Camera(null, 0));
	}
	
}
