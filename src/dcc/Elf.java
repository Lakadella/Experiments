package dcc;

public class Elf extends CharacterDCC {

	public String[] spellbook;
	public String patron;
	
	
	public Elf(int str, int agi,int sta, int per,int itl, int lck, int hp, int maxHP, Armor armor, int ac, boolean shield, int randomizer, String name, int money,Weapon weapon) {
		super(str, agi,sta, per,itl, lck, hp, maxHP, armor, ac, shield, randomizer, name, money,weapon); 
	
}
	public String toString() {
		return name + " the Elf , lvl " + lvl + " wielding a " + weapon.getName() + " wearing " + armor.getName() + " with " +maxHp + " hp ";
	}
}