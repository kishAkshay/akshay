package Number_pattern;

public class IncreasingTriangle_with_NumberChanging {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 5, p=1; 
		for (int i = 1; i <=num; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print(p++ +" ");
			}
			System.out.println();
		}

	}

}
