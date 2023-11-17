package actionItem_Q10;

public class Main {

	public static void main(String[] args) {

		bankAccount x1 = new bankAccount();
		x1.setAccountnumber("A123");
		x1.setBalabce(1000);
		x1.setCustomer("Ahmed");
		x1.setEmail("123@gmail.com");
		x1.setPhone_number(9299998765l);
		x1.PrintInfoAcc();
		x1.deposit(2000);
		x1.withdraw(6000.0);
		System.out.println("Balance after withdrawal:\t" + x1.getBalance());
		System.out.println("----------------------------------------------");
	}
}
