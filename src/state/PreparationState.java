package state;

import icecreamshop.Order;
import state.OrderState;

// Concrete states - 2
public class PreparationState implements OrderState {
    @Override
    public void processOrder(Order order) {
        System.out.println("icecreamshop.Order is being prepared.");
        order.setStatus("In Preparation");
    }
}
