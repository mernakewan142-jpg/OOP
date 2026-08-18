public class BankAccount {

        private String accountNumber;
        private String customerName;
        private double balance;

        private static int totalAccounts = 0;

        public static final double minimumBalance = 500;


        public BankAccount(String accountNumber, String customerName, double balance) {
            this.accountNumber = accountNumber;
            this.customerName = customerName;
            this.balance = balance;
            totalAccounts++;
        }


        public void deposit(double amount) {
            balance += amount;
        }


        public void deposit(double amount, String description) {
            balance += amount;
            System.out.println("Description: " + description);
        }


        public void withdraw(double amount) {
            if (amount <= balance) {
                balance -= amount;
            }
        }


        public String getAccountNumber() {
            return accountNumber;
        }

        public String getCustomerName() {
            return customerName;
        }

        public double getBalance() {
            return balance;
        }


        protected void setBalance(double balance) {
            this.balance = balance;
        }


        public static int getTotalAccounts() {
            return totalAccounts;
        }


        @Override
        public String toString() {
            return "Account Number: " + accountNumber
                    + "\nCustomer Name: " + customerName
                    + "\nBalance: " + balance;
        }
    }
