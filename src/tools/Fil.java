package tools;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import dcc.*;

public class Fil {

	
	/*  
	 * OBS! I Menyen der f.eks. lesFrafil brukes, må det være try og catch-blokk.
	 * 
	 */
		private static final String SKILLE = "#";

		/**
		 * @param filnavn
		 * @return Referansen til Film-arkivet
		 * @throws java.io.IOException
		 */
		public static Party lesFraFilLvl0(String filnavn)  {
			Party gruppe = null;
				try {
				/*  1 - FileReader
				 *      Klassen FileReader sørger for at byte-innstrømmen blir opprettet,
				 *      sørger videre for at bytes fra filen blir tolket riktig som tegn 
				 *      i flg. tegnkodingsformatet for plattformen.
				*/    
				 FileReader ansFil = new FileReader(filnavn);
				 			 
	            
				/*  2 - BufferedReader
				 *      Definerer et BufferReader-objekt som kobles til FileReader-objektet
				 *      Da når vi metoden readLine() som leser en linje.		  
				 * 			 
				 */
				BufferedReader innfil = new BufferedReader(ansFil);

				// 3 - Leser den første posten som er antall info-poster
				       
				String linje = innfil.readLine();
				int n = Integer.parseInt(linje);
				gruppe = new Party(n);

				// 4 - Les postene, en hel post om gangen
				for (int i = 0; i < n; i++) {
					String post = innfil.readLine();
					String[] felt = post.split(SKILLE);
					String name = felt[0];
					int str = Integer.parseInt(felt[1]);
					int agi = Integer.parseInt(felt[2]);
					int sta = Integer.parseInt(felt[3]);
					int per = Integer.parseInt(felt[4]);
					int itl = Integer.parseInt(felt[5]);
					int lck = Integer.parseInt(felt[6]);
					int money = Integer.parseInt(felt[7]);
					int atkMod = Integer.parseInt(felt[8]);
					int hp = Integer.parseInt(felt[9]);
					int maxHp = Integer.parseInt(felt[10]);
					String armor = felt[11];
					int xp = Integer.parseInt(felt[12]);
					boolean shield = Boolean.parseBoolean(felt[13]);
					int randomizer = Integer.parseInt(felt[14]);
					String weapon = felt[15];
					int ac = Integer.parseInt(felt[16]);

					CharacterDCC karakter = new CharacterDCC(str,agi,sta,per,itl,lck,hp,maxHp,armor,ac,shield,randomizer,name,money,weapon);
					//public CharacterDCC(int str, int agi,int sta, int per,int itl, int lck, int hp, int maxHP, String armor, int ac, boolean shield, int randomizer, String name, int money,String weapon)	
					gruppe.leggTil(karakter);
				}

				// 4 - Lukk filen
				innfil.close();

			} catch (FileNotFoundException unntak) {// arver fra IOE.. må stå først
				                                    // hvis ikke vil unntaket for IOException skygge
				System.out.println("Finner ikke filen " + filnavn);
			
			} catch (IOException e) {
				System.out.println("Feil ved lesing av fil: " + e);
				
			}
	      
		return gruppe;
	       
		}// metode
		
			
		
		public static void skrivTilFilLvl0(Party gruppe, String filnavn)  {
			try {
				/* 1 - FileWriter
				 *     Definerer et FileWriter-objekt som åpner filen.
				 *     Byte-strøm blir opprettet for skriving av bytes til filen.
				 *     Tegn blir lagret i standard tegnkodingsformat for plattformen.
				 *     Hvis utvid er true, vil filen utvides ved  skriving på slutten
				 *     av filen. Hvis utvid er false, vil skrivingen starte i begynnnelsen 
				 *     av filen.			 *     
				 *     Dersom filen ikke eksisterer, vil den bli opprettet. 
				 *     Dersom filen ikke kan åpnes, vil metoden kaste et unntak av typen IOException.
				 * 
				 */
				FileWriter ansFil = new FileWriter(filnavn, false);

				/* 2 - PrintWriter
				 *     Definerer et PrintWriter-objekt som kobles til FileWriter-objektet.
				 *     PrintWriter-objektet leverer tegn til FileWriter-objektet.
				 *     FileWriter vil gi riktig koding av tegn i bytes  og lagring på fil.
				 *      
				 * 
				 */
				PrintWriter utfil = new PrintWriter(ansFil);
				int antall = gruppe.getMembers();
				// 3 - Skriver foerst ut antall ansatt-info-er på første linje
				utfil.println(antall);
				CharacterDCC[] tabell = gruppe.getGroup();
				for (int i = 0; i < antall; i++) {
					// 3 - Skriver postene, felt for felt
					utfil.print(tabell[i].getName());
					utfil.print(SKILLE);
					utfil.print(tabell[i].getStr());
					utfil.print(SKILLE);
					utfil.print(tabell[i].getAgi());
					utfil.print(SKILLE);
					utfil.print(tabell[i].getSta());
					utfil.print(SKILLE);
					utfil.print(tabell[i].getPer());
					utfil.print(SKILLE);
					utfil.print(tabell[i].getItl());
					utfil.print(SKILLE);
					utfil.print(tabell[i].getLck());
					utfil.print(SKILLE);
					utfil.print(tabell[i].getMoney());
					utfil.print(SKILLE);
					utfil.print(tabell[i].getAtkMod());
					utfil.print(SKILLE);
					utfil.print(tabell[i].getHp());
					utfil.print(SKILLE);
					utfil.print(tabell[i].getMaxHp());
					utfil.print(SKILLE);
					utfil.print(tabell[i].getArmor().getName());
					utfil.print(SKILLE);
					utfil.print(tabell[i].getXp());
					utfil.print(SKILLE);
					utfil.print(tabell[i].isShield());
					utfil.print(SKILLE);
					utfil.print(tabell[i].getRandomizer());
					utfil.print(SKILLE);
					utfil.print(tabell[i].getWeapon().getName());
					utfil.print(SKILLE);
					utfil.print(tabell[i].getAc());
					utfil.println(SKILLE);
					
				} // for
					// 4 - Lukk filen
				utfil.close();
			} // try
			catch (IOException e) {
				System.out.println("Feil på skriving til fil : " + e);
			
			}

		}// metode

	}// class
	

