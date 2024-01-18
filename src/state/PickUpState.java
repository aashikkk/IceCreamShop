package state;

import icecreamshop.Order;

public class PickUpState implements OrderState {
    @Override
    public void processOrder(Order order) {
        System.out.println("Your order is ready for pickup");
        order.setStatus("Ready for pickup");
    }
}
