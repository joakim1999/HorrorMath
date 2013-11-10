package hm.src.weapons;

public class Weapon{
	String name;
	int weaponDamage;
	String weaponType;
	public Weapon(String name, int weaponDamage, String weaponType){
		this.name = name;
		this.weaponDamage = weaponDamage;
		this.weaponType = weaponType;
	}
	
	public int getWeaponDamage(){
		return weaponDamage;
	}
	
	public String getWeaponType(){
		return weaponType;
	}
}
