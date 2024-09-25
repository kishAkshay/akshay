package patten_matching;

public class Piramid_Traingle {

	public static void main(String[] args) {
		int n =5;
		//outer Handling the number rows
		for (int i = 1; i <=n; i++) {
			//inner loop handling the spaces
			for (int j = 4; j >=i; j--) {
				System.out.print(" ");
			}
			//inner loop handling the stars
			for (int k = 1; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
