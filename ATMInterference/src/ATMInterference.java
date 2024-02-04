import java.util.Scanner;
public class ATMInterference {
    private static final int PIN = 1234; // Change the PIN as needed
    private static double balance = 1000; // Initial balance

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the ATM");

        System.out.print("Enter your four-digit PIN: ");
        int pin = scanner.nextInt();

        if (pin != PIN) {
            System.out.println("Incorrect PIN. Exiting.");
            return;
        }

        int choice;
        do {
            System.out.println("1. Check balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Your balance is: $" + balance);
                    break;
                case 2:
                    System.out.print("Enter the deposit amount: $");
                    double depositAmount = scanner.nextDouble();
                    balance += depositAmount;
                    System.out.println("Deposit successful. Your new balance is: $" + balance);
                    break;
                case 3:
                    System.out.print("Enter the withdrawal amount: $");
                    double withdrawAmount = scanner.nextDouble();
                    if (withdrawAmount > balance) {
                        System.out.println("Insufficient funds. Withdrawal unsuccessful.");
                    } else {
                        balance -= withdrawAmount;
                        System.out.println("Withdrawal successful. Your new balance is: $" + balance);
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 4);

        scanner.close();
    }

}
