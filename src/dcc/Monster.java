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
	private int initiativeMod;
	private int initiative;
	private int willSave;
	private int fortSave;
	private int refSave;
	private int dmgMod;
	private boolean special;
	private String ability;
	
	public int getAc() {
		return ac;
	}


	public void setAc(int ac) {
		this.ac = ac;
	}


	public Monster(String name, int intitiativeMod, int atkBonus, int amountDie, int dmgDie, int dmgMod, int ac,   int hitDieAmount, int hitDie,int hpBonus,  int fortSave, int refSave,int willSave, boolean special, String ability) {
		this.name = name;
		this.atkBonus = atkBonus;
		this.dmgDie = dmgDie;
		this.amountDie = amountDie;
		this.hp = tools.Diceroller.dx(hitDieAmount, hitDie) + hpBonus;
		this.hitDie = hitDie;
		this.ac = ac;
		this.willSave = willSave;
		this.refSave = refSave;
		this.fortSave = fortSave;
		this.initiativeMod = intitiativeMod;
		initiative = 0;
		this.dmgMod = dmgMod;
		this.special = special;
		this.ability = ability;		
	}

	
	public Monster(String name, int intitiativeMod, int atkBonus, int amountDie, int dmgDie, int dmgMod, int ac,   int hitDieAmount, int hitDie,int hpBonus,  int fortSave, int refSave,int willSave) {
	this(name, intitiativeMod, atkBonus, amountDie, dmgDie, dmgMod, ac, hitDieAmount, hitDie, hpBonus, fortSave, refSave, willSave, false, null);	
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
