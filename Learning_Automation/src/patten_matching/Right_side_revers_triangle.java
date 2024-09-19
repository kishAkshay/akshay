package patten_matching;

public class Right_side_revers_triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 5;
		for (int i = 1; i <=num; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print("  ");
			}
			for (int k = i; k <=num; k++) {
				System.out.print("* ");
			}
			System.out.println();
			
		}

	}

}
