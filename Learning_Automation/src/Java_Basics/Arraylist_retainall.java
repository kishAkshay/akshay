package Java_Basics;

import java.util.ArrayList;

public class Arraylist_retainall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a1 = new ArrayList();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		a1.add(50);
		
	 ArrayList a2 = new ArrayList();
	 	a2.add(40);
		a2.add(50);
		a2.add(60);
		a2.add(70);
		a2.add(80);
		a2.add(90);
		
		System.out.println(a1);
		System.out.println(a2);
		
		a1.retainAll(a2); 		// it will retain the duplicate element in a1 w.r.t a2
		
		System.out.println(a1);
		System.out.println(a2);
		
		

	}

}
