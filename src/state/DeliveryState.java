package state;

import icecreamshop.Order;

// Concrete states - 3
public class DeliveryState implements OrderState {
    @Override
    public void processOrder(Order order) {
        System.out.println("Order is out for delivery.");
        order.setStatus("Out for Delivery");
    }

}
