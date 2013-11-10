package hm.src.collision;

import hm.src.engine.entity.Entity;

import org.newdawn.slick.geom.Vector2f;

public class Range{
	Entity object1;
	Entity object2;
	public Range(Entity object1){
		this.object1 = object1;
	}
	public Vector2f getRange(String pool){
		if(pool.equals("-")){
			return new Vector2f(object1.getPosition());
		}
		if(pool.equals("+")){
			return new Vector2f(object1.getPosition().x + 32, object1.getPosition().y + 32);
		}
		return null;
	}
}
