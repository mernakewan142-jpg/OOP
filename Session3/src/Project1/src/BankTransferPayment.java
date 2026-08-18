public class BankTransferPayment extends payment{

    private String AccountNumber;

    public BankTransferPayment(String paymentDate, double amount, int paymentId, String paymentStatus, String accountNumber) {
        super(paymentDate, amount, paymentId, paymentStatus);
        this.AccountNumber = accountNumber;
    }

    @Override
    public void ProcessPayment() {
        System.out.println("Verifying bank account");
        System.out.println("Processing Bank Transfer");
        setPaymentStatus("Completed");
    }
}
