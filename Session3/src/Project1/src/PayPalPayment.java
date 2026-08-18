public class PayPalPayment extends payment{

    private String email;

    public PayPalPayment(String paymentDate, double amount, int paymentId, String paymentStatus, String email) {
        super(paymentDate, amount, paymentId, paymentStatus);
        this.email = email;
    }

    @Override
    public void ProcessPayment() {
        System.out.println("Connecting to PayPal");
        System.out.println("Processing PayPal Payment");
        setPaymentStatus("Completed");
    }
}
