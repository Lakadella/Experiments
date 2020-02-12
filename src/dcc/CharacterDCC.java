package dcc;

import tools.*;

public class CharacterDCC {

	private int str;
	private int agi;
	private int sta;
	private int per;
	private int itl;
	private int lck;
	private int money;
	private int hp;
	private int maxHp;
	private int strMod;
	private int agiMod;
	private int staMod;
	private int perMod;
	private int itlMod;
	private int lckMod;
	private int xp;
	private String name;
	private Weapon weapon;
	private Armor armor;
	private int ac;
	private String job;
	private Armoury armoury;
	private boolean shield;


		
			public CharacterDCC(String name) {
				this();
				this.name=name;
			}
	
			// TODO Auto-generated method stub
			public CharacterDCC() {
			str = Diceroller.d6(3);
			agi = Diceroller.d6(3);
			sta = Diceroller.d6(3);
			per = Diceroller.d6(3);
			itl = Diceroller.d6(3);
			lck = Diceroller.d6(3);
			money = Diceroller.d12(5);
			strMod = calculateMod(str);
			agiMod = calculateMod(agi);
			staMod = calculateMod(sta);
			perMod = calculateMod(per);
			itlMod = calculateMod(itl);
			lckMod = calculateMod(lck);
			hp = (Diceroller.d4(1)) + staMod; 
			maxHp = hp;
			xp = 0;			
			armor = new Armor("No Armor", "No type", 0, 0, 0);
			ac =10 + agiMod + armor.getAcBonus();
			armoury = new Armoury();
			shield = false;
			}
			
			
			public int calculateMod(int stat) {
				int modifier = 0;
				switch(stat) {
				case 3: modifier = -3; break;
				case 4: 
				case 5: modifier = -2; break;
				case 6:	
				case 7:
				case 8: modifier = -1; break;
				case 9:
				case 10:
				case 11:
				case 12: modifier = 0; break;
				case 13:
				case 14:
				case 15: modifier =1; break;
				case 16:
				case 17: modifier = 2; break;
				case 18: modifier = 3; break;
				default: System.out.println("calculation failed");
				}
				return modifier;
			}
			
			public void printCharacter() {
			System.out.println("Strength = " + str);
			System.out.println("Agility = " + agi);
			System.out.println("Stamina = " + sta);
			System.out.println("Personality = " + per);
			System.out.println("Intelligence = " + itl);
			System.out.println("Luck = " + lck);
			System.out.println("You have " + hp + " hitpoints");
			System.out.println("Your AC is " + ac + " " + armor.getName());
			System.out.println("You have " + money + " copper");
			
			int randomizer =  Diceroller.d100(1);
			
			job = OccupationDCC.Background(randomizer);
			
			weapon = armoury.findWeapon(job);
			OccupationDCC.Item();
			OccupationDCC.Luck();
			}		
			 /*
			  * 
			  * 1. Roll ability scores. 3D6
				2. Determine 0-level occupation. 1-100
				3. Calculate saving throws and choose an alignment. inndata
				4. Determine randomly determined equipment 1-24
				5. Hitpoints 1D4
				6. luck modifier - 1D30
				
			  
			 */
		}

	

