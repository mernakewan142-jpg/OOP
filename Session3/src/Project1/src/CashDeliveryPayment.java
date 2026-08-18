public class CashDeliveryPayment extends payment{

    public CashDeliveryPayment(String paymentDate, double amount, int paymentId, String paymentStatus) {
        super(paymentDate, amount, paymentId, paymentStatus);
    }

    @Override
    public void ProcessPayment() {
        System.out.println("Payment Will be Made Upon Delivery.");
        setPaymentStatus("Pending");
    }
}
