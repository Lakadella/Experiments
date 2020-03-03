package dcc;

import javax.swing.JOptionPane;
import tools.*;


public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		CharacterDCC testChar = new CharacterDCC();
		//System.out.println(testChar.getWeapon().getName());
		//Monster antWorker = new Monster("Firebeetle, giant",-2,3,1,4,2,10,2,8,2,1,0 ,-3);	
		//testChar.printCharacter();	
		//Combat testCombat = new Combat(testMonster, testChar);	
		//testCombat.deathMatch();	
		//Party testparty = new Party(2);		
		//CharacterDCC[] doink = testparty.getGroup();		
		//doink[0].getArmoury().listWeapons();		
		//System.out.println(doink[0].getWeapon().getDmgDie());		
	//	Mob testmob = new Mob(antWorker, 3);		
		//testmob.listMonsters();	
		
	//	for(int i = 0; i< doink.length;i++) {
		//	doink[i] = doink[i].levelUp();
			//System.out.println(doink[i].getHp());
	//	}
		//Encounter testEnc = new Encounter(testparty, testmob);		
	//	testEnc.melee();
		//Monster[] monsters = testmob.getMonsters();
		//Fil.skrivTilFilLvl0(testparty,"testrpg");
		//skrivTilFilLvl0(testparty, "filnavn"); 
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
		testChar = testChar.levelUpFunnel();
		testChar.setMoney(10000);
		testChar.buyArmor();
		System.out.println(testChar.toString());
		testChar.levelUp();
		System.out.println(testChar.toString());
		testChar.levelUp();
		System.out.println(testChar.toString());
		testChar.levelUp();
		System.out.println(testChar.toString());
		testChar.levelUp();
		System.out.println(testChar.toString());
		//System.out.println(testChar.getHp());
		//Party nytt = Fil.lesFraFilLvl0("testrpg");
		//CharacterDCC[] doink = nytt.getGroup();	
		//System.out.println(doink.length);
		//System.out.println(doink[0].getName());
	}

}
