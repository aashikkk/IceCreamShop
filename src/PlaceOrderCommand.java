// Concrete command for placing an order

public class PlaceOrderCommand implements Command {
    private Order order;

    public PlaceOrderCommand(Order order) {
        this.order = order;
    }

    @Override
    public void execute() {
        System.out.println("Placing order...");
        // Logic to place the order
        order.setStatus("Placed");
    }
}
