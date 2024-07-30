public class test {
    public static void main(String[] args) {
        Razorpay razorpay = new Razorpay();
        PayPal payPal = new PayPal();
        Stripe stripe = new Stripe();
        PaymentProcessor RazorpayAdapter = new RazorpayAdapter(razorpay);
        PaymentProcessor PayPalAdapter = new PayPalAdapter(payPal);
        PaymentProcessor StripeAdapter = new StripeAdapter(stripe);
        int amount=300;
        RazorpayAdapter.processPayment(amount);
        PayPalAdapter.processPayment(amount);
        StripeAdapter.processPayment(amount);
    }
}