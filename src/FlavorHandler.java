// Concrete handlers

public class FlavorHandler implements IceCreamHandler {
    private IceCreamHandler next;
    public void setNext(IceCreamHandler next) {
        this.next = next;
    }

    @Override
    public void handleRequest(IceCream iceCream) {
        if (iceCream.getFlavor() == null) {
            System.out.println("Please select a flavor.");
        } else if (next != null) {
            next.handleRequest(iceCream);
        }
    }
}
