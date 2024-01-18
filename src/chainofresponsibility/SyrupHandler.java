package chainofresponsibility;

import icecream.IceCream;

public class SyrupHandler implements IceCreamHandler {
    private IceCreamHandler next;
    public void setNext(IceCreamHandler next) {
        this.next = next;
    }

    @Override
    public void handleRequest(IceCream iceCream) {
        if (iceCream.getSyrups() == null) {
            System.out.println("Please select a syrup.");
        } else if (next != null) {
            next.handleRequest(iceCream);
        }
    }
}
