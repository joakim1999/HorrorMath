package hm.src.combat;

import hm.src.MathMaker;
import hm.src.engine.entity.Player;
import hm.src.game.TestLevel;
import hm.src.weapons.Weapon;

public class PlayerCombat {
	Weapon defaultWeapon;
	int health = 5;
	int damage;
	Player pl;
	
	public PlayerCombat(){
		pl = TestLevel.getPlayer();
		defaultWeapon = pl.defaultWeapon;
		damage = defaultWeapon.getWeaponDamage();
	}
	
	public Weapon getDefaultWeapon(){
		return defaultWeapon;
	}
	
	public int getHealth(){
		return health;
	}
	
	public void decreaseHealth(int amount){
		health -= amount;
	}
	
	public int getDamage(){
		MathMaker mm = new MathMaker();
		if(mm.make()){
			return damage + mm.getMathDamage();
		}
		return damage;
	}
}
