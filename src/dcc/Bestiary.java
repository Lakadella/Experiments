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
	
	public static Bestiary populate() {
		Bestiary temp = new Bestiary(45);
		Monster android = new Monster("Android",-2,2,1,8,0,18,3,8,12,5,-2,6,true,"Regeneration2");
		temp.addMonster(android);
		Monster antWorker = new Monster("Ant, giant (worker)",0,2,1,4,1,16,1,8,2,5,1,-3);
		temp.addMonster(antWorker);
		Monster antSoldier = new Monster("Ant, giant (soldier)",2,6,3,4,3,18,3,8,6,7,3,-3,true,"Poison");
		temp.addMonster(antSoldier);
		Monster antQueen = new Monster("Ant, giant (queen)",-4,0,1,3,0,12, 5,8,10,4,-4,8);
		temp.addMonster(antQueen);
		Monster apeMan = new Monster("Jungle ape-man",2,4,1,4,3,13,3,8,0,6,3,1);
		temp.addMonster(apeMan);
		Monster fourArmedApe = new Monster("Four-armed ape-man",3,6,1,6,5,15,6,8,0,10,6,2);
		temp.addMonster(fourArmedApe);
		Monster whiteApe = new Monster("White ape-man",1,5,1,4,2,12, 2,8,0,5,3,4);
		temp.addMonster(whiteApe);
		Monster bigApe = new Monster("Giant ape-man",1,12,2,6,10,17, 8,8,10,14,8,6);
		temp.addMonster(bigApe);
		Monster basilisk = new Monster("Basilisk" ,1,5,1,10,0,16,5,8,0,6,1,1,true,"Petrify");
		temp.addMonster(basilisk);
		Monster batSwarm = new Monster("Bat swarm, mundane",4,1,1,3,0,10,2,8,0,0,10,-2,true,"Disease");
		temp.addMonster(batSwarm);
		Monster vampBatSwarm = new Monster("Bat swarm, vampiric",6,3,1,4,0,12, 4,8,0,1,10,-2,true,"Disease");
		temp.addMonster(vampBatSwarm);
		Monster giatnBat = new Monster("Bat, giant vampire",6,4,1,6,0,14,2,8,0,4,4, -2,true,"Disease");
		temp.addMonster(giatnBat);
		Monster fireBeetle = new Monster("Firebeetle, giant",-2,3,1,4,2,15,2,8,2,1,0 ,-3);
		Monster stagBeetle = new Monster("Stagbeetle, giant",-2,6,2,6,4,15,2,8,2,1,0 ,-3);
		Monster spittingBeetle = new Monster("Spitting Beetle, giant",-2,3,1,6,0,15,2,8,2,1,0 ,-3);
		Monster flyingBeetle = new Monster("Flying Beetle, giant",-2,3,1,4,2,15,2,8,2,1,0 ,-3);
		Monster spinyBeetle = new Monster("Spiny Beetle, giant",-2,3,1,4,2,15,2,8,2,1,0 ,-3);
		Monster armoredBeetle = new Monster("Armored Beetle, giant",-2,3,1,4,2,20,2,8,2,1,0 ,-3);
		temp.addMonster(fireBeetle);
		temp.addMonster(stagBeetle);
		temp.addMonster(spittingBeetle);
		temp.addMonster(flyingBeetle);
		temp.addMonster(spinyBeetle);
		temp.addMonster(armoredBeetle);
		
		
		/*String name, 
		 *int intitiativeMod, 
		 *int atkBonus, 		 * 
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
