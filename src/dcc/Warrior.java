package dcc;

import tools.Diceroller;

public class Warrior extends CharacterDCC{
	
	private int lvl;
	private int deedDie;
	
	public Warrior(int str, int agi,int sta, int per,int itl, int lck, int hp, int maxHP, Armor armor, int ac, boolean shield, int randomizer, String name, int money) {
		super(str, agi,sta, per,itl, lck, hp, maxHP, armor, ac, shield, randomizer, name, money);
		super.setMaxHp( maxHP + Diceroller.d12(1) + staMod);
		lvl = 1;
		deedDie=3;
	}

}
