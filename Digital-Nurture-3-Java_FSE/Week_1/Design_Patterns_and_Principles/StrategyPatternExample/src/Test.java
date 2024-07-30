public class Test {
    public static void main(String[] args) {
        // Create context
        PaymentContext paymentContext = new PaymentContext();

        // Set and use Credit Card payment strategy
        PaymentStrategy creditCardPayment = new CreditCardPayment("7654-9831-4658-4682", "Tony Stark" , "07/37");
        paymentContext.setPaymentStrategy(creditCardPayment);
        paymentContext.executePayment(5000.00);

        // Set and use PayPal payment strategy
        PaymentStrategy payPalPayment = new PayPalPayment("anthonytonystark@example.com");
        paymentContext.setPaymentStrategy(payPalPayment);
        paymentContext.executePayment(2000.00);
    }
}