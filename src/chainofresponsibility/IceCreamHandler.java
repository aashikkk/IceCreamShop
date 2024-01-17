package chainofresponsibility;

import icecream.IceCream;

;// Chain of Responsibility pattern

public interface IceCreamHandler {
    void handleRequest(IceCream iceCream);
}
