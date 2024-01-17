package builder;

import icecream.IceCream;
import observer.OrderObserver;
import icecreamshop.Order;

// Builder pattern
public class OrderBuilder {
    private Order order = new Order();

    public OrderBuilder addItem(IceCream item) {
        order.addItem(item);
        return this;
    }

    public OrderBuilder addObserver(OrderObserver observer) {
        order.addObserver(observer);
        return this;
    }

    public Order build() {
        return order;
    }
}
