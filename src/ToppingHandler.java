public class ToppingHandler implements IceCreamHandler {
    private IceCreamHandler next;
    public void setNext(IceCreamHandler next) {
        this.next = next;
    }

    @Override
    public void handleRequest(IceCream iceCream) {
        if (iceCream.getToppings().isEmpty()) {
            System.out.println("Please select at least one topping.");
        } else if (next != null) {
            next.handleRequest(iceCream);
        }
    }
}
