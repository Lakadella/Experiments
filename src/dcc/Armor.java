package dcc;

public class Armor {

	private String name;
	private String type;
	private int acBonus;
	private int price;
	private int penalty;

	
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


	public int getAcBonus() {
		return acBonus;
	}


	public void setAcBonus(int acBonus) {
		this.acBonus = acBonus;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public int getPenalty() {
		return penalty;
	}


	public void setPenalty(int penalty) {
		this.penalty = penalty;
	}


	public Armor(String name, String type, int acBonus, int price, int penalty) {
		this.name = name;
		this.type = type;
		this.acBonus = acBonus;
		this.price = price;
		this.penalty = penalty;
		
	}


}
