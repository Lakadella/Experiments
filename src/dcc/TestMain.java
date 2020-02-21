package dcc;

import javax.swing.JOptionPane;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//CharacterDCC testChar = new CharacterDCC();
		//System.out.println(testChar.getWeapon().getName());
		Monster antWorker = new Monster("Ant, giant (worker)",0,2,1,4,1,16,1,8,2,5,1,-3);
		
		
		//testChar.printCharacter();
		
		//Combat testCombat = new Combat(testMonster, testChar);
		
		//testCombat.deathMatch();
		
		Party testparty = new Party(5);
		
		//CharacterDCC[] doink = testparty.getGroup();
		
		//doink[0].getArmoury().listWeapons();
		
		
		
		Mob testmob = new Mob(antWorker, 3);
		
		//testmob.listMonsters();
		
		Encounter testEnc = new Encounter(testparty, testmob);
		
		testEnc.melee();
		
		
		
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
