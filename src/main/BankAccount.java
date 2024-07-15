public class BankAccount {
    protected double balance;

    public BankAccount() {
        this.balance = 0;
    }

    public double getBalance() {
        return balance;
    }

    public void put(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void take(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
        }
    }
}
