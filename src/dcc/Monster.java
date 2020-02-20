package dcc;

import tools.Diceroller;

public class Monster {

	private String name;
	private int atkBonus;
	private int dmgDie;
	private int amountDie;
	private int hp;
	private int hitDie;
	private int ac;
	
	
	public int getAc() {
		return ac;
	}


	public void setAc(int ac) {
		this.ac = ac;
	}


	public Monster(String name, int atkBonus, int dmgDie, int amountDie, int hp, int hitDie, int ac) {
		this.name = name;
		this.atkBonus = atkBonus;
		this.dmgDie = dmgDie;
		this.amountDie = amountDie;
		this.hp = hp;
		this.hitDie = hitDie;
		this.ac = ac;
				
		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAtkBonus() {
		return atkBonus;
	}


	public void setAtkBonus(int atkBonus) {
		this.atkBonus = atkBonus;
	}


	public int getDmgDie() {
		return dmgDie;
	}


	public void setDmgDie(int dmgDie) {
		this.dmgDie = dmgDie;
	}


	public int getAmountDie() {
		return amountDie;
	}


	public void setAmountDie(int amountDie) {
		this.amountDie = amountDie;
	}


	public int getHp() {
		return hp;
	}


	public void setHp(int hp) {
		this.hp = hp;
	}


	public int getHitDie() {
		return hitDie;
	}


	public void setHitDie(int hitDie) {
		this.hitDie = hitDie;
	}
	
	public int attack(CharacterDCC character) {
		int roll = tools.Diceroller.d20(1);
		
		if (roll + atkBonus > character.getAc()) {
			int dmg = (Diceroller.dx(1, amountDie));
			System.out.println(character.getName() + " take " + dmg + " damage from " + name);
			return dmg;
		} else {
			System.out.println(name + " misses");
			return 0;
		}
	}
}
