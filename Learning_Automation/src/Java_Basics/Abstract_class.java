package Java_Basics;


	
	abstract class Demo{
		 abstract void test();
		 abstract void disp();
	}
	
	class Sample extends Demo{
		 void test() {
			System.out.println("Implimenting the test method");
		}
		void disp() {
			System.out.println("Implimenting the disp method");
		}
	}
	class Abstract_class{
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample s1 = new Sample();
		s1.disp();
		s1.test();
	}

}

