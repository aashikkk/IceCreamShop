package state;

import icecreamshop.Order;

// State pattern
public interface OrderState {
    void processOrder(Order order);
}
