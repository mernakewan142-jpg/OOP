public class Main {

    public static void main(String[] args) {

        SavingAccount savings =
                new SavingAccount("101", "Merna", 2000);

        CurrentAccount current =
                new CurrentAccount("102", "Ahmed", 3000);

        savings.deposit(500);
        savings.withdraw(1000);

        current.deposit(1000);
        current.withdraw(3500);

        System.out.println(savings);
        System.out.println();

        System.out.println(current);
        System.out.println();

        System.out.println("Total Accounts: "
                + BankAccount.getTotalAccounts());
    }
}