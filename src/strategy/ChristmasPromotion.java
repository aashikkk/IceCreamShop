package strategy;

public class ChristmasPromotion implements SeasonalPromotionStrategy{
    @Override
    public double applyDiscount(double originalCost) {
        // Apply Christmas promotion discount
        return originalCost * 0.9; // 10% off
    }
}
