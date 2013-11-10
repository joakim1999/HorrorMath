package hm.src.collision;

import hm.src.engine.entity.Entity;

public class CollisionRule {
	Entity ent;
	boolean letThrough;
	public CollisionRule(Entity ent, boolean letThrough){
		this.ent = ent;
		this.letThrough = letThrough;
	}
}
