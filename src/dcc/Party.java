package dcc;

public class Party {

	CharacterDCC[] group;
	Weapon[] weaponstash;
	Armor[] armorstash;
	String[] itemstash;
	int partyfunds;
	int members;
	

	public Party(int antall) {
		group = new CharacterDCC[antall];
		members = 0;
		partyfunds = 0;
		weaponstash = new Weapon[10];
		armorstash = new Armor[10];
	}
	
	
	public Party() {
		this(0);
				
	}
	
	public static Party newParty(int number) {
		Party ny = new Party(number);
		ny.group = new CharacterDCC[number];
		for (int i = 0 ; i< number;i++) {
			ny.group[i] = new CharacterDCC();
		}
		ny.members = number;
		return ny;
	}
	
	public CharacterDCC[] getGroup() {
		return group;
	}

	public void setGroup(CharacterDCC[] group) {
		this.group = group;
	}

	public Weapon[] getWeaponstash() {
		return weaponstash;
	}

	public void setWeaponstash(Weapon[] weaponstash) {
		this.weaponstash = weaponstash;
	}

	public Armor[] getArmorstash() {
		return armorstash;
	}

	public void setArmorstash(Armor[] armorstash) {
		this.armorstash = armorstash;
	}

	public String[] getItemstash() {
		return itemstash;
	}

	public void setItemstash(String[] itemstash) {
		this.itemstash = itemstash;
	}

	public int getPartyfunds() {
		return partyfunds;
	}

	public void setPartyfunds(int partyfunds) {
		this.partyfunds = partyfunds;
	}

	public int getMembers() {
		return members;
	}

	public void setMembers(int members) {
		this.members = members;
	}
	public void leggTil(CharacterDCC ny) {
		if (group.length <= members) {
			utvid();
		}
		System.out.println("legger til");
		group[members] = ny;
		
		System.out.println(group[members].name);
		members++;
		
	}
	public void utvid() {
		CharacterDCC[] ny = new CharacterDCC[members+2];
		System.out.println("utvid kjorer");
		for (int i = 0; i<members;i++) {
			ny[i] = group[i];
		}
		group = ny;
	}
	
	public void levelUpLvl0() {
		for (int i = 0; i<members;i++) {
			group[i] = group[i].levelUpFunnel();
		}
	}
	public void levelUpParty(){
		for (int i = 0; i<members;i++) {
			 group[i].levelUp();
		}
	}

		}

