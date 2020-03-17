package dcc;

import java.util.Scanner;

import tools.Diceroller;

public class TombOfTheGhastQueen {
	public static Scanner tastatur;
	public static Encounter room1;
	public static Encounter room2;
	public static Encounter room3;
	public static Encounter room4;
	public static Encounter room5;
	public static Encounter room6;
	public static Encounter room7;
	public static Encounter room8;
	public static Encounter room9;
	public static Encounter room10;
	public static Encounter room11;
	public static Encounter room12;
	public static Encounter room13;
	public static Party testParty;
	public static int gemCounter;

	public static void main(String[] args) {

		tastatur = new Scanner(System.in);
		gemCounter = 0;
		boolean abort = false;

		prepare();

		System.out.println(
				"You will take on the roles of some of the petitioners seeking freedom by “Running the Gauntlet”.  You are lead to a small mountain that overlooks the Capital city");
		System.out.println(
				"and the rock quarry that you have been serving as prisoners.  At the top of the mountain you find an elevator shaft and a rickety elevator carriage that is raised and ");
		System.out.println("lowered by a pair of Minotaur on a winch.");
		System.out.println(
				"You are lowered into the darkness and torches are lit.  The elevator shaft descends a hundred feet into the mountain where you are led by your guards through a temple ");
		System.out.println(
				"to a God that looks after souls of the dead into a twenty by forty foot room with a large pool of water about a foot deep is located. ");
		System.out.println(
				"The lead guard tells you that the five petitioners that are freed will be those that find one of the five gems that combine to make the “Hand of the Lich”,");
		System.out.println(
				"a sculpture dedicated to the Queen.  Once those five gems are located and all other petitioners are dead the elevator will return to take them to freedom. ");
		System.out.println(
				"He then reads some strange words from a scroll.  As the final word is read the entire group falls into unconsciousness");
		System.out.println("");

		while (gemCounter < 5 && !abort && testParty.members > 0) {

			room1();

		}

	}

	public static void prepare() {
		testParty = Hjelpeklasse.loadParty(tastatur);
		Monster servitor = new Monster("Servitor from beyond the stars", 0, 4, 1, 4, 0, 12, 2, 8, 4, 2, 0, 6);
		room1 = new Encounter(testParty);
		room2 = new Encounter(testParty);
		room3 = new Encounter(testParty);
		Mob mob4 = new Mob(servitor,1);
		room4 = new Encounter(testParty,mob4);
		Monster hollow = new Monster("Togs",0,2,1,4,0,12,2,8,0,1,2,6);
		Mob mob5 = new Mob(hollow,1);
		room5 = new Encounter(testParty,mob5);
		Monster frogman = new Monster("Toadman",2,4,1,4,1,13, 2,8,0,1,3,0);
		Mob mob6 = new Mob(frogman,2);
		room6 = new Encounter(testParty,mob6);
		room7 = new Encounter(testParty);
		room8 = new Encounter(testParty);
		room9 = new Encounter(testParty);
		room10 = new Encounter(testParty);
		room11 = new Encounter(testParty);
		room12 = new Encounter(testParty);
		room13 = new Encounter(testParty);
	}

	public static void room1() {
		if (room1.visited != true) {
			System.out.println("You wake up in the room with all your gear");
			room1.visited = true;
		}

		System.out.println("The room is about 40 x 40 feet, with corridors heading in 3 directions");
		System.out.println("press 1 to search the room. 2 to go north. 3 to go west. 4 to go east. 5 to go south");

		switch (tastatur.nextInt()) {
		case 1:
			System.out.println("You find nothing of interest");
			room1();
			break;
		case 2:
			room2();
			break;
		case 3:
			room4();
			break;
		case 4:
			room7();
			break;
		case 5:
			room10();
			break;
		default:
			room1();
			break;
		}
		// choices
	}

	// room 1 - just text
	// connects 2,4,7,10

	// room 2 - fall trap
	// connects 1,3
	public static void room2() {
		if (room2.visited != true) {
			System.out.println(
					"This is a corridor about 25 feet long. The floor seems to be broken, and there seems to be another floor beneath this one");
			room2.visited = true;
		}
		if (room2.cleared != true) {
			System.out.print("Press 1 to take a look at the lower floor. ");
		}
		System.out.println("2 to go north. 3 to go south.");

		switch (tastatur.nextInt()) {

		case 1:			
			int dmg = Diceroller.d6(1);
			room2.randomTrapRef(11,dmg);
			room2.cleared = true;
			room2();
		case 2:
			room3();
			break;
		case 3:
			room1();
			break;
		default:
			room2();
			break;

		}

	}

	// room 3 -just text
	// connects 2
	public static void room3() {
		if (room3.visited != true) {
			// text first time in room
			room3.visited = true;
		}
		System.out.println("You see an elevator shaft, however it seems impossible to climb");
		System.out.println("1 to search the room. 2 to return to the corridor");
		
		switch(tastatur.nextInt()) {
		case 1 : System.out.println("You find nothing of interest"); room3(); break;
		case 2 : room2();break;
		
		}
	}

	// room 4 - Servitor from beyond the stars
	// connects 1,5,6
	public static void room4() {
		if (room4.visited != true) {
			System.out.println("You are attacked by a dark beeing shaped like a humanoid");
			room4.melee2(tastatur);
			room4.visited = true;
		}
		switch(tastatur.nextInt()) {
		case 1 : System.out.println("You find nothing of interest"); room4(); break;
		case 2 : room1();break;
		case 3 : room5(); break;
		case 4 : room6(); break;
		}
		
		
		
	}

	// room 5 - Hollow one -gem
	// connects 6,4
	public static void room5() {
		if (room5.visited != true) {
			System.out.println("You are attacked by a tall, gaunt humanoid wearing robes");
			room5.melee2(tastatur); // spellcasting not implemented yet
			room5.visited = true;
		}
		if (room5.cleared == true) {
			gemCounter++;
		}
		switch(tastatur.nextInt()) {
		case 1 : System.out.println("You find nothing of interest"); room5(); break;
		case 2 : room4();break;
		case 3 : room6(); break;
		}
	}

	// room 6 - 2 toadmen
	// connects 5,4
	public static void room6() {
		if (room6.visited != true) {
			System.out.println("2 shapes jump at you. Are they human? Are they frogs? No! Something in between");
			room6.melee2(tastatur);
			room6.visited = true;
		}
		switch(tastatur.nextInt()) {
		case 1 : System.out.println("You find nothing of interest"); room5(); break;
		case 2 : room4();break;
		case 3 : room5(); break;
		}
	}

	// room 7 - 5 different traps -gem
	// connects 1,10
	public static void room7() {
		if (room7.visited != true) {
			// text first time in room
			room7.visited = true;
		}
		switch(tastatur.nextInt()) {
		case 1 : System.out.println("You find nothing of interest"); room5(); break;
		case 2 : room1();break;
		case 3 : room10(); break;
		}
	}

	// room 8 - green slime(basically a trap)
	// connects 9
	public static void room8() {
		if (room8.visited != true) {
			// text first time in room
			room8.visited = true;
		}
		switch(tastatur.nextInt()) {
		case 1 : System.out.println("You find nothing of interest"); room5(); break;
		case 2 : room9();break;
		
		}
	}

	// room 9 - falling roof trap
	// connects 10,8
	public static void room9() {
		if (room9.visited != true) {
			// text first time in room
			room9.visited = true;
		}
		switch(tastatur.nextInt()) {
		case 1 : System.out.println("You find nothing of interest"); room5(); break;
		case 2 : room8();break;
		case 3 : room10(); break;
		}
	}

	// room 10 - 8 skeletons
	// connects 1,9,11
	public static void room10() {
		if (room10.visited != true) {
			// text first time in room
			room10.visited = true;
		}
		switch(tastatur.nextInt()) {
		case 1 : System.out.println("You find nothing of interest"); room5(); break;
		case 2 : room1();break;
		case 3 : room9(); break;
		case 4 : room11();break;
		}
	}

	// room 11 - just a gem - gem
	// connects 10,12
	public static void room11() {
		if (room11.visited != true) {
			// text first time in room
			room11.visited = true;
		}
		switch(tastatur.nextInt()) {
		case 1 : System.out.println("You find nothing of interest"); room5(); break;
		case 2 : room10();break;
		case 3 : room12(); break;
		}
	}

	// room 12 - touch trap - gem
	// connects 11,13
	public static void room12() {
		if (room12.visited != true) {
			// text first time in room
			room12.visited = true;
		}
		switch(tastatur.nextInt()) {
		case 1 : System.out.println("You find nothing of interest"); room5(); break;
		case 2 : room11();break;
		case 3 : room13(); break;
		}
	}

	// room 13 - Wight boss fight - gem
	// connects 12
	public static void room13() {
		if (room13.visited != true) {
			// text first time in room
			room13.visited = true;
		}
		switch(tastatur.nextInt()) {
		case 1 : System.out.println("You find nothing of interest"); room5(); break;
		case 2 : room12();break;
		
		}
	}

}
