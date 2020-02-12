package dcc;

public class Weapon {

	private String name;
	private String type;
	private int dmgDie;
	private String special;
	private int price;
	
	
	public Weapon(String name, String type, int die, String special, int price) {
		this.name = name;
		this.type = type;
		this.dmgDie = die;
		this.special = special;
		this.price = price;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public int getDmgDie() {
		return dmgDie;
	}


	public void setDmgDie(int dmgDie) {
		this.dmgDie = dmgDie;
	}


	public String getSpecial() {
		return special;
	}


	public void setSpecial(String special) {
		this.special = special;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}
}
