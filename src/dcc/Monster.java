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
	public int initiativeMod;
	private int initiative;
	private int willSave;
	private int fortSave;
	private int refSave;
	private int dmgMod;
	private boolean special;
	private String ability;
	private int hitDieAmount;
	private int hpBonus;
	
	public int getHitDieAmount() {
		return hitDieAmount;
	}


	public void setHitDieAmount(int hitDieAmount) {
		this.hitDieAmount = hitDieAmount;
	}


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
		this.hitDieAmount = hitDieAmount;
		this.hitDie = hitDie;
		this.hpBonus = hpBonus;
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

	
	public int getHpBonus() {
		return hpBonus;
	}


	public void setHpBonus(int hpBonus) {
		this.hpBonus = hpBonus;
	}


	public Monster(String name, int intitiativeMod, int atkBonus, int amountDie, int dmgDie, int dmgMod, int ac,   int hitDieAmount, int hitDie,int hpBonus,  int fortSave, int refSave,int willSave) {
	this(name, intitiativeMod, atkBonus, amountDie, dmgDie, dmgMod, ac, hitDieAmount, hitDie, hpBonus, fortSave, refSave, willSave, false, "");	
	}

	public int getInitiativeMod() {
		return initiativeMod;
	}


	public void setInitiativeMod(int initiativeMod) {
		this.initiativeMod = initiativeMod;
	}


	public int getInitiative() {
		return initiative;
	}


	public void setInitiative(int initiative) {
		this.initiative = initiative;
	}


	public int getWillSave() {
		return willSave;
	}


	public void setWillSave(int willSave) {
		this.willSave = willSave;
	}


	public int getFortSave() {
		return fortSave;
	}


	public void setFortSave(int fortSave) {
		this.fortSave = fortSave;
	}


	public int getRefSave() {
		return refSave;
	}


	public void setRefSave(int refSave) {
		this.refSave = refSave;
	}


	public int getDmgMod() {
		return dmgMod;
	}


	public void setDmgMod(int dmgMod) {
		this.dmgMod = dmgMod;
	}


	public boolean isSpecial() {
		return special;
	}


	public void setSpecial(boolean special) {
		this.special = special;
	}


	public String getAbility() {
		return ability;
	}


	public void setAbility(String ability) {
		this.ability = ability;
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
			int dmg = (Diceroller.dx(amountDie, dmgDie) + dmgMod);
			if(dmg < 1) {dmg=1;}
			System.out.println(character.getName() + " take " + dmg + " damage from " + name);
			return dmg;
		} else {
			System.out.println(name + " misses");
			return 0;
		}
	}
}
