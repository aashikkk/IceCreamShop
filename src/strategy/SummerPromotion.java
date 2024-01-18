package strategy;

public class SummerPromotion implements SeasonalPromotionStrategy {
    @Override
    public double applyDiscount(double originalCost) {
        // Apply summer promotion discount
        return originalCost * 0.8; // 20% off
    }
}
