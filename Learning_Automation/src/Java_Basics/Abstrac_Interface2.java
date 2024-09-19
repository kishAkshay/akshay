package Java_Basics;


interface Father{
	void child1();
	void child2();
}
abstract class Mother implements Father{
	public void child1() {
		System.out.println("implemented child1");
	}
}
class GrandMother extends Mother{
	public void child2() {
		System.out.println("Implemented child2");
	}
}
public class Abstrac_Interface2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GrandMother g1 = new GrandMother();
		g1.child1();
		g1.child2();
	}

}
