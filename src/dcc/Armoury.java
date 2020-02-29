package dcc;

public class Armoury {

	private Armor[] armor;
	private Weapon[] weapon;
	private int armorCount;
	private int weaponCount;

	public Armoury() {
		armor = new Armor[10];
		weapon = new Weapon[23];
		armorCount = 0;
		weaponCount = 0;
		
	}

	public Armor findArmor(String name) {
		Armor noArmor = new Armor("No Armor", "No type", 0, 0, 0);
		for (Armor a : armor) {
			if (a.getName() == name) {
				return a;
			}
		}
		return noArmor;
	}

	public Weapon findWeapon(String name) {
		Weapon noWeapon = new Weapon("Unarmed", "Unarmed", 4, "", 0);
		for (Weapon w : weapon) {
			if (w != null && w.getName().equals(name)) {
				return w;
			}
		}
		return noWeapon;
		
	
	}
	
	public Weapon returnWeapon(String name) {
		
		System.out.println("Return kjorer" + weaponCount);
		for (int i = 0; i<weaponCount; i++) {
			if (weapon[i].getName() == name) {
				
				return weapon[i];
			}else { 
				System.out.println(weapon[i].getName());
				}
		}return null;
	}

	public static Armoury makeShop() {
		Armoury temp = new Armoury();
		Armor leather = new Armor("Leather", "Leather", 2, 20, 1);
		temp.addArmor(leather);
		Armor padded = new Armor("Padded", "Padded", 1, 5, 0);
		temp.addArmor(padded);
		Armor studded = new Armor("Studded leather", "Studded leather", 3, 4500, 2);
		temp.addArmor(studded);
		Armor hide = new Armor("Hide", "hide", 3, 3000, 3);
		temp.addArmor(hide);
		Armor scale = new Armor("Scale Mail", "scale mail", 4, 8000, 4);
		temp.addArmor(scale);
		Armor chain = new Armor("Chain Mail", "chain mail", 5, 15000, 5);
		temp.addArmor(chain);
		Armor banded = new Armor("Banded Mail", "banded mail", 6, 25000, 6);
		temp.addArmor(banded);
		Armor halfplate = new Armor("Half-plate", "half-plate", 7, 55000, 7);
		temp.addArmor(halfplate);
		Armor plate = new Armor("Full plate", "full plate", 8, 120000, 8);
		temp.addArmor(plate);
		Weapon battleaxe = new Weapon("Battleaxe", "battleaxe", 10, "two-handed", 700);
		temp.addWeapon(battleaxe);
		Weapon blackjack = new Weapon("Blackjack", "blackjack", 3, "surprise", 300);
		temp.addWeapon(blackjack);
		Weapon blowgun = new Weapon("Blowgun", "blowgun", 3, "ranged", 600);
		temp.addWeapon(blowgun);
		Weapon club = new Weapon("Club", "club", 4, "", 300);
		temp.addWeapon(club);
		Weapon crossbow = new Weapon("Crossbow", "crossbow", 6, "ranged", 3000);
		temp.addWeapon(crossbow);
		Weapon dagger = new Weapon("Dagger", "dagger", 4, "surprise", 300);
		temp.addWeapon(dagger);
		Weapon dart = new Weapon("Dart", "dart", 4, "ranged", 50);
		temp.addWeapon(dart);
		Weapon flail = new Weapon("Flail", "flail", 6, "", 600);
		temp.addWeapon(flail);
		Weapon garrote = new Weapon("Garrote", "garrote", 1, "suprise", 200);
		temp.addWeapon(garrote);
		Weapon handaxe = new Weapon("Handaxe", "handaxe", 6, "", 400);
		temp.addWeapon(handaxe);
		Weapon javelin = new Weapon("Javelin", "javelin", 6, "ranged", 100);
		temp.addWeapon(javelin);
		Weapon lance = new Weapon("Lance", "lance", 12, "mounted", 2500);
		temp.addWeapon(lance);
		Weapon longbow = new Weapon("Longbow", "longbow", 6, "ranged", 4000);
		temp.addWeapon(longbow);
		Weapon longsword = new Weapon("Longsword", "longsword", 8, "", 1000);
		temp.addWeapon(longsword);
		Weapon mace = new Weapon("Mace", "mace", 6, "", 500);
		temp.addWeapon(mace);
		Weapon polearm = new Weapon("Polearm", "polearm", 10, "two-handed", 700);
		temp.addWeapon(polearm);
		Weapon shortbow = new Weapon("Shortbow", "shortbow", 6, "ranged", 2500);
		temp.addWeapon(shortbow);
		Weapon shortsword = new Weapon("Short Sword", "shortsword", 6, "", 700);
		temp.addWeapon(shortsword);
		Weapon sling = new Weapon("Sling", "sling", 4, "ranged", 200);
		temp.addWeapon(sling);
		Weapon spear = new Weapon("Spear", "spear", 8, "mounted", 300);
		temp.addWeapon(spear);
		Weapon staff = new Weapon("Staff", "staff", 4, "", 50);
		temp.addWeapon(staff);
		Weapon twohander = new Weapon("Two-handed Sword", "twohandedsword", 10, "two-handed", 1500);
		temp.addWeapon(twohander);
		Weapon warhammer = new Weapon("Warhammer", "warhammer", 8, "", 500);
		temp.addWeapon(warhammer);
		Armor noArmor = new Armor("No Armor", "No type", 0, 0, 0);
		temp.addArmor(noArmor);
		return temp;
	}

	public void addArmor(Armor ny) {
		armor[armorCount] = ny;
		armorCount++;
	}

	public void addWeapon(Weapon ny) {
		weapon[weaponCount] = ny;
		weaponCount++;
	}
	
	public void listWeapons() {
		for (Weapon w : weapon) {
			System.out.println(w.getName());
		}
	}
}
