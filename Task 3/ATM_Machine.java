
import java.util.Scanner;

    public class ATM_Machine {
        public static void main(String[] args) {
            BankAccount userAccount = new BankAccount(1000.0); // Initial balance of $1000
            ATM atm = new ATM(userAccount);

            System.out.println("Welcome to the SBI ATM!");
            atm.run();
        }
    }

    class BankAccount {
        private double balance;

        public BankAccount(double initialBalance) {
            balance = initialBalance;
        }

        public double getBalance() {
            return balance;
        }

        public void deposit(double amount) {
            balance += amount;
        }

        public boolean withdraw(double amount) {
            if (amount > balance) {
                System.out.println("Insufficient balance.");
                return false;
            } else {
                balance -= amount;
                return true;
            }
        }
    }

    class ATM {
        private BankAccount account;

        public ATM(BankAccount account) {
            this.account = account;
        }

        public void displayOptions() {
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
        }

        public void run() {
            Scanner userInput = new Scanner(System.in);

            while (true) {
                displayOptions();
                int choice = userInput.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Current Balance: " + account.getBalance());
                        break;
                    case 2:
                        System.out.print("Enter the deposit amount: ");
                        double depositAmount = userInput.nextDouble();
                        account.deposit(depositAmount);
                        System.out.println("Deposited: " + depositAmount);
                        break;
                    case 3:
                        System.out.print("Enter the withdrawal amount: ");
                        double withdrawAmount = userInput.nextDouble();
                        if (account.withdraw(withdrawAmount)) {
                            System.out.println("Withdrawn: " + withdrawAmount);
                        }
                        break;
                    case 4:
                        System.out.println("Thank you for using the SBI ATM.");
                        return;
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            }
        }
    }

    


