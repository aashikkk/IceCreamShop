package observer;

import icecreamshop.Order;
public interface OrderObserver {
    void update(Order order);
}
