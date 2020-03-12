package dcc;

import javax.swing.JOptionPane;
import java.util.*;

import tools.Diceroller;

public class Cleric extends CharacterDCC{
	public String god;
	public String[] spellbook;
	public int favour;
	public Scanner tastatur;
	
	public Cleric(int str, int agi,int sta, int per,int itl, int lck, int hp, int maxHP, Armor armor, int ac, boolean shield, int randomizer, String name, int money,Weapon weapon) {
		super(str, agi,sta, per,itl, lck, hp, maxHP, armor, ac, shield, randomizer, name, money,weapon); 
		occupation = "Cleric";
		gainHp(8);
		lvl = 1;
		
	//	System.out.println("Choose your god");
	//	god = tastatur.nextLine(); 
	//	spellbook = divineSpells(god);
 
}
	public Cleric(int str, int agi,int sta, int per,int itl, int lck, int hp, int maxHP, Armor armor, int ac, boolean shield, int randomizer, String name, int money,Weapon weapon,int xp,int atkMod,int lvl) {
		super(str, agi,sta, per,itl, lck, hp, maxHP, armor, ac, shield, randomizer, name, money,weapon); 
		this.lvl = lvl-1;
		levelUp();
		this.maxHp = maxHP;
		this.hp = hp;
}
	public String toString() {
		return name + " the Cleric , lvl " + lvl + " wielding a " + weapon.getName() + " wearing " + armor.getName() + " with " +maxHp + " hp ";
	}
	
	public String[] divineSpells(String god) {
		return null;
	}
	
	public void levelUp() {
		gainHp(8);
		lvl++;
		
		switch (lvl) {
		case 2: ;break;
		case 3: ;break;
		case 4: ;break;
		case 5: ;break;
		case 6: ;break;
		case 7: ;break;
		case 8: ;break;
		case 9: ;break;
		case 10: ;break;
		default: break;
		}
	}
	public void heal(CharacterDCC friend) {
		int roll = Diceroller.dx(1,8);
		friend.setHp(friend.getHp() + roll);
		if (friend.getHp() > friend.getMaxHp()) {
			friend.setHp(friend.getMaxHp());
		}
		
	}
}