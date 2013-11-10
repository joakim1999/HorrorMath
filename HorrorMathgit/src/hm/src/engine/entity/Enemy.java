package hm.src.engine.entity;

import java.util.Random;

import hm.src.engine.component.Component;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.state.StateBasedGame;

public class Enemy extends Entity{
	public boolean isDestroyed = false;
	public int health = 5;
	public int highestDamage = 3;
	public Enemy(String id, boolean isICollidableObject) {
		super(id, isICollidableObject);
	}
	public int getEnemyHealth(){
		return health;
	}
	public void getDamage(int amount){
		health -= amount;
	}
	
	public void checkHealth(){
		if(health <= 0){
			destroy();
		}
	}
	
	public void destroy(){
		isDestroyed = true;
		renderComponent = null;
		setPosition(null);
	}
	
	public boolean checkDestroyed(){
		return isDestroyed;
	}
	
	public int generateDamage(){
		Random rand = new Random();
		return rand.nextInt(highestDamage);
	}
	
	public void update(GameContainer gc, StateBasedGame sb, int delta){
		if(!checkDestroyed()){
			for(Component component : components){
				component.update(gc, sb, delta);
			}
		}
	}
	public void render(GameContainer gc, StateBasedGame sb, Graphics gr){
		if(renderComponent != null && !checkDestroyed()){
			renderComponent.render(gc, sb, gr);
		}
	}
}
