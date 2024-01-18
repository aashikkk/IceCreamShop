package icecreamshop;

import builder.OrderBuilder;
import command.*;
import decorator.*;
import icecream.BasicIceCream;
import observer.CustomerOrderObserver;
import state.*;
import strategy.*;

public class IceCreamShop {
    public static void main(String[] args) {
        // Create an order using the Builder pattern
        Order order = new OrderBuilder()
                .addItem(new BasicIceCream())
                .addObserver(new CustomerOrderObserver("Aashik")) // Customer name
                .setDescription("Basic Ice Cream") // Set description
                .build();

        // Execute the PlaceOrderCommand using the dCommand pattern
        Command placeOrderCommand = new PlaceOrderCommand(order);
        placeOrderCommand.execute();

        // Print order details
        System.out.println("Order Description: " + order.getDescription());
        System.out.println("Order Status: " + order.getStatus());
        System.out.println("Order Total Cost: $" + order.calculateTotal());

        // Add gift wrapping using the Decorator pattern
        order = new GiftWrappingDecorator(order);
        System.out.println("After adding gift wrapping:");
        System.out.println("Order Description: " + order.getDescription());
        System.out.println("Order Total Cost: $" + order.calculateTotal());

        // Add special packaging using the Decorator pattern
        order = new SpecialPackagingDecorator(order);
        System.out.println("After adding special packaging:");
        System.out.println("Order Description: " + order.getDescription());
        System.out.println("Order Total Cost: $" + order.calculateTotal());

        // Payment Method
        PaymentStrategy creditCardPayment = new CreditCardPaymentStrategy();
        creditCardPayment.pay(order.calculateTotal());

        // Change order state using the State pattern
        OrderState preparationState = new PreparationState();
        preparationState.processOrder(order);

        // for pickup
        // OrderState pickupState = new PickUpState();
        // pickupState.processOrder(order);

        // for delivery
        OrderState deliveryState = new DeliveryState();
        deliveryState.processOrder(order);

        // Execute the ProvideFeedbackCommand using the Command pattern
        Command provideFeedbackCommand = new ProvideFeedbackCommand("Great service!");
        provideFeedbackCommand.execute();
    }
}