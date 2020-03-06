package dcc;

import javax.swing.JOptionPane;

import tools.Diceroller;

public class Cleric extends CharacterDCC{
	public String god;
	public String[] spellbook;
	public int favour;
	
	public Cleric(int str, int agi,int sta, int per,int itl, int lck, int hp, int maxHP, Armor armor, int ac, boolean shield, int randomizer, String name, int money,Weapon weapon) {
		super(str, agi,sta, per,itl, lck, hp, maxHP, armor, ac, shield, randomizer, name, money,weapon); 
		occupation = "Cleric";
		gainHp(8);
		lvl = 1;
		god = JOptionPane.showInputDialog("Choose your god");
		spellbook = divineSpells(god);
 
}
	public Cleric(int str, int agi,int sta, int per,int itl, int lck, int hp, int maxHP, Armor armor, int ac, boolean shield, int randomizer, String name, int money,Weapon weapon,int xp,int atkMod,int lvl) {
		super(str, agi,sta, per,itl, lck, hp, maxHP, armor, ac, shield, randomizer, name, money,weapon); 
 
}
	public String toString() {
		return name + " the Cleric , lvl " + lvl + " wielding a " + weapon.getName() + " wearing " + armor.getName() + " with " +maxHp + " hp ";
	}
	
	public String[] divineSpells(String god) {
		return null;
	}
	
	public void levelUp() {
		gainHp(8);
	}
	public void heal(CharacterDCC friend) {
		int roll = Diceroller.dx(1,8);
		friend.setHp(friend.getHp() + roll);
		if (friend.getHp() > friend.getMaxHp()) {
			friend.setHp(friend.getMaxHp());
		}
		
	}
}