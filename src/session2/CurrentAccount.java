package session2;

public class CurrentAccount extends BankAccount {

    public CurrentAccount(String accountNumber, String customerName, double balance) {

        super(accountNumber, customerName, balance);

    }

    @Override
    public void withdraw(double amount) {

        if (amount <= getBalance() + 1000) {

            setBalance(getBalance() - amount);

            System.out.println("Withdrawal successful.");

        } else {

            System.out.println("Withdrawal failed.");

        }
    }
        @Override
                public String toString(){
            return "Current Account\n" + super.toString();
        }
    }
