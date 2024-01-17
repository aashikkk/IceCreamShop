package decorator;

import icecreamshop.Order;

// Concrete decorator for adding gift wrapping
public class GiftWrappingDecorator extends OrderDecorator {
    public GiftWrappingDecorator(Order decoratedOrder) {
        super(decoratedOrder);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Gift Wrapping";
    }

    @Override
    public double calculateTotal() {
        return super.calculateTotal() + 2.0; // Additional cost for gift wrapping
    }
}
