package userprofile;

import icecream.IceCream;

import java.util.ArrayList;
import java.util.List;

public class UserProfile {
    private String username;
    private List<IceCream> favoriteIceCreams;

    public UserProfile(String username, List<IceCream> favoriteIceCreams) {
        this.username = username;
        this.favoriteIceCreams = new ArrayList<>();
    }

    public void addFavoriteIceCream(IceCream  iceCream){
        favoriteIceCreams.add(iceCream);
    }

    public void removeFavoriteIceCream(IceCream iceCream){
        favoriteIceCreams.remove(iceCream);
    }

    public List<IceCream> getFavoriteIceCreams(){
        return favoriteIceCreams;
    }
}
