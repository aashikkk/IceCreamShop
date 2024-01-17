package strategy;

// Concrete strategies
public class CashPaymentStrategy implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " in cash.");
    }
}