package hm.src.engine.entity;

import hm.src.collision.CollisionHandler;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.geom.Vector2f;
import org.newdawn.slick.state.StateBasedGame;

public class Golmer extends Entity{
	public CollisionHandler colHandler;
	boolean isColliding = false;
	boolean isCollidingFromRight = false;
	boolean isCollidingFromLeft = false;
	boolean isCollidingFromTop = false;
	boolean isCollidingFromBottom = false;
	Entity affectedEntity;
	public static String leftCol = "";
	public static String rightCol = "";
	public static String bottomCol = "";
	public static String topCol = "";
	
	public Golmer(String id) {
		super(id, true);
	}
	/*public void collisionGet(Entity compareEntity){
		affectedEntity = compareEntity;
		colHandler = new CollisionHandler(affectedEntity, this);
		isCollidingFromTop = colHandler.isCollidingFromTop;
		isCollidingFromTop();
		isCollidingFromLeft();
		isCollidingFromRight();
		isCollidingFromBottom();
	}
	public boolean isCollidingFromLeft(){
		updateCollision();
		if(colHandler.isCollidingFromLeft == true){
			leftCol += "true";
			isColliding = true;
			return true;
		}
		return false;
	}
	public boolean isCollidingFromRight(){
		updateCollision();
		if(colHandler.isCollidingFromRight == true){
			rightCol += "true";
			isColliding = true;
			return true;
		}
		return false;
	}
	public boolean isCollidingFromBottom(){
		updateCollision();
		if(colHandler.isCollidingFromBottom == true){
			bottomCol += "true";
			isColliding = true;
			return true;
		}
		return false;
	}
	public boolean isCollidingFromTop(){
		updateCollision();
		if(colHandler.isCollidingFromTop == true){
			topCol += "true";
			isColliding = true;
			isCollidingFromTop = true;
			return true;
		}
		return false;
	}
	public static void reloadStrings(){
		leftCol = "";
		rightCol = "";
		bottomCol = "";
		topCol = "";
	}
	public void updateCollision(){
		colHandler.rad = new Range(colHandler.object1);
		colHandler.rad1 = new Range(colHandler.object2);
		colHandler.checkCollisionFromTop();
		colHandler.checkCollisionFromLeft();
		colHandler.checkCollisionFromRight();
		colHandler.checkCollisionFromBottom();
	}*/
}
