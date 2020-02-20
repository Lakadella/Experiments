package dcc;

import tools.*;
import javax.swing.JOptionPane;

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
			armoury = Armoury.makeShop();
			printCharacter();
			name = JOptionPane.showInputDialog("Navn");
			
			
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
			
			String weaponName = OccupationDCC.weaponBackground(randomizer);	
			
			weapon = armoury.findWeapon(weaponName);
			
			System.out.println(weapon.getName());
			
			
			
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

			public int getStr() {
				return str;
			}

			public void setStr(int str) {
				this.str = str;
			}

			public int getAgi() {
				return agi;
			}

			public void setAgi(int agi) {
				this.agi = agi;
			}

			public int getSta() {
				return sta;
			}

			public void setSta(int sta) {
				this.sta = sta;
			}

			public int getPer() {
				return per;
			}

			public void setPer(int per) {
				this.per = per;
			}

			public int getItl() {
				return itl;
			}

			public void setItl(int itl) {
				this.itl = itl;
			}

			public int getLck() {
				return lck;
			}

			public void setLck(int lck) {
				this.lck = lck;
			}

			public int getMoney() {
				return money;
			}

			public void setMoney(int money) {
				this.money = money;
			}

			public int getHp() {
				return hp;
			}

			public void setHp(int hp) {
				this.hp = hp;
			}

			public int getMaxHp() {
				return maxHp;
			}

			public void setMaxHp(int maxHp) {
				this.maxHp = maxHp;
			}

			public int getStrMod() {
				return strMod;
			}

			public void setStrMod(int strMod) {
				this.strMod = strMod;
			}

			public int getAgiMod() {
				return agiMod;
			}

			public void setAgiMod(int agiMod) {
				this.agiMod = agiMod;
			}

			public int getStaMod() {
				return staMod;
			}

			public void setStaMod(int staMod) {
				this.staMod = staMod;
			}

			public int getPerMod() {
				return perMod;
			}

			public void setPerMod(int perMod) {
				this.perMod = perMod;
			}

			public int getItlMod() {
				return itlMod;
			}

			public void setItlMod(int itlMod) {
				this.itlMod = itlMod;
			}

			public int getLckMod() {
				return lckMod;
			}

			public void setLckMod(int lckMod) {
				this.lckMod = lckMod;
			}

			public int getXp() {
				return xp;
			}

			public void setXp(int xp) {
				this.xp = xp;
			}

			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public Weapon getWeapon() {
				return weapon;
			}

			public void setWeapon(Weapon weapon) {
				this.weapon = weapon;
			}

			public Armor getArmor() {
				return armor;
			}

			public void setArmor(Armor armor) {
				this.armor = armor;
			}

			public int getAc() {
				return ac;
			}

			public void setAc(int ac) {
				this.ac = ac;
			}

			public String getJob() {
				return job;
			}

			public void setJob(String job) {
				this.job = job;
			}

			public Armoury getArmoury() {
				return armoury;
			}

			public void setArmoury(Armoury armoury) {
				this.armoury = armoury;
			}

			public boolean isShield() {
				return shield;
			}

			public void setShield(boolean shield) {
				this.shield = shield;
			}
			
			public int attack(Monster monster) {
				int roll = tools.Diceroller.d20(1);
				
				if (roll + strMod > monster.getAc()) {
					int dmg = (Diceroller.dx(1, weapon.getDmgDie())) + strMod;
					System.out.println(name +  " do " + dmg + " damage to " + monster.getName() + " with " + weapon.getName());
					return dmg;
				} else {
					System.out.println(name + " missed!");
					return 0;
				}
			}
		}

	

