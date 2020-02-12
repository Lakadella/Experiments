package dnd;

public class Character {

	private String navn;
	private String race;
	private String klasse;
	private int strenght;
	private int agility;
	private int constitution;
	private int intelligence;
	private int wisdom;
	private int charisma;
	private int strengthMod;
	private int agilityMod;
	private int constitutionMod;
	private int intelligenceMod;
	private int wisdomMod;
	private int charismaMod;
	private int armorClass;
	private int hitPoints;
	private Weapon[] weapons;
	private Armor[] armor;
	private Skill[] skills;
	private Spell[] spells;
	private String background;
	private String alignment;
	private int level;
	private int hitdie;
	private int hitdieAmount;
	
	
	public Character(String navn, String race, String klasse) {
		this.navn = navn;
		level = 1;
		strenght = tools.StatRollerDND.rullStats();
		agility = tools.StatRollerDND.rullStats();
		constitution = tools.StatRollerDND.rullStats();
		intelligence = tools.StatRollerDND.rullStats();
		wisdom = tools.StatRollerDND.rullStats();
		charisma = tools.StatRollerDND.rullStats();
		armorClass = 10;
		hitPoints = 0;
		// modifiers maa komme sist
		strengthMod = tools.StatRollerDND.modifier(strenght);
		agilityMod = tools.StatRollerDND.modifier(agility);
		constitutionMod = tools.StatRollerDND.modifier(constitution);
		intelligenceMod = tools.StatRollerDND.modifier(intelligence);
		wisdomMod = tools.StatRollerDND.modifier(wisdom);
		charismaMod = tools.StatRollerDND.modifier(charisma);

	}
	
	public int getHitdie() {
		return hitdie;
	}


	public void setHitdie(int hitdie) {
		this.hitdie = hitdie;
	}


	public int getHitdieAmount() {
		return hitdieAmount;
	}


	public void setHitdieAmount(int hitdieAmount) {
		this.hitdieAmount = hitdieAmount;
	}




	



	public String getNavn() {
		return navn;
	}


	public void setNavn(String navn) {
		this.navn = navn;
	}


	public String getRace() {
		return race;
	}


	public void setRace(String race) {
		this.race = race;
	}


	public String getKlasse() {
		return klasse;
	}


	public void setKlasse(String klasse) {
		this.klasse = klasse;
	}


	public int getStrenght() {
		return strenght;
	}


	public void setStrenght(int strenght) {
		this.strenght = strenght;
	}


	public int getAgility() {
		return agility;
	}


	public void setAgility(int agility) {
		this.agility = agility;
	}


	public int getConstitution() {
		return constitution;
	}


	public void setConstitution(int constitution) {
		this.constitution = constitution;
	}


	public int getIntelligence() {
		return intelligence;
	}


	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}


	public int getWisdom() {
		return wisdom;
	}


	public void setWisdom(int wisdom) {
		this.wisdom = wisdom;
	}


	public int getCharisma() {
		return charisma;
	}


	public void setCharisma(int charisma) {
		this.charisma = charisma;
	}


	public int getStrengthMod() {
		return strengthMod;
	}


	public void setStrengthMod(int strengthMod) {
		this.strengthMod = strengthMod;
	}


	public int getAgilityMod() {
		return agilityMod;
	}


	public void setAgilityMod(int agilityMod) {
		this.agilityMod = agilityMod;
	}


	public int getConstitutionMod() {
		return constitutionMod;
	}


	public void setConstitutionMod(int constitutionMod) {
		this.constitutionMod = constitutionMod;
	}


	public int getIntelligenceMod() {
		return intelligenceMod;
	}


	public void setIntelligenceMod(int intelligenceMod) {
		this.intelligenceMod = intelligenceMod;
	}


	public int getWisdomMod() {
		return wisdomMod;
	}


	public void setWisdomMod(int wisdomMod) {
		this.wisdomMod = wisdomMod;
	}


	public int getCharismaMod() {
		return charismaMod;
	}


	public void setCharismaMod(int charismaMod) {
		this.charismaMod = charismaMod;
	}


	public int getArmorClass() {
		return armorClass;
	}


	public void setArmorClass(int armorClass) {
		this.armorClass = armorClass;
	}


	public int getHitPoints() {
		return hitPoints;
	}


	public void setHitPoints(int hitPoints) {
		this.hitPoints = hitPoints;
	}


	public Weapon[] getWeapons() {
		return weapons;
	}


	public void setWeapons(Weapon[] weapons) {
		this.weapons = weapons;
	}


	public Armor[] getArmor() {
		return armor;
	}


	public void setArmor(Armor[] armor) {
		this.armor = armor;
	}


	public Skill[] getSkills() {
		return skills;
	}


	public void setSkills(Skill[] skills) {
		this.skills = skills;
	}


	public Spell[] getSpells() {
		return spells;
	}


	public void setSpells(Spell[] spells) {
		this.spells = spells;
	}


	public String getBackground() {
		return background;
	}


	public void setBackground(String background) {
		this.background = background;
	}


	public String getAlignment() {
		return alignment;
	}


	public void setAlignment(String alignment) {
		this.alignment = alignment;
	}


	public int getLevel() {
		return level;
	}


	public void setLevel(int level) {
		this.level = level;
	}
	
	
}


