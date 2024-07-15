import java.time.LocalDate;

public class DepositAccount extends BankAccount{
    public DepositAccount(){
        super();
    }

    private LocalDate lastIncome;
    @Override
    public void put(double amount) {
        if(amount > 0){
            balance += amount;
        }
        lastIncome = LocalDate.now();
    }

    @Override
    public void take(double amount) {
        if(lastIncome.plusMonths(1).isBefore(LocalDate.now())){
            if((amount > 0) && (balance >= amount)){
                balance -= amount;
            }
        } else {
            System.out.println("Еще не прошел месяц с последнего пополнения");
        }
    }
}
