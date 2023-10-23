package bankAccount;

public class ATM2 {
	
	    private BankAccount account; // Reference to the user's bank account

	    public void ATM(BankAccount account) {
	        this.account = account;
	    }

	    public double checkBalance() {
	        return account.getBalance();
	    }

	    public boolean withdraw(double amount) {
	        if (amount <= 0) {
	            System.out.println("Invalid withdrawal amount. Amount must be greater than zero.");
	            return false;
	        }

	        if (amount > account.getBalance()) {
	            System.out.println("Insufficient balance for withdrawal.");
	            return false;
	        }

	        account.withdraw(amount);
	        return true; // Withdrawal successful
	    }

	    public void deposit(double amount) {
	        if (amount <= 0) {
	            System.out.println("Invalid deposit amount. Amount must be greater than zero.");
	        } else {
	            account.deposit(amount);
	        }
	    }
	}


