package Java_Basics;

import java.util.ArrayList;

public class Arraylist_add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a1 = new ArrayList();
		a1.add(10);
		a1.add(20.55);
		a1.add('A');
		a1.add("Hello");
		a1.add(null);
		a1.add(true);
		System.out.println(a1);
		a1.add(2, "java");
		System.out.println(a1);
		
		ArrayList<Integer> a2 = new ArrayList<Integer>();
		a2.add(10);
		a2.add(20);
		a2.add(30);
		a2.add(40);
		a2.add(null);
		a2.add(50);
		System.out.println(a2);
		
		
		
		

	}

}
