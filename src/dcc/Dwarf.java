package dcc;

import tools.Diceroller;

public class Dwarf extends CharacterDCC{

	
	private int deedDie;
	public String chosenWeapon;
	private int deedBonus;
	public int critrange;
	
	public Dwarf(int str, int agi,int sta, int per,int itl, int lck, int hp, int maxHP, Armor armor, int ac, boolean shield, int randomizer, String name, int money,Weapon weapon) {
		super(str, agi,sta, per,itl, lck, hp, maxHP, armor, ac, shield, randomizer, name, money,weapon);
		super.setMaxHp( maxHP + Diceroller.d10(1) + staMod);
		super.setHp  (super.getMaxHp());
		lvl = 1;
		deedDie=3;
		this.setWeapon(weapon);
		this.deedBonus = 0;
		critrange = 2;
	}
}
