// Concrete observer
public class CustomerOrderObserver implements OrderObserver {
    private String customerName;

    public CustomerOrderObserver(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public void update(Order order) {
        System.out.println("Dear " + customerName + ", your order status is now: " + order.getStatus());
    }
}
