package hm.src.engine.entity;

import hm.src.engine.component.Component;
import hm.src.weapons.Weapon;
import hm.src.weapons.WoodAxe;
import hm.src.weapons.WoodSword;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.geom.Vector2f;
import org.newdawn.slick.state.StateBasedGame;

public class Player extends Entity{
	
	public Weapon defaultWeapon;
	
	public Player(String id) {
		super(id, true);
		defaultWeapon = new WoodAxe();
	}
	
	public Weapon getDefaultWeapon(){
		return defaultWeapon;
	}
	
	public void die(){
		this.position = new Vector2f(300, 300);
	}
	
	public void render(GameContainer gc, StateBasedGame sb, Graphics gr){
		if(renderComponent != null){
			renderComponent.render(gc, sb, gr);
		}
	}
	public void update(GameContainer gc, StateBasedGame sb, int delta){
		for(Component component : components){
			component.update(gc, sb, delta);
		}
	}
}
