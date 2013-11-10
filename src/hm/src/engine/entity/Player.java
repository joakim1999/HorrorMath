package hm.src.engine.entity;

import hm.src.engine.component.Component;
import hm.src.weapons.Weapon;
import hm.src.weapons.WoodAxe;
import hm.src.weapons.WoodSword;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.geom.Vector2f;
import org.newdawn.slick.state.StateBasedGame;

//The class that contains the main things about player physics
public class Player extends Entity{
	//defaultWeapon makes me know which weapon the player uses by default
	public Weapon defaultWeapon;
	
	//Constructor
	public Player(String id) {
		super(id, true);
		defaultWeapon = new WoodAxe();
	}
	
	//gets the defaultWeapon variable
	public Weapon getDefaultWeapon(){
		return defaultWeapon;
	}
	
	//if the health is 0 then this method is called
	public void die(){
		this.position = new Vector2f(300, 300);
	}
	
	//the graphics things for the player
	public void render(GameContainer gc, StateBasedGame sb, Graphics gr){
		if(renderComponent != null){
			renderComponent.render(gc, sb, gr);
		}
	}
	
	//updates the components of the player so the player gets some physics
	public void update(GameContainer gc, StateBasedGame sb, int delta){
		for(Component component : components){
			component.update(gc, sb, delta);
		}
	}
}
