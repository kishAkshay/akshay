package Java_Basics;


interface Animal{
	void noise();
}
class Cat implements Animal{
	public void noise() {
		System.out.println("meoww meoww");
	}
}
class Dog implements Animal {
	public void noise() {
		System.out.println("bow bow");
	}
}
class Snake implements Animal{
	public void noise() {
		System.out.println("hiss hiss");
	}
}
class Simulator{
	static void sound(Animal a1) {
		a1.noise();
	}
}
public class Abstraction_1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat c1 = new Cat();
		Dog d1 = new Dog();
		Snake s1 = new Snake();
		Simulator.sound(c1);
		Simulator.sound(d1);
		Simulator.sound(s1);
		
	}

}
