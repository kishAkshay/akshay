package patten_matching;

public class Diamand_pattarn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 5;
		for (int i = 1; i <num; i++) {
			for (int j = i; j <=num; j++) {
				System.out.print("  ");
			}
			for (int k = 1; k < i; k++) {
				System.out.print("* ");
			}
			for (int l = 1; l <=i; l++) {
				System.out.print("* ");
			}
			System.out.println();
			
		}
		for (int i = 1; i <=num; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print("  ");
			}
			for (int k = i; k <num; k++) {
				System.out.print("* ");
			}
			for (int l = i; l <=num; l++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
