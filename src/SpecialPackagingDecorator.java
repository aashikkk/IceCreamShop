// Concrete decorator for adding special packaging
public class SpecialPackagingDecorator extends OrderDecorator {
    public SpecialPackagingDecorator(Order decoratedOrder) {
        super(decoratedOrder);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Special Packaging";
    }

    @Override
    public double calculateTotal() {
        return super.calculateTotal() + 4.0; // Additional cost for special packaging
    }
}
