package dcc;

public class Halfling extends CharacterDCC{
	
	public boolean dualWield;
	public Weapon offHand;
	
	public Halfling(int str, int agi,int sta, int per,int itl, int lck, int hp, int maxHP, Armor armor, int ac, boolean shield, int randomizer, String name, int money,Weapon weapon) {
		super(str, agi,sta, per,itl, lck, hp, maxHP, armor, ac, shield, randomizer, name, money,weapon); 
		dualWield = false;
		offHand = armoury.findWeapon("");
		lvl = 1;
		super.gainHp(6);
		occupation = "Halfling";
	}
	
	public Halfling(int str, int agi,int sta, int per,int itl, int lck, int hp, int maxHP, Armor armor, int ac, boolean shield, int randomizer, String name, int money,Weapon weapon,int xp,int atkMod,int lvl) {
		super(str, agi,sta, per,itl, lck, hp, maxHP, armor, ac, shield, randomizer, name, money,weapon); 
	}
	
	public String toString() {
		return name + " the Halfling , lvl " + lvl + " wielding a " + weapon.getName() + " wearing " + armor.getName() + " with " +maxHp + " hp ";
	}
}
