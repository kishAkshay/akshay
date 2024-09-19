package Java_Basics;

import java.util.ArrayList;

public class Arraylist2_addall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ArrayList a1 = new ArrayList();
			a1.add(10);
			a1.add(20);
			a1.add(30);
			ArrayList a2 = new ArrayList();
			a2.add('A');
			a2.add('B');
			a2.add('C');
			System.out.println(a1);
			System.out.println(a2);
			a1.addAll(a2);	//It add's all the elements from a2 to a1
			System.out.println(a1);
			System.out.println(a2);
			a1.addAll(2, a2);
			System.out.println(a1);
			System.out.println(a2);
	}

}
