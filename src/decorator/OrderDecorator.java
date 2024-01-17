package decorator;

import icecreamshop.Order;

// Decorator pattern
public abstract class OrderDecorator extends Order {
    protected Order decoratedOrder;

    public OrderDecorator(Order decoratedOrder) {
        Object description;
        this.decoratedOrder = decoratedOrder;
    }

    public String getDescription() {
        return decoratedOrder.getDescription();
    }

    @Override
    public double calculateTotal() {
        return decoratedOrder.calculateTotal();
    }
}
