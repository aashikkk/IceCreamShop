package strategy;

// Concrete strategies
public class CashPaymentStrategy implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Payment Method: Paid $" + amount + " in cash.");
    }
}
