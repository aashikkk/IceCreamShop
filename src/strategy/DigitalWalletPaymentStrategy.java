package strategy;

public class DigitalWalletPaymentStrategy implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        // Implement digital wallet payment logic
        System.out.println("Payment Method: Paid $" + amount + " using Digital Wallet.");
    }
}
