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
	public int money;
	public int hp;
	public int maxHp;
	public int strMod;
	public int agiMod;
	public int staMod;
	public int perMod;
	public int itlMod;
	public int lckMod;
	public int xp;
	public String name;
	public Weapon weapon;
	public Armor armor;
	public int ac;
	private String job;
	private Armoury armoury;
	public boolean shield;
	private int randomizer;
	public int atkMod;



		
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
			atkMod = strMod;
			hp = (Diceroller.d4(1)) + staMod;
			if(hp <=0) {
				hp = 1;
			}
			maxHp = hp;
			xp = 0;			
			armor = new Armor("No Armor", "No type", 0, 0, 0);
			ac =10 + agiMod + armor.getAcBonus();
			armoury = new Armoury();
			shield = false;
			armoury = Armoury.makeShop();
			randomizer =  Diceroller.d100(1);
			printCharacter();
			name = JOptionPane.showInputDialog("Navn");		
			}
			
			
			public CharacterDCC(int str, int agi,int sta, int per,int itl, int lck, int hp, int maxHP, Armor armor, int ac, boolean shield, int randomizer, String name, int money,Weapon weapon) {
				this.str=str; this.agi=agi; this.sta=sta; this.per=per; this.itl=itl; this.lck = lck; this.hp=hp; this.maxHp=maxHP; this.armor=armor; this.shield=shield;this.randomizer=randomizer;
				this.name=name;this.money=money;this.weapon=weapon;
				armoury = new Armoury(); armoury = Armoury.makeShop();
				strMod = calculateMod(str);
				agiMod = calculateMod(agi);
				staMod = calculateMod(sta);
				perMod = calculateMod(per);
				itlMod = calculateMod(itl);
				lckMod = calculateMod(lck);
			}
			public CharacterDCC(int str, int agi,int sta, int per,int itl, int lck, int hp, int maxHP, String armor, int ac, boolean shield, int randomizer, String name, int money,String weapon) {
				this.str=str; this.agi=agi; this.sta=sta; this.per=per; this.itl=itl; this.lck = lck; this.hp=hp; this.maxHp=maxHP;  this.shield=shield;this.randomizer=randomizer;
				this.name=name;this.money=money;
				armoury = new Armoury(); armoury = Armoury.makeShop();
				strMod = calculateMod(str);
				agiMod = calculateMod(agi);
				staMod = calculateMod(sta);
				perMod = calculateMod(per);
				itlMod = calculateMod(itl);
				lckMod = calculateMod(lck);
				armoury = new Armoury();
				this.armor=armoury.findArmor(armor);
				this.weapon=armoury.findWeapon(weapon);
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
			
			extra();

			job = OccupationDCC.Background(randomizer);
			
			String weaponName = OccupationDCC.weaponBackground(randomizer);	
			
			weapon = armoury.findWeapon(weaponName);
			if (weapon.getName().equals("Shortbow") ||weapon.getName().equals("Longbow")|| weapon.getName().equals("Sling") ) {
				atkMod = agiMod;}
			
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
				if (roll == 20) {
					int critDmg = (Diceroller.dx(2, weapon.getDmgDie()) + (strMod *2));
					System.out.println(name +  " do " + critDmg + " damage to " + monster.getName() + " with crit from  " + weapon.getName());
					return critDmg;
				}
				if (roll + strMod > monster.getAc()) {
					int dmg = (Diceroller.dx(1, weapon.getDmgDie())) + strMod;
					if (dmg <= 0) {
						dmg = 1;
					}
					System.out.println(name +  " do " + dmg + " damage to " + monster.getName() + " with " + weapon.getName());
					return dmg;
				} else {
					System.out.println(name + " missed!");
					return 0;
				}
			}
			
			public CharacterDCC levelUp() {
				CharacterDCC ny = new Warrior(str,  agi, sta,  per, itl,  lck,  hp,  maxHp,  armor,  ac, shield,  randomizer,  name,  money, weapon);
				return ny;
			}
			
			public void equipShield() {
				if (!shield) {
					shield= true;
					ac++;				
				}
			}
			public void dropShield() {
				if (shield) {
					shield = false;
					ac--;
				}
			}
			
			public void extra() {
				switch(randomizer) {
				case 89: shield = true;ac++;break;					
				case 83:armor = armoury.findArmor("Leather");break;
				case 77:armor = armoury.findArmor("Hide");break;
				default: break;
				
				}
			}

			public int getRandomizer() {
				return randomizer;
			}

			public void setRandomizer(int randomizer) {
				this.randomizer = randomizer;
			}

			public int getAtkMod() {
				return atkMod;
			}

			public void setAtkMod(int atkMod) {
				this.atkMod = atkMod;
			}
	
		}

	

