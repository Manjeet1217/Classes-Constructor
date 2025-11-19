/*
 * Encapsulation in Java
 * ----------------------
 * Encapsulation means binding data (variables) and methods (functions) together
 * inside a single unit (class).
 *
 * - Variables are usually kept private (data hiding).
 * - Public methods like getters and setters are used to access/modify them.
 * - This ensures data security and controlled access.
 *
 * Example: Just like a medicine capsule, which hides the powder inside and gives
 * only controlled access — in Java, encapsulation hides the data and provides
 * controlled access through methods.
 */


package opps.notes.Pillars_Of_Java;


// here we are providing only for the notes purpose 
// for complete implementaiotn go to the code section
class BankAccount {
    private int accountNumber;
    private String accountHolder;
    private double balance;

    BankAccount(int accountNumber, String accountHolder, double balance) {
        // ...
    }

    public int getAccountNumber() {
        // ...
    	return this.accountNumber;
    }

    public void deposit(double amount) {
        // ...
    }

    public void withdraw(double amount) {
        // ...
    }
}


public class encapsulation_notes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
