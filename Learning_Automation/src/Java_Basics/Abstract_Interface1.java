package Java_Basics;


	interface Demo44{
		void disp();
		void test();
	}
	  class Sample44 implements Demo44 {
		public void disp44() {
			System.out.println("HI");
		}
			public void test() {
				System.out.println("java");
			}
		}
	 class Abstract_Interface1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample44 s1 = new Sample44();
		s1.disp44();
		s1.test();
	}

}
