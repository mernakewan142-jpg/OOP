public class Main {
    public static void main(String[] args){
        BankAccount bankAccount = new BankAccount("Merna Kewan" , 111 , 5000);
                bankAccount.display();
        bankAccount.deposit(1000);
        bankAccount.display();
        bankAccount.withdraw(500);
        bankAccount.display();
        System.out.println("Balance is : " + bankAccount.getBalance() );
    }
}
