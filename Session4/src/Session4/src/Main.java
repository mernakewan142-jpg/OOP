public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank(1, "National Bank", "Cairo");

        Teller teller = new Teller(101, "Ahmed");

        Customer customer = new Customer(1, "Damietta", 101, "Merna", 123456789);

        Checking checking = new Checking(1001, 1);

        Savings savings = new Savings(1002, 1);

        Loan loan = new Loan(2001, 101, 1, "personal Loan");



        customer.withdrawMoney();
        customer.depositMoney();
        customer.closeAccount();

        teller.collectMoney();
        teller.openAccount();
        teller.issueCard();
    }
}
