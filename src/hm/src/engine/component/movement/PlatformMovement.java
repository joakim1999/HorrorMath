package hm.src.engine.component.movement;

import hm.src.engine.component.Component;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Input;
import org.newdawn.slick.geom.Vector2f;
import org.newdawn.slick.state.StateBasedGame;

public class PlatformMovement extends Component{
	Vector2f position;
	boolean canSetPosition = true;
	float direction;
	float speed;
	public PlatformMovement(String id){
		this.id = id;
	}
	public float getDirection(){
		return direction;
	}
	public float getSpeed(){
		return speed;
	}
	@Override
	public void update(GameContainer gc, StateBasedGame sb, int delta) {
		if(owner.canMoving==true){
			canSetPosition = true;
			position = owner.getPosition();
			float rotation = owner.getRotation();
			float scale = owner.getScale();
			
			Input input = gc.getInput();
			if(input.isKeyDown(Input.KEY_A)){
				if(owner.canMoveLeft){
					rotation += -0.2f * delta;
					position.x -= 0.1f * delta;
				}
			}
			if(input.isKeyDown(Input.KEY_D)){
				if(owner.canMoveRight){
					rotation += 0.2f * delta;
					position.x += 0.1f * delta;
				}
			}
			if(canSetPosition == true){
				owner.setPosition(position);
			}
			else{
				
			}
			owner.setRotation(rotation);
			owner.setScale(scale);
		}
	}
}
