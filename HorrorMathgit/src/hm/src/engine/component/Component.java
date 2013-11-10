package hm.src.engine.component;

import hm.src.engine.entity.Entity;
import hm.src.engine.entity.Player;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.state.StateBasedGame;

public abstract class Component {
	protected String id;
	protected Entity owner; 
	public String getId(){
		return id;
	}
	public void setOwnerEntity(Entity owner){
		this.owner = owner;
	}
	public void setOwnerEntity(Player player){
		this.owner = (Entity)player;
	}
	public abstract void update(GameContainer gc, StateBasedGame sb, int delta);
}
