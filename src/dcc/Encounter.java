package dcc;

import tools.Diceroller;
import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;

public class Encounter {
	private Mob mob;
	private Party party;
	private Combat[] melee;
	private CharacterDCC[] group;
	private Monster[] monsters;
	private int antallmonster;
	private int antallchars;
	private int xpValue;
	public Scanner tastatur;
	public boolean visited;
	public boolean cleared;

	public Encounter(Party party, Mob mob) {
		this.party = party;
		this.mob = mob;
		melee = new Combat[party.getGroup().length + mob.getMonsters().length];
		group = party.getGroup();
		monsters = mob.getMonsters();
		antallmonster = monsters.length;
		antallchars = group.length;
		visited = false;
		cleared = false;
	}
	
	public Encounter(Party party) {
		this.party=party;
		group = party.getGroup();
		visited = false;
		cleared = false;
		
	}
	
	

	public void melee() {
		boolean alldead = false;
		while (antallchars > 0 && antallmonster > 0) {
			for (int i = 0; i < antallchars; i++) {
				int tilf = (Diceroller.dx(1, antallmonster)) - 1;
				if (tilf >= 0 && group[i] != null && monsters[tilf] != null) {
					int dmg = group[i].attack(monsters[tilf]);
					monsters[tilf].setHp(monsters[tilf].getHp() - dmg);
					if (monsters[tilf].getHp() <= 0) {
						monsterDeath(tilf);
					}

				}
			}
			for (int j = 0; j < antallmonster; j++) {
				int tilf2 = (Diceroller.dx(1, antallchars)) - 1;
				if (monsters[j] != null && group[tilf2] != null) {
					int dmg = monsters[j].attack(group[tilf2]);
					group[tilf2].setHp(group[tilf2].getHp() - dmg);
					if (group[tilf2].getHp() <= 0) {
						characterDeath(tilf2);
					}
				}
			}
			if (antallmonster <= 0 || antallchars <= 0) {
				alldead = true;
			}
		}

	}

	public void monsterDeath(int indeks) {
		System.out.println(monsters[indeks].getName() + " is dead");
		for (int i = indeks; i < antallmonster - 1; i++) {
			monsters[i] = monsters[i + 1];
		}
		monsters[antallmonster-1] = null;
		antallmonster--;
	}

	public void characterDeath(int indeks) {
		System.out.println(group[indeks].getName() + " is dead");
		for (int i = indeks; i < antallchars - 1; i++) {
			group[i] = group[i + 1];			
		}
		group[antallchars-1] = null;
		antallchars--;
		party.setMembers(party.getMembers() -1);
	}

	public void melee2(Scanner tastatur) {
		boolean alldead = false;
		boolean run = false;
		int[] initiative = new int[party.members];
		int monsterInt = Diceroller.d20(1) + monsters[0].initiativeMod;
		for (int i = 0; i < antallchars; i++) {
			initiative[i] = Diceroller.d20(1) + group[i].initiativeMod;

		}

		while (antallchars > 0 && antallmonster > 0 && !alldead && !run) {
			for (int k = 0; k < party.members; k++) {
				if (group[k] != null && initiative[k] >= monsterInt) {
					group[k].combatAction(tastatur, mob);
				}
			}
			monstersAttack();
			for (int k = 0; k < party.members; k++) {
				if (group[k] != null && initiative[k] < monsterInt ) {
					group[k].combatAction(tastatur, mob);
				}
			}
		}

	}

	public void combatAction(Scanner tastatur, CharacterDCC person) {
		System.out.println("What do you want to do? 1. attack 2. run");
		int valg = Integer.parseInt(tastatur.nextLine());
		switch (valg) {
		case 1:
			mob.listMonsters();
			System.out.println("Who do you want to attack?");
			int target = Integer.parseInt(tastatur.nextLine());
			int dmg = person.attack(monsters[target]);
			if(monsters[target] != null) {
			monsters[target].setHp(monsters[target].getHp() - dmg);
			if (monsters[target].getHp() <= 0) {
				monsterDeath(target);}}
			break;
		case 2:
			System.out.println(person.getName() + " tries to run");
			break;
		default:
			break;
		}

	}

	public void monstersAttack() {
		for (int j = 0; j < antallmonster; j++) {
			int tilf2 = (Diceroller.dx(1, antallchars)) - 1;
			if (monsters[j] != null && group[tilf2] != null) {
				int dmg = monsters[j].attack(group[tilf2]);
				
				group[tilf2].setHp(group[tilf2].getHp() - dmg);
				if (group[tilf2].getHp() <= 0) {
					characterDeath(tilf2);
				}
			}
		}
	}
	
	public void randomTrapRef(int CR, int dmg) {
		int dmg2 = dmg;
		int tilf = Diceroller.dx(1,party.getMembers()-1);
		if (group[tilf].reflex(CR)) { dmg2 = dmg2/2;}
		group[tilf].setHp(group[tilf].getHp() - dmg2);
		System.out.println(group[tilf].getName() + " triggers a trap and takes " +dmg2 + " dmg");
		if(group[tilf].getHp() < 1) {characterDeath(tilf);}
		
	}

}
