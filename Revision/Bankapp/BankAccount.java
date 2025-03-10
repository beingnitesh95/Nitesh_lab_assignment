public class BankAccount {

    String accountNumber;
    double balance;
    final double MIN_BALANCE = 10000;
    final double MAX_BALANCE = 1000000;

    BankAccount(String accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double amount) throws OverFundException {
        if (amount<=0){
            System.out.println("Invalid deposit amount");
            return;
        }
        if (amount + balance > MAX_BALANCE){
            throw new OverFundException("Cannot deposit more than 1,000,000");
        }

        balance += amount;
        System.out.println("Deposit successful");
    }

    public void withdraw(double amount) throws NotSufficientException {
        if (amount<=0){
            System.out.println("Invalid withdraw amount");
            return;
        }
        if (amount > balance){
            System.out.println("Insufficient balance");
            return;
        }
       if (balance - amount < MIN_BALANCE){
           throw new NotSufficientException("Cannot withdraw more than 1,000,000");
       }

        balance -= amount;
        System.out.println("Withdraw successful");
    }
}
