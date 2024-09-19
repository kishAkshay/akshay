package Java_Basics;

import java.util.ArrayList;

public class Arraylist5_get {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a1 = new ArrayList();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		a1.add(50);
		System.out.println(a1.get(2)); // it will fetch the element upon index and return type is object type
		
		for (int i = 0; i < a1.size(); i++) {
			
			Object a2 = a1.get(i);
			System.out.println(a2);
			
		}
	}

}
