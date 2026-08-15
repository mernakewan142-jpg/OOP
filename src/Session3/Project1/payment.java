package Session3.Project1;

abstract public class payment {
    private int paymentId;
    private double amount;
    private String paymentDate;
    private String PaymentStatus;

    public payment(String paymentDate, double amount, int paymentId, String paymentStatus) {
        this.paymentDate = paymentData;
        this.amount = amount;
        this.paymentId = paymentId;
        this.PaymentStatus = paymentStatus;


    }


    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentData(String paymentDate) {
        this.paymentDate = paymentData;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public String getPaymentStatus() {
        return PaymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.PaymentStatus = paymentStatus;
    }

    public abstract void ProcessPayment();

    public void displayPaymentInfo(){
        System.out.println("payment Id = " + paymentId);
        System.out.println("amount = " + amount);
        System.out.println("payment Date = " + paymentDate);
        System.out.println("Payment Status = " + PaymentStatus);
    }

}
