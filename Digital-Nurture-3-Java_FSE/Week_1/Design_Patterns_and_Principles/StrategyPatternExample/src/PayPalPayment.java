public class PayPalPayment implements PaymentStrategy {
    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(double amount) {
        System.out.println("\nPaying Rs " + amount + " using PayPal.");
        System.out.println("PayPal Email: " + email);
    }
}
