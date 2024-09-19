package Java_Basics;

import java.util.Vector;

public class Vector1_add {
	public static void main(String[] args) {
		Vector v1 = new Vector();
		v1.add(10);
		v1.add(20.55);
		v1.add('A');
		v1.add("Hello");
		v1.add(null);
		v1.add(true);
		
		System.out.println(v1);
		
	}
	

}
