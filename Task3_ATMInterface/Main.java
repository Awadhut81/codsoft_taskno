import java.util.Scanner;

class ATM {
    private double balance = 10000;

    public void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Amount Deposited Successfully!");
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal Successful!");
        } else {
            System.out.println("Insufficient Balance!");
        }
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ATM atm = new ATM();
        int choice;

        do {
            System.out.println("\nATM Menu");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch(choice) {
                case 1:
                    atm.checkBalance();
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = sc.nextDouble();
                    atm.deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = sc.nextDouble();
                    atm.withdraw(withdrawAmount);
                    break;
                case 4:
                    System.out.println("Thank you for using ATM!");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

        } while(choice != 4);

        sc.close();
    }
}
