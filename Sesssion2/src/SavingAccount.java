public class SavingAccount extends BankAccount {

    private final double minimumBalance = 500;


    public SavingAccount(String accountNumber, String customerName, double balance) {
        super(accountNumber, customerName, balance);
    }


    @Override
    public void withdraw(double amount) {

        if (getBalance() - amount >= minimumBalance) {
            setBalance(getBalance() - amount);
            System.out.println("Savings withdrawal successful.");
        } else {
            System.out.println("Withdrawal failed.");
        }
    }

    @Override
    public String toString() {
        return "Savings Account\n" + super.toString();
    }
}