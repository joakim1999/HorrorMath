package hm.src.engine.component.movement;


import java.util.ArrayList;

import hm.src.engine.component.Component;
import hm.src.game.TestLevel;

import org.lwjgl.input.Keyboard;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Input;
import org.newdawn.slick.geom.Vector2f;
import org.newdawn.slick.state.StateBasedGame;

public class FreeMovement extends Component{
	Vector2f position;
	Input input;
	boolean canSetPosition = true;
	ArrayList<Integer> direction;
	
	float speed = 0.1F;
	public FreeMovement(String id){
		this.id = id;
		direction = new ArrayList<Integer>();
	}
	public float getSpeed(){
		return speed;
	}
	
	public void setSpeed(Float speed){
		this.speed = speed;
	}
	@Override
	public void update(GameContainer gc, StateBasedGame sb, int delta) {
		position = owner.getPosition();
		float rotation = owner.getRotation();
		float scale = owner.getScale();
		System.out.println("Delta: " +  delta);
		canSetPosition = true;
		input = gc.getInput();
			if(input.isKeyDown(input.KEY_A) && TestLevel.isFighting == false){
				direction.add(0);
			}
			if(input.isKeyDown(input.KEY_D)&&TestLevel.isFighting == false){
				direction.add(1);
			}
			if(input.isKeyDown(input.KEY_W)&&TestLevel.isFighting == false){
				direction.add(2);
			}
			if(input.isKeyDown(input.KEY_S)&&TestLevel.isFighting == false){
				direction.add(3);
			}
			else{
				
			}
		
		if(owner.canMoving){
			for(int i = 0;i < direction.size();i++){
				if(direction.get(i) == 0){
					if(owner.canMoveLeft){
						position.x -= speed * delta;
					}
				}
				if(direction.get(i) == 1){
					if(owner.canMoveRight){
						position.x += speed * delta;
					}
				}
				if(direction.get(i) == 2){
					if(owner.canMoveUp){
						position.y -= speed * delta;
					}
				}
				if(direction.get(i) == 3){
					if(owner.canMoveDown){
						position.y += speed * delta;
					}
				}
			}
		}
		if(canSetPosition == true){
			owner.setPosition(position);
		}
		direction = new ArrayList<Integer>();
		owner.setScale(scale);
	}
	public void resetDirection(){
		System.out.println("Hello");
		direction = new ArrayList<Integer>();
	}
}
