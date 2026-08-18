public class Main {
    public static void main(String[] args) {

        payment[] payments = {
                new CreditCardPayment("15/8/2026",
                        20000,
                        123,
                        "Completed",
                        "1234"
                ),
                new PayPalPayment("12/2/2026",
                        15000,
                        567,
                        "Completed",
                        "mernakewan@gmail.com"
                ),
                new BankTransferPayment("20/2/2026",
                        600,
                        789,
                        "Completed",
                        "4567"
                ),
                new CashDeliveryPayment("1/8/2026",
                        850,
                        888,
                        "Pending"
                )
        };

        for (payment payment : payments){
            System.out.println("********************");

            payment.ProcessPayment();
            payment.displayPaymentInfo();
        }
    }
}
