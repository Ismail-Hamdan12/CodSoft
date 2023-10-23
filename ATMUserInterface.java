package bankAccount;

	import java.util.Scanner;

	public class ATMUserInterface {
	    private ATM atm;

	    public ATMUserInterface(ATM atm) {
	        this.atm = atm;
	    }

	    public void displayMenu() {
	        System.out.println("\nATM Menu:");
	        System.out.println("1. Deposit");
	        System.out.println("2. Withdraw");
	        System.out.println("3. Check Balance");
	        System.out.println("4. Exit");
	    }

	    public void run() {
	        Scanner scanner = new Scanner(System.in);
	        boolean isRunning = true;

	        while (isRunning) {
	            displayMenu();
	            System.out.print("Enter your choice (1/2/3/4): ");
	            int choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter the deposit amount: $");
	                    double depositAmount = scanner.nextDouble();
	                    atm.deposit(depositAmount);
	                    System.out.println("Deposit completed.");
	                    break;
	                case 2:
	                    System.out.print("Enter the withdrawal amount: $");
	                    double withdrawalAmount = scanner.nextDouble();
	                    if (atm.withdraw(withdrawalAmount)) {
	                        System.out.println("Withdrawal completed.");
	                    } else {
	                        System.out.println("Withdrawal failed. Insufficient balance.");
	                    }
	                    break;
	                case 3:
	                    double balance = atm.checkBalance();
	                    System.out.println("Your balance is: $" + balance);
	                    break;
	                case 4:
	                    System.out.println("Thank you for using the ATM. Goodbye!");
	                    isRunning = false;
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please select a valid option.");
	            }
	        }

	        scanner.close();
	    }

	    public static void main(String[] args) {
	        ATM atm = new ATM(1000.0); // Initial ATM balance
	        ATMUserInterface atmUI = new ATMUserInterface(atm);
	        atmUI.run();
	    }
	}


