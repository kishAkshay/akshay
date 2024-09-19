package Java_Basics;

import java.util.Vector;

public class Vector2_capacity_and_size {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v1 = new Vector();
		v1.add(10);
		v1.add(20.55);
		v1.add('A');
		v1.add("Hello");
		v1.add(null);
		v1.add(true);
		
		System.out.println("The capacity is "+v1.capacity());
		System.out.println("The size is "+ v1.size());
		
		Vector v2 = new Vector(4);
		v2.add(10);
		v2.add(20.55);
		v2.add('A');
		v2.add("Hello");
		v2.add(null);
		v2.add(true);
		
		System.out.println("The capacity is "+v2.capacity());
		System.out.println("The size is "+ v2.size());
	}

}
