package dcc;

import java.io.*;

public class Mob {
	
	Monster[] monsters;
	int antall;
	
	public Mob(Monster monster, int amount) {
		monsters = new Monster[amount];
		for (int i = 0; i< amount; i++) {
			monsters[i] = new Monster(monster.getName() + " " + i, monster.getAtkBonus(), monster.getDmgDie(), monster.getAmountDie(), monster.getHp(), monster.getHitDie(), monster.getAc());
		}
		antall = amount;
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