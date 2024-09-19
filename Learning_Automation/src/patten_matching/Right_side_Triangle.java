package patten_matching;

public class Right_side_Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 5;
		for (int i = 1; i <=num; i++) {
			for (int j = i; j<=num; j++) {
				System.out.print("  ");
			}
			for (int k = 1; k<=i; k++) {
				System.out.print("* ");
			}
			System.out.println();
			
		}

	}

}
