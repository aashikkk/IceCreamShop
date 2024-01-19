package observer;

import java.util.ArrayList;
import java.util.List;

public class LoyaltyProgram {
    private List<LoyaltyProgramObserver> observers = new ArrayList<>();
    private int loyaltyPoints = 0;

    public void addObserver(LoyaltyProgramObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(LoyaltyProgramObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers(double purchaseAmount) {
        for (LoyaltyProgramObserver observer : observers) {
            observer.updateLoyaltyPoints(purchaseAmount);
        }
    }

    public int getLoyaltyPoints() {
        return loyaltyPoints;
    }

    public void setLoyaltyPoints(int loyaltyPoints) {
        this.loyaltyPoints = loyaltyPoints;
    }

    // Additional method to simulate a purchase and notify observers
    public void makePurchase(double purchaseAmount) {
        // Update loyalty points based on the purchase amount
        int earnedPoints = (int) (purchaseAmount / 10);
        this.loyaltyPoints += earnedPoints;

        // Notify observers about the update
        notifyObservers(purchaseAmount);
    }
}
