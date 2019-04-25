package net.bobmandude9889.world;

import java.util.ArrayList;
import java.util.List;

import net.bobmandude9889.world.entity.Entity;
import net.bobmandude9889.world.map.Map;

public class World {

	public Map map;
	
	public List<Entity> entities;
	
	public World(Map map) {
		this.map = map;
		entities = new ArrayList<>();
	}
	
}
