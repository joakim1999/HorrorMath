package hm.src.engine.entity;

import hm.src.engine.component.Component;
import hm.src.engine.component.movement.FreeMovement;
import hm.src.engine.component.render.RenderComponent;

import java.util.ArrayList;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.geom.Vector2f;
import org.newdawn.slick.state.StateBasedGame;



public class Entity {
	public boolean GravityBols[] = {false, false, false, false, false, true};
	public boolean canMoveRight = true;
	public boolean canMoveLeft = true;
	public boolean canMoveDown = true;
	public boolean canMoveUp = true;
	public boolean canJump = true;
	public boolean canSwap = true;
	public boolean canMoving = true;
	public static boolean isCollidableObject;
	String id;
	Vector2f position;
	float scale;
	float rotation;
	RenderComponent renderComponent = null;
	FreeMovement movementComponent = null;
	ArrayList<Component> components = null;
	public Entity(String id, boolean isICollidableObject){
		this.id = id;
		
		components = new ArrayList<Component>();
		
		position = new Vector2f(0,0);
		scale = 1;
		rotation = 0;
		this.isCollidableObject = isCollidableObject;
	}
	public void addComponent(Component component){
		if(RenderComponent.class.isInstance(component))
			renderComponent = (RenderComponent)component;
		component.setOwnerEntity(this);
	components.add(component);
		
	}
	public Component getComponent(String id){
		for(Component comp : components){
			if(comp.getId().equalsIgnoreCase(id))
				return comp;
		}
		return null;
	}
	public Vector2f getPosition(){
		return position;
	}
	public float getScale(){
		return scale;
	}
	public float getRotation(){
		return rotation;
	}
	public String getId(){
		return id;
	}
	public void setScale(float scale){
		this.scale = scale;
	}
	public void setRotation(float rotation){
		this.rotation = rotation;
	}
	public void setPosition(Vector2f position){
		this.position = position;
	}
	public void update(GameContainer gc, StateBasedGame sb, int delta){
		for(Component component : components){
			if(FreeMovement.class.isInstance(component)){
				
			}
			component.update(gc, sb, delta);
		}
	}
	public void render(GameContainer gc, StateBasedGame sb, Graphics gr){
		if(renderComponent != null){
			renderComponent.render(gc, sb, gr);
		}
	}
}
