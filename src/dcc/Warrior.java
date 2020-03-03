package dcc;

import javax.swing.JOptionPane;

import tools.Diceroller;

public class Warrior extends CharacterDCC{
	
	
	private int deedDie;
	public String chosenWeapon;
	private int deedBonus;
	public int critrange;
	
	public Warrior(int str, int agi,int sta, int per,int itl, int lck, int hp, int maxHP, Armor armor, int ac, boolean shield, int randomizer, String name, int money,Weapon weapon) {
		super(str, agi,sta, per,itl, lck, hp, maxHP, armor, ac, shield, randomizer, name, money,weapon);
		
		super.gainHp(12);
		super.setHp  (super.getMaxHp());
		lvl = 1;
		deedDie=3;
		this.setWeapon(weapon);
		this.deedBonus = 0;
		critrange = 2;
		occupation = "Warrior";
		
		
		}
	
	@Override
	public int attack(Monster monster) {
		int roll = tools.Diceroller.d20(1);		
		if (roll > 20-critrange) {
			int critDmg = (Diceroller.dx(2, weapon.getDmgDie()) + (strMod *2) + ((Diceroller.dx(deedDie, 1) + deedBonus)*2 ));
			System.out.println(name +  " do " + critDmg + " damage to " + monster.getName() + " with crit from  " + weapon.getName());
			return critDmg;
		}
		if(weapon.getName().equals(chosenWeapon)) {
			atkMod = strMod + lckMod;
		}
		if (roll + atkMod + (Diceroller.dx(1, deedDie)+deedBonus) > monster.getAc()) {
			int dmg = (Diceroller.dx(1, weapon.getDmgDie())) + strMod + Diceroller.dx(deedDie, 1) + deedBonus;
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
	@Override
	public void levelUp() {
		super.gainHp(12);
		lvl++;
		switch (lvl) {
		case 2: deedDie=4;break;
		case 3: deedDie=5;break;
		case 4: deedDie=6;break;
		case 5: deedDie=7;critrange = 3;break;
		case 6: deedDie=8;break;
		case 7: deedDie=10; deedBonus = 1;break;
		case 8: deedBonus = 2; break;
		case 9: deedBonus = 3; critrange = 4;break;
		case 10: deedBonus = 4; break;
		default: break;
		}
		
	}
	public String toString() {
		return name + " the Warrior , lvl " + lvl + " wielding a " + weapon.getName() + " wearing " + armor.getName() + " with " +maxHp + " hp ";
	}

	
}
