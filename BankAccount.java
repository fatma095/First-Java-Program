public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountNumber,
                       String accountHolderName,
                       double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;

        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0;
            System.out.println(
                "Warning: Initial balance cannot be negative. Set to 0.");
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.printf(
                "Deposited: KSh %.2f. New Balance: KSh %.2f%n",
                amount, balance);
        } else {
            System.out.println(
                "Error: Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println(
                "Error: Withdrawal amount must be positive.");
            return;
        }

        if (amount > balance) {
            System.out.println(
                "Error: Insufficient funds. Available balance: KSh "
                + balance);
            return;
        }

        balance -= amount;
        System.out.printf(
            "Withdrew: KSh %.2f. New Balance: KSh %.2f%n",
            amount, balance);
    }
}