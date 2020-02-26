package dcc;

import javax.swing.JOptionPane;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		//CharacterDCC testChar = new CharacterDCC();
		//System.out.println(testChar.getWeapon().getName());
		Monster antWorker = new Monster("Jungle ape-man",2,4,1,4,3,13, 3,8,0,6,3,1);	
		//testChar.printCharacter();	
		//Combat testCombat = new Combat(testMonster, testChar);	
		//testCombat.deathMatch();	
		Party testparty = new Party(4);		
		CharacterDCC[] doink = testparty.getGroup();		
	//	doink[0].getArmoury().listWeapons();		
		System.out.println(doink[0].getWeapon().getDmgDie());		
		Mob testmob = new Mob(antWorker, 1);		
		//testmob.listMonsters();		
		Encounter testEnc = new Encounter(testparty, testmob);		
		testEnc.melee();
		//Monster[] monsters = testmob.getMonsters();
		//for (Monster m : monsters) {
			//System.out.println(m.getHp());
		//}		
		//int option = 0;
		//while (option != 2) {		
		//option = Integer.parseInt(JOptionPane.showInputDialog("1 to continue, 2 to abort"));
		//testEnc.battle();
		//}
		//System.out.println(testChar.getWeapon().getName());
		//System.out.println(testChar.getWeapon().getDmgDie());	
		//testparty.listParty();	
	}

}
