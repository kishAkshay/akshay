package Java_Basics;


abstract class Demo12{
	abstract void disp();
	abstract void info();
}
	abstract class Sample1 extends Demo12{
		void disp() {
			System.out.println("Abstract method is overiden");
		}
	}
		class Test extends Sample1{
			void info() {
				System.out.println("abstract method ");
			}
		}
	

public class Abstract_class1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Test s1 = new Test();
		 s1.disp();
		s1.info();
	}

}
