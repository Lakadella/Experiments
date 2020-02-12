package tools;

public class StatRollerDND {

	
	public static void main(String[] args) {

		int[] nyKarakter = karakterStats();
		

		}
		// TODO Auto-generated method stub

		public static int[] karakterStats() {
			int[] karakter = new int[6];
			for (int i = 0; i < 6; i++) {
				karakter[i] = rullStats();
			}
			return karakter;
		}

		public static int rullStats() {
			int sum = 0;
			int[] stat = new int[4];
			for (int i = 0; i < stat.length; i++) {
				stat[i] = Diceroller.d6(1);
				sum = sum + stat[i];
				// System.out.println(stat[i]);
			}
			int min = findMin(stat);

			int nySum = sum - min;

			System.out.println(" " + nySum);
			return nySum;

		}

		public static int findMin(int[] da) {

			int min;
			min = da[0];
			for (int d : da) {
				if (d < min) {
					min = d;
				}
			}
			return min;
		}
		
		public static int modifier(int attribute) {
			int value = 0;
			switch (attribute) {
			case 1: value = -5; break;
			case 2:
			case 3:value = -4; break;
			case 4:
			case 5:value = -3; break;
			case 6:
			case 7:value = -2; break;
			case 8:
			case 9:value = -1; break;
			case 10:
			case 11:value = 0; break;
			case 12:
			case 13:value = 1; break;
			case 14:
			case 15:value = 2; break;
			case 16:
			case 17:value = 3; break;
			case 18:
			case 19:value = 4; break;
			case 20:
			case 21:value = 5; break;
			default: System.out.println("Error in stats"); break; 
								
			}
			return value;
		}
	}

