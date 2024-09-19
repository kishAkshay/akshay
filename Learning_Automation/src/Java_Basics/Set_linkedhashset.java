package Java_Basics;

import java.util.LinkedHashSet;

public class Set_linkedhashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashSet a1 = new LinkedHashSet();
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
