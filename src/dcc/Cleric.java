package dcc;

public class Cleric extends CharacterDCC{
	public String god;
	public String[] spellbook;
	public int favour;
	
	public Cleric(int str, int agi,int sta, int per,int itl, int lck, int hp, int maxHP, Armor armor, int ac, boolean shield, int randomizer, String name, int money,Weapon weapon) {
		super(str, agi,sta, per,itl, lck, hp, maxHP, armor, ac, shield, randomizer, name, money,weapon); 
 
}
	public String toString() {
		return name + " the Cleric , lvl " + lvl + " wielding a " + weapon.getName() + " wearing " + armor.getName() + " with " +maxHp + " hp ";
	}
}