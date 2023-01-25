package week2;

public class AccountDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankAccount baccount = new BankAccount(1001, 150.00);
		SavingsAccount saccount = new SavingsAccount(1002, 100.00, 0.04);
		
		saccount.deposit(500.00);
		
		saccount.withdraw(200);
		
		System.out.println(saccount.toString());
	}

}
