package dcc;

public class Party {

	CharacterDCC[] group;
	Weapon[] weaponstash;
	Armor[] armorstash;
	String[] itemstash;
	int partyfunds;
	int members;
	
	public Party(int number) {
		group = new CharacterDCC[number];
		for (int i = 0 ; i< number;i++) {
			group[i] = new CharacterDCC();
		}
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
	
	
}
