package hm.src.game;

import java.util.Random;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

import hm.src.MathMaker;
import hm.src.collision.Range;
import hm.src.combat.EnemyCombat;
import hm.src.combat.PlayerCombat;
import hm.src.engine.component.movement.FreeMovement;
import hm.src.engine.entity.Enemy;
import hm.src.engine.entity.Player;

public class Battle extends BasicGameState{
	PlayerCombat pc;
	EnemyCombat ec;
	Player pl;
	Enemy en;
	static int timeout = 0;
	
	public Battle(int state){
	}
	
	public void startBattle(){
		pl = TestLevel.getPlayer();
		en = TestLevel.getEnemy();
		pc = new PlayerCombat();
		ec = new EnemyCombat(en);
	}
	
	public void playerChance(){
		int damage = pc.getDamage();
		ec.decreaseHealth(damage);
		System.out.println("You gave the enemy " + damage + " damage");
	}
	
	public void enemyChance(){
		int damage = ec.getDamage();
		pc.decreaseHealth(damage);
		System.out.println("Your health was decreased by " + damage);
		System.out.println("You have only " + pc.getHealth() + " health left");
	}
	@Override
	public void update(GameContainer gc, StateBasedGame sb, int delta){
		pl.update(gc, sb, delta);
		playerChance();
		enemyChance();
		if(pc.getHealth() <= 0){
			pl.die();
			TestLevel.isFighting = false;
		}
		else if(ec.getHealth() <= 0){
			en.destroy();
			TestLevel.isFighting = false;
		}
	}

	@Override
	public void init(GameContainer arg0, StateBasedGame arg1)
			throws SlickException {
	}

	@Override
	public void render(GameContainer gc, StateBasedGame sb, Graphics gr)
			throws SlickException {
		System.out.println("Battle Rendering Started");
	}

	@Override
	public int getID() {
		return 1;
	}
}
