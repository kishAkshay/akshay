package Java_Basics;

import java.util.LinkedList;

public class Linkedlist_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l1 = new LinkedList();
		l1.add(10);
		l1.add(20.55);
		l1.add('A');
		l1.add("Hello");
		l1.add(null);
		l1.add(true);
		System.out.println(l1.get(2));
		System.out.println(l1);
		
		System.out.println(l1.peek()); // Retrieves, but does not remove, the head (first element) of this list.
		System.out.println(l1);
		
		System.out.println(l1.poll()); //Retrieves and removes the head (first element) of this list.
		System.out.println(l1);

	}

}
