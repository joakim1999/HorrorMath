package hm.src.game;

import hm.src.MathMaker;
import hm.src.collision.CollisionLine;
import hm.src.collision.Range;
import hm.src.engine.component.movement.FreeMovement;
import hm.src.engine.component.movement.PlatformMovement;
import hm.src.engine.component.render.ImageRenderComponent;
import hm.src.engine.entity.Enemy;
import hm.src.engine.entity.Entity;
import hm.src.engine.entity.Golmer;
import hm.src.engine.entity.Player;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Vector2f;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.GameState;
import org.newdawn.slick.state.StateBasedGame;

public class TestLevel extends BasicGameState {
	Input in;
	static Vector2f positionHold;
	static boolean startBall = false;
	int startBallCount;
	public static boolean isFighting = false;
	static Player pl;
	static Enemy enemy;
	int temporaryDelta;
	public boolean isReadyForBattle = false;
	Golmer g1;
	Golmer g2;
	Golmer g3;
	Golmer g4;
	Golmer g5;
	Golmer g6;
	Golmer g7;
	Golmer g8;
	Golmer g9;
	Golmer g10;
	Golmer g11;
	Golmer g12;
	Golmer g13;
	Golmer g14;
	Golmer g15;
	Golmer g16;
	Golmer g17;
	Golmer g18;
	Golmer g19;
	Golmer g20;
	Golmer g21;
	Golmer g22;
	Golmer g23;
	Golmer g24;
	Golmer g25;
	Golmer g26;
	Golmer g27;
	Golmer g28;
	Golmer g29;
	Golmer g30;
	Golmer g31;
	Golmer g32;
	Golmer g33;
	Golmer g34;
	Golmer g35;
	Golmer g36;
	Golmer g37;
	Golmer g38;
	CollisionLine cl1;
	CollisionLine cl2;
	CollisionLine cl3;
	CollisionLine cl4;
	CollisionLine cl5;
	CollisionLine cl6;
	CollisionLine cl7;
	CollisionLine cl8;
	CollisionLine cl9;
	CollisionLine cl10;
	CollisionLine cl11;
	CollisionLine cl12;
	CollisionLine cl13;
	CollisionLine cl14;
	CollisionLine cl15;
	CollisionLine cl16;
	CollisionLine cl17;
	CollisionLine cl18;
	
	public TestLevel(int state){
	}
	
	@Override
	public void init(GameContainer arg0, StateBasedGame arg1)
			throws SlickException {
		pl = new Player("theplayer");
		pl.addComponent(new ImageRenderComponent("golindariantexture", new Image("hm/src/textures/Golindarian.png")));
		pl.addComponent(new FreeMovement("movement"));
		pl.setPosition(new Vector2f(300, 300));
		enemy = new Enemy("theenemy", true);
		enemy.addComponent(new ImageRenderComponent("rollingenemytexture", new Image("hm/src/textures/RollingEnemy.png")));
		enemy.setPosition(new Vector2f(200, 200));
    	Range r1 = new Range(enemy);
		g1 = new Golmer("golmer1");
		g1.setPosition(new Vector2f(396, 300));
		g1.addComponent(new ImageRenderComponent("golmerTexture", new Image("hm/src/textures/Golmers.png")));
		g2 = new Golmer("golmer2");
		g2.setPosition(new Vector2f(204, 300));
		g2.addComponent(new ImageRenderComponent("golmerTexture", new Image("hm/src/textures/Golmers.png")));
		g3 = new Golmer("golmer3");
		g3.setPosition(new Vector2f(396, 332));
		g3.addComponent(new ImageRenderComponent("golmerTexture", new Image("hm/src/textures/Golmers.png")));
		g4 = new Golmer("golmer4");
		g4.setPosition(new Vector2f(396, 268));
		g4.addComponent(new ImageRenderComponent("golmerTexture", new Image("hm/src/textures/Golmers.png")));
		g5 = new Golmer("golmer5");
		g5.setPosition(new Vector2f(300, 396));
		g5.addComponent(new ImageRenderComponent("golmerTexture", new Image("hm/src/textures/Golmers.png")));
		g6 = new Golmer("golmer6");
		g6.setPosition(new Vector2f(332, 396));
		g6.addComponent(new ImageRenderComponent("golmerTexture", new Image("hm/src/textures/Golmers.png")));
		g7 = new Golmer("golmer7");
		g7.setPosition(new Vector2f(268, 396));
		g7.addComponent(new ImageRenderComponent("golmerTexture", new Image("hm/src/textures/Golmers.png")));
		g8 = new Golmer("golmer8");
		g8.setPosition(new Vector2f(236, 396));
		g8.addComponent(new ImageRenderComponent("golmerTexture", new Image("hm/src/textures/Golmers.png")));
		g9 = new Golmer("golmer9");
		g9.setPosition(new Vector2f(364, 396));
		g9.addComponent(new ImageRenderComponent("golmerTexture", new Image("hm/src/textures/Golmers.png")));
		g10 = new Golmer("golmer10");
		g10.setPosition(new Vector2f(204, 332));
		g10.addComponent(new ImageRenderComponent("golmerTexture", new Image("hm/src/textures/Golmers.png")));
		g11 = new Golmer("golmer11");
		g11.setPosition(new Vector2f(204, 268));
		g11.addComponent(new ImageRenderComponent("golmerTexture", new Image("hm/src/textures/Golmers.png")));
		g12 = new Golmer("golmer12");
		g12.setPosition(new Vector2f(204, 364));
		g12.addComponent(new ImageRenderComponent("golmerTexture", new Image("hm/src/textures/Golmers.png")));
		g13 = new Golmer("golmer13");
		g13.setPosition(new Vector2f(396, 364));
		g13.addComponent(new ImageRenderComponent("golmerTexture", new Image("hm/src/textures/Golmers.png")));
		g14 = new Golmer("golmer14");
		g14.setPosition(new Vector2f(300, 204));
		g14.addComponent(new ImageRenderComponent("golmerTexture", new Image("hm/src/textures/Golmers.png")));
		g15 = new Golmer("golmer15");
		g15.setPosition(new Vector2f(268, 204));
		g15.addComponent(new ImageRenderComponent("golmerTexture", new Image("hm/src/textures/Golmers.png")));
		g16 = new Golmer("golmer16");
		g16.setPosition(new Vector2f(236, 172));
		g16.addComponent(new ImageRenderComponent("golmerTexture", new Image("hm/src/textures/Golmers.png")));
		g17 = new Golmer("golmer17");
		g17.setPosition(new Vector2f(172, 236));
		g17.addComponent(new ImageRenderComponent("golmerTexture", new Image("hm/src/textures/Golmers.png")));
		g18 = new Golmer("golmer18");
		g18.setPosition(new Vector2f(332, 204));
		g18.addComponent(new ImageRenderComponent("golmerTexture", new Image("hm/src/textures/Golmers.png")));
		g19 = new Golmer("golmer19");
		g19.setPosition(new Vector2f(364, 204));
		g19.addComponent(new ImageRenderComponent("golmerTexture", new Image("hm/src/textures/Golmers.png")));
		g20 = new Golmer("golmer20");
		g20.setPosition(new Vector2f(396, 236));
		g20.addComponent(new ImageRenderComponent("golmerTexture", new Image("hm/src/textures/Golmers.png")));
		g21 = new Golmer("golmer21");
		g21.setPosition(new Vector2f(140, 204));
		g21.addComponent(new ImageRenderComponent("golmerTexture", new Image("hm/src/textures/Golmers.png")));
		g22 = new Golmer("golmer22");
		g22.setPosition(new Vector2f(108, 204));
		g22.addComponent(new ImageRenderComponent("golmerTexture", new Image("hm/src/textures/Golmers.png")));
		g23 = new Golmer("golmer23");
		g23.setPosition(new Vector2f(76, 204));
		g23.addComponent(new ImageRenderComponent("golmerTexture", new Image("hm/src/textures/Golmers.png")));
		g24 = new Golmer("golmer24");
		g24.setPosition(new Vector2f(44, 204));
		g24.addComponent(new ImageRenderComponent("golmerTexture", new Image("hm/src/textures/Golmers.png")));
		g25 = new Golmer("golmer25");
		g25.setPosition(new Vector2f(204, 140));
		g25.addComponent(new ImageRenderComponent("golmerTexture", new Image("hm/src/textures/Golmers.png")));
		g26 = new Golmer("golmer26");
		g26.setPosition(new Vector2f(204, 108));
		g26.addComponent(new ImageRenderComponent("golmerTexture", new Image("hm/src/textures/Golmers.png")));
		g27 = new Golmer("golmer27");
		g27.setPosition(new Vector2f(204, 76));
		g27.addComponent(new ImageRenderComponent("golmerTexture", new Image("hm/src/textures/Golmers.png")));
		g28 = new Golmer("golmer28");
		g28.setPosition(new Vector2f(204, 44));
		g28.addComponent(new ImageRenderComponent("golmerTexture", new Image("hm/src/textures/Golmers.png")));
		g29 = new Golmer("golmer29");
		g29.setPosition(new Vector2f(12, 172));
		g29.addComponent(new ImageRenderComponent("golmerTexture", new Image("hm/src/textures/Golmers.png")));
		g30 = new Golmer("golmer30");
		g30.setPosition(new Vector2f(12, 140));
		g30.addComponent(new ImageRenderComponent("golmerTexture", new Image("hm/src/textures/Golmers.png")));
		g31 = new Golmer("golmer31");
		g31.setPosition(new Vector2f(12, 108));
		g31.addComponent(new ImageRenderComponent("golmerTexture", new Image("hm/src/textures/Golmers.png")));
		g32 = new Golmer("golmer32");
		g32.setPosition(new Vector2f(12, 76));
		g32.addComponent(new ImageRenderComponent("golmerTexture", new Image("hm/src/textures/Golmers.png")));
		g33 = new Golmer("golmer33");
		g33.setPosition(new Vector2f(12, 44));
		g33.addComponent(new ImageRenderComponent("golmerTexture", new Image("hm/src/textures/Golmers.png")));
		g34 = new Golmer("golmer34");
		g34.setPosition(new Vector2f(172, 12));
		g34.addComponent(new ImageRenderComponent("golmerTexture", new Image("hm/src/textures/Golmers.png")));
		g35 = new Golmer("golmer35");
		g35.setPosition(new Vector2f(140, 12));
		g35.addComponent(new ImageRenderComponent("golmerTexture", new Image("hm/src/textures/Golmers.png")));
		g36 = new Golmer("golmer36");
		g36.setPosition(new Vector2f(108, 12));
		g36.addComponent(new ImageRenderComponent("golmerTexture", new Image("hm/src/textures/Golmers.png")));
		g37 = new Golmer("golmer37");
		g37.setPosition(new Vector2f(76, 12));
		g37.addComponent(new ImageRenderComponent("golmerTexture", new Image("hm/src/textures/Golmers.png")));
		g38 = new Golmer("golmer38");
		g38.setPosition(new Vector2f(44, 12));
		g38.addComponent(new ImageRenderComponent("golmerTexture", new Image("hm/src/textures/Golmers.png")));
		
		cl1 = new CollisionLine(1, 3, new Vector2f(268, 236), new Vector2f(396, 236));
		cl1.createCollisionRule(pl, false);
		cl2 = new CollisionLine(2, 2, new Vector2f(236, 396), new Vector2f(396, 396));
		cl2.createCollisionRule(pl, false);
		cl3 = new CollisionLine(3, 1, new Vector2f(236, 268), new Vector2f(236, 396));
		cl3.createCollisionRule(pl, false);
		cl4 = new CollisionLine(4, 0, new Vector2f(396, 236), new Vector2f(396, 396));
		cl4.createCollisionRule(pl, false);
		cl5 = new CollisionLine(5, 2, new Vector2f(204, 268), new Vector2f(236, 268));
		cl5.createCollisionRule(pl, false);
		cl6 = new CollisionLine(6, 1, new Vector2f(204, 236), new Vector2f(204, 268));
		cl6.createCollisionRule(pl, false);
		cl7 = new CollisionLine(7, 2, new Vector2f(172, 236), new Vector2f(204, 236));
		cl7.createCollisionRule(pl, false);
		cl8 = new CollisionLine(8, 1, new Vector2f(172, 204), new Vector2f(172, 236));
		cl8.createCollisionRule(pl, false);
		cl9 = new CollisionLine(9, 2, new Vector2f(44, 204), new Vector2f(172, 204));
		cl9.createCollisionRule(pl, false);
		cl10 = new CollisionLine(10, 1, new Vector2f(44, 44), new Vector2f(44, 204));
		cl10.createCollisionRule(pl, false);
		cl11 = new CollisionLine(11, 3, new Vector2f(44, 44), new Vector2f(204, 44));
		cl11.createCollisionRule(pl, false);
		cl12 = new CollisionLine(12, 0, new Vector2f(204, 44), new Vector2f(204, 172));
		cl12.createCollisionRule(pl, false);
		cl13 = new CollisionLine(13, 3, new Vector2f(204, 172), new Vector2f(236, 172));
		cl13.createCollisionRule(pl, false);
		cl14 = new CollisionLine(14, 0, new Vector2f(236, 172), new Vector2f(236, 204));
		cl14.createCollisionRule(pl, false);
		cl15 = new CollisionLine(15, 3, new Vector2f(236, 204), new Vector2f(268, 204));
		cl15.createCollisionRule(pl, false);
		cl16 = new CollisionLine(16, 0, new Vector2f(268, 204), new Vector2f(268, 236));
		cl16.createCollisionRule(pl, false);
		cl17 = new CollisionLine(17, 3, new Vector2f(r1.getRange("-").x, r1.getRange("+").y), new Vector2f(r1.getRange("+").x, r1.getRange("+").y));
		cl17.createCollisionRule(pl, false);
		
	}	
	@Override
	public void render(GameContainer gc, StateBasedGame sb, Graphics gr)
			throws SlickException {
		Range r = new Range(pl);
    	Range r1 = new Range(enemy);
		pl.render(gc, sb, gr);
		enemy.render(gc, sb, gr);
		g1.render(gc, sb, gr);
		g2.render(gc, sb, gr);
		g3.render(gc, sb, gr);
		g4.render(gc, sb, gr);
		g5.render(gc, sb, gr);
		g6.render(gc, sb, gr);
		g7.render(gc, sb, gr);
		g8.render(gc, sb, gr);
		g9.render(gc, sb, gr);
		g10.render(gc, sb, gr);
		g11.render(gc, sb, gr);
		g12.render(gc, sb, gr);
		g13.render(gc, sb, gr);
		g14.render(gc, sb, gr);
		g15.render(gc, sb, gr);
		g16.render(gc, sb, gr);
		g17.render(gc, sb, gr);
		g18.render(gc, sb, gr);
		g19.render(gc, sb, gr);
		g20.render(gc, sb, gr);
		g21.render(gc, sb, gr);
		g22.render(gc, sb, gr);
		g23.render(gc, sb, gr);
		g24.render(gc, sb, gr);
		g25.render(gc, sb, gr);
		g26.render(gc, sb, gr);
		g27.render(gc, sb, gr);
		g28.render(gc, sb, gr);
		g29.render(gc, sb, gr);
		g30.render(gc, sb, gr);
		g31.render(gc, sb, gr);
		g32.render(gc, sb, gr);
		g33.render(gc, sb, gr);
		g34.render(gc, sb, gr);
		g35.render(gc, sb, gr);
		g36.render(gc, sb, gr);
		g37.render(gc, sb, gr);
		g38.render(gc, sb, gr);
		cl1.drawLine(gr);
		cl2.drawLine(gr);
		cl3.drawLine(gr);
		cl4.drawLine(gr);
		cl5.drawLine(gr);
		cl6.drawLine(gr);
		cl7.drawLine(gr);
		cl8.drawLine(gr);
		cl9.drawLine(gr);
		cl10.drawLine(gr);
		cl11.drawLine(gr);
		cl12.drawLine(gr);
		cl13.drawLine(gr);
		cl14.drawLine(gr);
		cl15.drawLine(gr);
		cl16.drawLine(gr);
		if(!enemy.checkDestroyed()){
			cl17.drawLine(gr);
		}
	}

	@SuppressWarnings("static-access")
	@Override
	public void update(GameContainer gc, StateBasedGame sb, int delta)
			throws SlickException {
		if(startBall == true){
    		delta = temporaryDelta;
    		in.resume();
    		temporaryDelta = 0;
    		((FreeMovement) pl.getComponent("movement")).resetDirection();
    		in = new Input(600);
    		if(in.isKeyDown(in.KEY_W)){
    			System.out.println("fuck this input");
    		}
    		if(in.isKeyDown(in.KEY_A)){
    			System.out.println("fuck this input even more");
    		}
    		startBall = false;
    	}
		in = gc.getInput();
		Range r = new Range(pl);
		Range r1 = new Range(enemy);
		if(isFighting == false){
			//Notice this line
			//It updates all it components like moving
			//You can see initialized components in the init method
			pl.update(gc, sb, delta);
		}
		else{
			positionHold = pl.getPosition();
		}
		enemy.update(gc, sb, delta);
		Vector2f mousePosition = new Vector2f(in.getMouseX(), in.getMouseY()); 
		if(in.isMousePressed(in.MOUSE_LEFT_BUTTON)){
			pl.setPosition(mousePosition);
		}
		else{}
		if(cl4.checkCollisionRules(pl) || cl12.checkCollisionRules(pl) || cl14.checkCollisionRules(pl) || cl16.checkCollisionRules(pl)){
			pl.canMoveRight = false;
		}
		else{
			pl.canMoveRight = true;
		}
		if(cl3.checkCollisionRules(pl) || cl6.checkCollisionRules(pl) || cl8.checkCollisionRules(pl) || cl10.checkCollisionRules(pl)){
			pl.canMoveLeft = false;
    	}
    	else{
    		pl.canMoveLeft = true;
    	}
    	
    	if(cl1.checkCollisionRules(pl) || cl11.checkCollisionRules(pl) || cl13.checkCollisionRules(pl) || cl15.checkCollisionRules(pl)){
    		pl.canMoveUp = false;
    	}
    	else{
    		pl.canMoveUp = true;
    	}
    	
    	if(cl2.checkCollisionRules(pl) || cl5.checkCollisionRules(pl)  || cl7.checkCollisionRules(pl) || cl9.checkCollisionRules(pl)){
    		pl.canMoveDown = false;
    	}
    	else{
    		pl.canMoveDown = true;
    	}
    	if(!enemy.checkDestroyed() && r.getRange("-").y <= r1.getRange("+").y){
    		
    		isFighting = true;
    		temporaryDelta = delta;
    		pl.canMoving = false;
    		in.pause();
    		Battle battle = new Battle(1);
        	battle.enter(gc, sb);
        	battle.startBattle();
        	while(isFighting == true){
            	battle.update(gc, sb, delta);
        	}
        	startBall = true;
    		pl.canMoving = true;
    	}
	}
	
	public static Player getPlayer(){
		return pl;
	}
	
	public static Enemy getEnemy(){
		return enemy;
	}

	@Override
	public int getID() {
		return 0;
	}

}
