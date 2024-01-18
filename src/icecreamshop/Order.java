package icecreamshop;// Context class

import icecream.IceCream;
import observer.OrderObserver;
import userprofile.UserProfile;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<IceCream> items = new ArrayList<>();
    private String status;
    private List<OrderObserver> observers = new ArrayList<>();
    private String description;
    private UserProfile userProfile;

    public void setDescription(String description) {
        this.description = description;
    }

    public void addItem(IceCream item) {
        items.add(item);
    }

    public void removeItem(IceCream item) {
        items.remove(item);
    }

    public double calculateTotal(){
        return items.stream().mapToDouble(IceCream::cost)
                .sum();
    }

    public void addObserver(OrderObserver observer){
        observers.add(observer);
    }

    public void removeObserver(OrderObserver observer){
        observers.remove(observer);
    }

    public void notifyObservers(){
        for (OrderObserver observer : observers){
            observer.update(this);
        }
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
        notifyObservers();
    }

    public String getDescription() {
        return description;
    }

    public void setUserProfile(UserProfile userProfile) {
        this.userProfile = userProfile;
    }

    public void reorderFavorites() {
        if(userProfile!= null){
            List<IceCream> favorites = userProfile.getFavoriteIceCreams();
            for (IceCream favorite : favorites){
                addItem(favorite);
            }
        }
    }
}
