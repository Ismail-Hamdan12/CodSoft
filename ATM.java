package bankAccount;

public class ATM {

	    private double balance; // ATM balance

	    public ATM(double initialBalance) {
	        this.balance = initialBalance;
	    }

	    public double checkBalance() {
	        return balance;
	    }

	    public boolean withdraw(double amount) {
	        if (amount > 0 && amount <= balance) {
	            balance -= amount;
	            return true; // Withdrawal successful
	        }
	        return false; // Withdrawal failed
	    }

	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	        }
	    }
	}


