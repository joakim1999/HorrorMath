package hm.src.combat;

import hm.src.engine.entity.Enemy;

import java.util.Random;

public class EnemyCombat{
	int damage;
	int health;
	int maxDamage;
	Enemy en;
	
	public EnemyCombat(Enemy en){
		maxDamage = 3;
		health = 5;
		Random rand = new Random();
		damage = rand.nextInt(maxDamage);
	}

	public int getDamage() {
		return damage;
	}
	
	public int decreaseHealth(int amount){
		return health -= amount;
	}
	
	public int getHealth(){
		return health;
	}
}
