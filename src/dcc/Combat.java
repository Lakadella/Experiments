package dcc;

import tools.Diceroller;

public class Combat {

	private Monster monster;
	private CharacterDCC character;

	public Combat(Monster monster, CharacterDCC character) {
		this.monster = monster;
		this.character = character;

	}

	public boolean hit(int atk, int ac) {
		if (atk == 0) {
			System.out.println("Fumble");
			return false;
		} else if (atk >= ac) {
			System.out.println("Its a hit!");
			return true;
		} else {
			System.out.println("Its a miss!");
			return false;
		}
	}

	public int dmg(int amountDie, int die, int bonus) {
		int dmg = bonus + tools.Diceroller.dx(amountDie, die);
		return dmg;
	}

	public int mAttack() {
		int roll = tools.Diceroller.d20(1);
		boolean hit = hit(roll + monster.getAtkBonus(), character.getAc());
		if (hit) {
			int dmg = dmg(Diceroller.dx(1, monster.getAmountDie()), monster.getDmgDie(), 0);
			System.out.println("You take " + dmg + " damage!");
			return dmg;
		} else {
			return 0;
		}
	}

	public int cAttack() {
		int roll = tools.Diceroller.d20(1);
		boolean hit = hit(roll + character.getStr(), monster.getAc());
		if (hit) {
			Weapon weap = character.getWeapon();
			int dmg = dmg(1, Diceroller.dx(1, weap.getDmgDie()), character.getStr());
			System.out.println("You do " + dmg + " damage!");
			return dmg;
		} else {
			return 0;
		}
	}
}