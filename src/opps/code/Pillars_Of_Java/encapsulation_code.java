package opps.code.Pillars_Of_Java;

class BankAccount{
	private int accountNumber;
	private String accountHolder;
	private double balance;
	
	
	public BankAccount(int accountNumber, String accountHolder, double balance) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.balance = balance;
	}


	public int getAccountNumber() {
		return accountNumber;
	}


	public String getAccountHolder() {
		return accountHolder;
	}


	public double getBalance() {
		return balance;
	}


	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}


	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void showDetails() {
		System.out.println("Account Holder : "+ accountHolder + ", Account Nmber : "+ accountNumber+", Balance "+ balance);
	}
	
	
	public void deposit(double amount) {
		if(amount > 0) {
			balance += amount;
			System.out.println("Deposited :" +amount);
		}else {
			System.out.println("Invalid deposit amount! ");
		}
	}
	
	public void withdraw(double amount) {
		if(amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("Withdrawn: "+ amount);
		}else {
			System.out.println("Insufficient balance or invalid amount !");
		}
	}
	
	
}
public class encapsulation_code {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount acc = new BankAccount(101, "Manjeet Kumar", 5000);
		acc.showDetails();
		
		acc.setAccountHolder("M Kumar");
		acc.showDetails();
		
		acc.deposit(2000);
		acc.withdraw(1000);
		System.out.println("Updated Balance : "+acc.getBalance());

	}

}
