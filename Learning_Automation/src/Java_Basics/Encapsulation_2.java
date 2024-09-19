package Java_Basics;

class Bank_details{
	private int Account_no = 1234;
	private String AccountHolderName = "dinga";
	private double balance = 50000.67;
	
	public int getAccount_no() {
		return Account_no;
	}
	public String getAccountHolderName() {
		return AccountHolderName;
	}
	public double getbalnce() {
		return balance;
	}
		
		public void setAccount_no(int Account_no, String AccountHolderName, double balance) {
			this.Account_no = Account_no;
			this.AccountHolderName = AccountHolderName;
			this.balance = balance;
		}
	}

public class Encapsulation_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank_details b1 = new Bank_details();
	
		int old_accountNo = b1.getAccount_no();
		System.out.println("old account number is "+old_accountNo);
		System.out.println("old name is "+b1.getAccountHolderName());
		System.out.println("old balace is "+b1.getbalnce());
		
		b1.setAccount_no(7788,"dingi",60000.99);
		int new_accountNo = b1.getAccount_no();
		System.out.println("new account number is "+new_accountNo);
		System.out.println("updated name is "+b1.getAccountHolderName());
		System.out.println("new balance is "+b1.getbalnce());

	}

}
