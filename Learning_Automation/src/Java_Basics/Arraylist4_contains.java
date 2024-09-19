package Java_Basics;

import java.util.ArrayList;

public class Arraylist4_contains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a1 = new ArrayList();
		a1.add("cat");
		a1.add("dog");
		a1.add("rat");
		a1.add("bat");
		a1.add("kids");
		System.out.println(a1);
		
		if (a1.contains("rat")){ 	// contains method return true or false.
			System.out.println("Test cases is pass");
			
		} else {
			System.out.println("Test cases is fail");
		}
	}

}
