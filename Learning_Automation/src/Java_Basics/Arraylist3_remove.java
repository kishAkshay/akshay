package Java_Basics;

import java.util.ArrayList;

public class Arraylist3_remove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a1 = new ArrayList();
		a1.add("java");
		a1.add("hello");
		a1.add("button");
		a1.add("add");
		a1.add("take");
		System.out.println(a1);
		a1.remove(2);	//remove the element by index
		System.out.println(a1);
		a1.remove("take");
		System.out.println(a1);	//remove the element by object
		
		

	}

}
