package dcc;

import java.io.*;

public class Mob {
	
	Monster[] monsters;
	int antall;
	
	public Mob(Monster monster, int amount) {
		monsters = new Monster[amount];
		for (int i = 0; i< amount; i++) {
			monsters[i] = new Monster(monster.getName() + " " + i,monster.getInitiativeMod(), monster.getAtkBonus(),monster.getAmountDie(), monster.getDmgDie(), monster.getDmgMod(),  monster.getAc(), monster.getHitDieAmount(),monster.getHitDie(), monster.getHpBonus(),monster.getFortSave(),monster.getRefSave(),monster.getWillSave());
		}
		antall = amount;
		
		//String name, int intitiativeMod, int atkBonus, int amountDie, int dmgDie, int dmgMod, int ac,   																							 int hitDieAmount, int hitDie,int hpBonus,  int fortSave, int refSave,int willSave
	}

	public Monster[] getMonsters() {
		return monsters;
	}

	public void setMonsters(Monster[] monsters) {
		this.monsters = monsters;
	}
		
	public void listMonsters() {
		for (Monster m : monsters) {
			System.out.println(m.getName());
		}
	}
	public int getAntall() {
		return antall;
	}

	public void setAntall(int antall) {
		this.antall = antall;
	}

	public void deadMonster(Monster monster) {
	
	
		
		for (int i = 0; i<antall; i++) {
			if (monsters[i]==monster) {
				for(int k = i; k<monsters.length;k++) {
					monsters[k] = monsters[k+1];
				}						
			}
			monsters[antall] = null;
			antall --; 
		}
	}
}