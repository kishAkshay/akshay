package Java_Basics;


	class Gmail{
		private String password = "dinga";
		private String email_id = "xyz@gmail.com";
		
		public String getpassword () {
			return password;
			
			}
		public String getemail_id() {
			return email_id;
		}
			
			public void setpassword(String password, String email_id) {
				 this.password  = password;
				 this.email_id = email_id;
			}
			
		}
	
	public class Encapsulation_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gmail g1 = new Gmail();
		String old_Password = g1.getpassword();
		System.out.println("old password is "+old_Password);
		System.out.println("the old email id is "+g1.getemail_id());
	 g1.setpassword("dingi","abc@gmail.com");
	 String new_password = g1.getpassword();
		System.out.println("new password is "+new_password);
		System.out.println("new email id is "+g1.getemail_id());

	}

}
