package icecream;

import java.util.ArrayList;
import java.util.List;

public class BasicIceCream implements IceCream {
    private String flavor;
    private List<String> toppings = new ArrayList<>();

    @Override
    public String getDescription() {
        return "Basic Ice Cream";
    }

    @Override
    public double cost() {
        return 10.0;
    }

    @Override
    public String getFlavor() {
        return flavor;
    }

    @Override
    public List<String> getToppings() {
        return toppings;
    }

    @Override
    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    @Override
    public void addTopping(String topping) {
        toppings.add(topping);
    }
}
