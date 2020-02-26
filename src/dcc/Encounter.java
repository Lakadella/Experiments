package dcc;

import tools.Diceroller;

public class Encounter {
	private Mob mob;
	private Party party;
	private Combat[] melee;
	private CharacterDCC[] group;
	private Monster[] monsters;
	private int antallmonster;
	private int antallchars;
	private int xpValue;

	public Encounter(Party party, Mob mob) {
		this.party = party;
		this.mob = mob;
		melee = new Combat[party.getGroup().length + mob.getMonsters().length];
		group = party.getGroup();
		monsters = mob.getMonsters();
		antallmonster = monsters.length;
		antallchars = group.length;
	}

	
	
	public void melee() {
		boolean alldead = false;
		while (antallchars > 0 && antallmonster > 0) {
			for (int i = 0; i< antallchars; i++) {
				int tilf = (Diceroller.dx(1, antallmonster)) -1;
				if (tilf >= 0 && group[i] != null && monsters[tilf] != null  ) {
					int dmg = group[i].attack(monsters[tilf]);
					monsters[tilf].setHp(monsters[tilf].getHp() - dmg);
					if (monsters[tilf].getHp() <= 0) {
						monsterDeath(tilf);
					}
					
				}
			}
			for (int j = 0; j<antallmonster; j++) {
				int tilf2 = (Diceroller.dx(1, antallchars))-1;
				if(monsters[j] != null && group[tilf2] != null) {
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
		for (int i = indeks; i< antallmonster-1; i++ ) {
			monsters[i] = monsters[i +1];
		}
		//monsters[antallmonster] = null;
		antallmonster--;
	}
	public void characterDeath(int indeks) {
		System.out.println(group[indeks].getName() + " is dead");
		for (int i = indeks; i< antallchars-1; i++ ) {
			group[i] = group[i +1];
		}
		//group[antallchars] = null;
		antallchars--;
	}
	
}
