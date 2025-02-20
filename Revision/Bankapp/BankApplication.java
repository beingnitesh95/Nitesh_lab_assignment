import java.util.Scanner;

public class BankApplication {
    public static BankAccount bankAccount;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter account number: ");
        String accountNumber = sc.next();
        System.out.println("Initial balance: ");
        double balance = sc.nextDouble();

        bankAccount = new BankAccount(accountNumber, balance);
        System.out.println("Initial balance: " + bankAccount.getBalance());

        while (true) {
            System.out.println("1. Deposit\n2. Withdraw\n3. Exit\nEnter your choice: ");
            int choice = sc.nextInt();
            if (choice == 1) {
                System.out.println("Enter amount to deposit: ");
                double amount = sc.nextDouble();
                try {
                    bankAccount.deposit(amount);
                } catch (OverFundException e) {
                    System.out.println(e.getMessage());
                }
            } else if (choice == 2) {
                System.out.println("Enter amount to withdraw: ");
                double amount = sc.nextDouble();
                try {
                    bankAccount.withdraw(amount);
                } catch (NotSufficientException e) {
                    System.out.println(e.getMessage());
                }
            } else if (choice == 3) {
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
