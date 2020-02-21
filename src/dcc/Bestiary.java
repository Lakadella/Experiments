package dcc;

public class Bestiary {
	
	private Monster[] monsters;
	private int antall;
	
	public Bestiary(int antall) {
		monsters = new Monster[antall];
		antall = 0;
	}
	
	public void addMonster(Monster ny) {
		if (antall == monsters.length-1) {
			monsters = utvid();
		}
		monsters[antall] = ny;
		antall++;		
	}
	
	public Monster[] utvid() {
		Monster[] nyTab = new Monster[monsters.length * 2];
		
		for (int i  = 0; i< monsters.length; i++) {
			nyTab[i] = monsters[i];
		}
		return nyTab;
	}
	
	public Monster findMonster(String name) {
		for (Monster m : monsters) {
			if (m.getName() == name) {
				return m;
			}
		}
		return null;
	}
	
	public Bestiary populate() {
		Bestiary temp = new Bestiary(45);
		Monster android = new Monster("Android",-2,2,1,8,0,18,3,8,12,5,-2,6,true,"Regeneration2");
		temp.addMonster(android);
		Monster antWorker = new Monster("Ant, giant (worker)",0,2,1,4,1,16,1,8,2,5,1,-3);
		temp.addMonster(antWorker);
		Monster antSoldier = new Monster("Ant, giant (soldier)",2,6,3,4,3,18,3,8,6,7,3,-3,true,"Poison");
		temp.addMonster(antSoldier);
		
		
		
		/*String name, 
		 * int intitiativeMod, 
		 * int atkBonus, 		 * 
		 *int amountDie, 
		 *int dmgDie, 
		 *int dmgMod, 
		 *int ac,   
		 *int hitDieAmount, 
		 *int hitDie,
		 *int hpBonus,  
		 *int fortSave, 
		 *int refSave,
		 *int willSave, 
		 *boolean special, 
		 *String ability
		
		*/
		return temp;
	}
	
}
