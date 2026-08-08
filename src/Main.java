//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
     BankAccount bankAccount = new BankAccount("Merna");
     bankAccount.setBalance(1000);
     bankAccount.deposit(2000);
     bankAccount.withdrow(200);
        System.out.println(bankAccount.getBalance());
        System.out.println(bankAccount.getOwnerName());

    }
}