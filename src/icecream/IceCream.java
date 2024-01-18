package icecream;// Ice cream interface
import java.util.List;

public interface IceCream {
    String getDescription();
    double cost();
    String getFlavor();
    List<String> getToppings();
    List<String> getSyrups();
    void setFlavor(String flavor);
    void addTopping(String topping);
    void addSyrup(String syrup);
}
