package dcc;
import java.io.*;
import java.util.*;


public class PortalUnderTheStars {
	
	public static void main(String[] args) {
	
	Scanner tastatur = new Scanner(System.in);
	Bestiary monsters = Bestiary.populate();
	
	Party testParty = Hjelpeklasse.loadParty(tastatur);
	
	Monster monster1 = monsters.findMonster("Goblin");
	
	Mob testMob = new Mob(monster1,4);
	
	System.out.println("While walking through the forest you encounter 4 Goblins. They attack you");
	
	Encounter testEnc = new Encounter(testParty,testMob);
	
	testEnc.melee2(tastatur);
	
	testParty.levelUpLvl0();
	
	System.out.println("Name of savefile");
	String filnavn = tastatur.nextLine();
	
	Fil.skrivTilFil(testParty, filnavn);
	
}
}
