package actionItem_Q10;

public class bankAccount {

	


	private String accountnumber;
	private double balabce;
	private String customer;
	private String email;
	private long phone_number;
	
	
	public String getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(String accountnumber) {
		this.accountnumber = accountnumber;
	}

	public double getBalabce() {
		return balabce;
	}

	public void setBalabce(double balabce) {
		this.balabce = balabce;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(long phone_number) {
		this.phone_number = phone_number;
	}


	
	//---------
    

    public void deposit(double amount) {
    	System.out.println("Deposit value:\t\t\t" + amount);
    	balabce += amount;
    	System.out.println("Balance after deposit:\t\t" + balabce);
    }

    public void withdraw(double amount) {
    	System.out.println("withdraw value:\t\t\t" + amount);
        if (amount <= balabce) {balabce -= amount;}
        else {System.out.println("Insufficient funds. Cannot withdraw.");}}

    public double getBalance() { return balabce; }

    

    	
	public void PrintInfoAcc () {
		System.out.println("Account Number :\t\t"	+ accountnumber +"\nCustomer Name:\t\t\t" + customer
							+"\nEmail:\t\t\t\t"+email+"\nMobail Nm:\t\t\t"+phone_number
						
							+"\nInitial balance:\t\t" + balabce+"\n------");}
	   	
}
