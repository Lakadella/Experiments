package dcc;

import javax.swing.JOptionPane;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//CharacterDCC testChar = new CharacterDCC();
		//System.out.println(testChar.getWeapon().getName());
		Monster testMonster = new Monster("Goblin", 1, 5, 1, 6, 1, 12);
		
		//testChar.printCharacter();
		
		//Combat testCombat = new Combat(testMonster, testChar);
		
		//testCombat.deathMatch();
		
		Party testparty = new Party(5);
		
		Mob testmob = new Mob(testMonster, 2);
		
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
