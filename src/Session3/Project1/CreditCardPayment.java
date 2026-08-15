package Session3.Project1;

public class CreditCardPayment extends payment{
    private String CardNumber;



    public CreditCardPayment(String paymentDate, double amount, int paymentId, String paymentStatus , String CardNumber) {
        super(paymentDate, amount, paymentId, paymentStatus);
        this.CardNumber = CardNumber;
    }


    @Override
    public void ProcessPayment() {
        System.out.println("Validating credit card....");
        System.out.println("Processing credit card payment....");
        setPaymentStatus("Completed");
    }
}
