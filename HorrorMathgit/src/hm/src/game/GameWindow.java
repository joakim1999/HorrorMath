package hm.src.game;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

public class GameWindow extends StateBasedGame{
	public static boolean isInBattle = false;
	public static int testLevelState = 0;
	public static int battleState = 1;

	public GameWindow(String name) {
		super(name);
		this.addState(new TestLevel(testLevelState));
		this.addState(new Battle(battleState));
	}
	
	@Override
	public void initStatesList(GameContainer gc) throws SlickException {
		this.getState(testLevelState).init(gc, this);
		this.getState(battleState).init(gc, this);
    	this.enterState(testLevelState);
	}
	
	public static void main(String args[])
            throws SlickException
    {
         AppGameContainer app = new AppGameContainer(new GameWindow("Horror Math Superalpha"));
         app.setDisplayMode(800, 600, false);
         app.start();
    }
}
