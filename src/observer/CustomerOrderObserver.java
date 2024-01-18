package observer;

import icecreamshop.Order;

// Concrete observer
public class CustomerOrderObserver implements OrderObserver {
    private String customerName;
    private LoyaltyProgram loyaltyProgram;

    public CustomerOrderObserver(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public void update(Order order) {
        System.out.println("Dear " + customerName + ", your order status is now " + order.getStatus());
    }

    @Override
    public void updateLoyaltyPoints(double purchaseAmount) {
        // Assume 1 point for every $10 spent
        int earnedPoints = (int) (purchaseAmount / 10);
        loyaltyProgram.setLoyaltyPoints(loyaltyProgram.getLoyaltyPoints() + earnedPoints);
        System.out.println("Earned " + earnedPoints + " loyalty points. Total points: " + loyaltyProgram.getLoyaltyPoints());
    }
}
