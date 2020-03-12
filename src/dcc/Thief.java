package dcc;

public class Thief extends CharacterDCC{

	
	public Thief(int str, int agi,int sta, int per,int itl, int lck, int hp, int maxHP, Armor armor, int ac, boolean shield, int randomizer, String name, int money,Weapon weapon) {
		super(str, agi,sta, per,itl, lck, hp, maxHP, armor, ac, shield, randomizer, name, money,weapon);
		occupation = "Thief";
		gainHp(6);
		lvl = 1;
	
	}
	
	public Thief(int str, int agi,int sta, int per,int itl, int lck, int hp, int maxHP, Armor armor, int ac, boolean shield, int randomizer, String name, int money,Weapon weapon,int xp, int atkMod,int lvl) {
		super(str, agi,sta, per,itl, lck, hp, maxHP, armor, ac, shield, randomizer, name, money,weapon); 
		occupation = "Thief";
		this.lvl = lvl-1;
		levelUp();
		this.maxHp = maxHP;
		this.hp = hp;
	}
	
	
	public String toString() {
		return name + " the Thief , lvl " + lvl + " wielding a " + weapon.getName() + " wearing " + armor.getName() + " with " +maxHp + " hp ";
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
