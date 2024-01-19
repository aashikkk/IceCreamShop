package observer;

public interface LoyaltyProgramSubject {
    void addObserver(LoyaltyProgramObserver observer);
    void removeObserver(LoyaltyProgramObserver observer);
    void notifyObserver(double purchaseAmount);
}
