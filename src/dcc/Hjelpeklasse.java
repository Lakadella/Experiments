package dcc;

import java.util.Scanner;

public class Hjelpeklasse {

	Scanner tastatur;
	
	public static Party loadParty(Scanner tastatur) {
			
	Party player = new Party();	
	String filnavn;
	int valg;	
	boolean avslutt = false;
	
	System.out.println("press 1 for new party, 2 to load party");
	valg = Integer.parseInt(tastatur.nextLine());
	
	switch(valg) {
	case 1 : System.out.println("How many characters?");valg =Integer.parseInt(tastatur.nextLine()); player = Party.newParty(valg); System.out.println("Name of file"); filnavn = tastatur.nextLine();break;
	case 2 : System.out.println("Name of file"); filnavn = tastatur.nextLine();player = Fil.lesFraFil(filnavn);break;
	default : System.out.println("Noe gikk galt"); break;
	}
		
	return player;
	}
	
	
}
