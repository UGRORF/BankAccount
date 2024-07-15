public class CardAccount extends BankAccount{
    public CardAccount() {
        super();
    }

    @Override
    public void take(double amount) {
        double procent = amount * 0.01;
        if(balance >= amount) {
            balance -= amount + procent;
        }
    }
}
