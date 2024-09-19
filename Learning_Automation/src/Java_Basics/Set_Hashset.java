package Java_Basics;

import java.util.HashSet;

public class Set_Hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet a1 = new HashSet(); // it will not follow the order of inception and it will not allow the duplicate
		a1.add(10);
		a1.add(20.55);
		a1.add('A');
		a1.add("Hello");
		a1.add(null);
		a1.add(true);
		a1.add(10);
		a1.add(null);
		
		System.out.println(a1);

	}

}
