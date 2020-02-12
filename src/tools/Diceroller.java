package tools;

public class Diceroller {

	public static void main(String[] args) {

		int rullX = dx(1,2);
		System.out.println(rullX);

	}

	public static int d4(int antall) {
		int sum = 0;
		for (int i = 0; i < antall; i++) {
			int d4 = (int) Math.round((Math.random() * 4) + 0.5);
			sum = sum + d4;
		}

		return sum;

	}

	public static int d6(int antall) {
		int sum = 0;
		for (int i = 0; i < antall; i++) {
			int d6 = (int) Math.round((Math.random() * 6) + 0.5);
			sum = sum + d6;
		}

		return sum;

	}

	public static int d8(int antall) {
		int sum = 0;
		for (int i = 0; i < antall; i++) {
			int d8 = (int) Math.round((Math.random() * 8) + 0.5);
			sum = sum + d8;
		}

		return sum;

	}

	public static int d10(int antall) {
		int sum = 0;
		for (int i = 0; i < antall; i++) {
			int d10 = (int) Math.round((Math.random() * 10) + 0.5);
			sum = sum + d10;
		}

		return sum;

	}

	public static int d12(int antall) {
		int sum = 0;
		for (int i = 0; i < antall; i++) {
			int d12 = (int) Math.round((Math.random() * 12) + 0.5);
			sum = sum + d12;
		}

		return sum;

	}

	public static int d20(int antall) {
		int sum = 0;
		for (int i = 0; i < antall; i++) {
			int d20 = (int) Math.round((Math.random() * 20) + 0.5);
			sum = sum + d20;
		}

		return sum;

	}
	public static int d100(int antall) {
		int sum = 0;
		for (int i = 0; i < antall; i++) {
			int d100 = (int) Math.round((Math.random() * 100) + 0.5);
			sum = sum + d100;
		}

		return sum;

	}
	public static int dx(int antall, int sider) {
		int x = sider;
		int sum = 0;
		for (int i = 0; i < antall; i++) {
			int dx = (int) Math.round((Math.random() * x) + 0.5);
			sum = sum + dx;
		}

		return sum;

	}
}