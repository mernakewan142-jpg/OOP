public class BankAccount {
    private String OwnerName ;
    private double balance ;

    public BankAccount(String ownerName) {
       this.OwnerName = ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getOwnerName() {
        return OwnerName;
    }

    public void setOwnerName(String ownerName) {
        OwnerName = ownerName;
    }
    public void deposit(double amount){
        if (amount > 0)
            balance += amount;
    }
    public void withdrow(double amount){
        if (amount < balance)
            balance -= amount;
    }
}
