package dcc;

import javax.swing.JOptionPane;
import tools.*;


public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
	
		Party nyttParty = Party.newParty(4);
		
		CharacterDCC[] group = nyttParty.getGroup();
		
		nyttParty.levelUpLvl0();
		Fil.skrivTilFil(nyttParty, "partyFil");
		
		Party lestParty = Fil.lesFraFil("partyFil");
		
		group = lestParty.getGroup();
		for (CharacterDCC cd : group) {
			System.out.println(cd.toString());
		}
	
	}

}
