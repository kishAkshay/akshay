package Number_pattern;

public class IncreasingTriangle_with_incrementingRow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 5;
		for (int i = 1,p=1; i <=num; i++,p++) {
			for (int j = 1; j <=i; j++) {
				System.out.print(p+" ");
			}
			System.out.println();
		}

	}

}
