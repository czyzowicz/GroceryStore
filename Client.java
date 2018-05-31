package GroceryStore;

import java.util.List;

public class Client extends People {

    private List <String> purchasedVegetables;

    public Client(String name, double money, List<String> purchasedVegetables) {
        super(name, money);
        this.purchasedVegetables = purchasedVegetables;
    }

    public List<String> getPurchasedVegetables() {
        return purchasedVegetables;
    }

    public void setPurchasedVegetables(List<String> purchasedVegetables) {
        this.purchasedVegetables = purchasedVegetables;
    }
}
