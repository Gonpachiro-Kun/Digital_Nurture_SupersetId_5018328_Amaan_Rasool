public class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;
    private String cardHolderName;
    private String expirationDate;

    public CreditCardPayment(String cardNumber, String cardHolderName, String expirationDate) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.expirationDate = expirationDate;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paying Rs " + amount + " using Credit Card.");
        System.out.println("Card Number: " + cardNumber);
        System.out.println("Card Holder: " + cardHolderName);
        System.out.println("Card Expiry Date: " + expirationDate);
    }
}