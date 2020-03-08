package dcc;

public class Halfling extends CharacterDCC{
	
	public boolean dualWield;
	public Weapon offHand;
	
	public Halfling(int str, int agi,int sta, int per,int itl, int lck, int hp, int maxHP, Armor armor, int ac, boolean shield, int randomizer, String name, int money,Weapon weapon) {
		super(str, agi,sta, per,itl, lck, hp, maxHP, armor, ac, shield, randomizer, name, money,weapon); 
		dualWield = false;
		offHand = armoury.findWeapon("");
		lvl = 1;
		super.gainHp(6);
		occupation = "Halfling";
	}
	
	public Halfling(int str, int agi,int sta, int per,int itl, int lck, int hp, int maxHP, Armor armor, int ac, boolean shield, int randomizer, String name, int money,Weapon weapon,int xp,int atkMod,int lvl) {
		super(str, agi,sta, per,itl, lck, hp, maxHP, armor, ac, shield, randomizer, name, money,weapon); 
		this.lvl = lvl-1;
		levelUp();
		this.maxHp = maxHP;
		this.hp = hp;
	}
	
	public String toString() {
		return name + " the Halfling , lvl " + lvl + " wielding a " + weapon.getName() + " wearing " + armor.getName() + " with " +maxHp + " hp ";
	}
	public void levelUp() {
		gainHp(6);
		lvl++;
		
		switch (lvl) {
		case 2: ;break;
		case 3: ;break;
		case 4: ;break;
		case 5: ;break;
		case 6: ;break;
		case 7: ;break;
		case 8: ;break;
		case 9: ;break;
		case 10: ;break;
		default: break;
		}
	}
}
