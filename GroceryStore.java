package GroceryStore;

import java.util.List;

public class GroceryStore {

    private Seller seller;
    private Room room;
    private List <Vegetable> vegetables;
    private Client client;
    private String groceryStoreName;

    public GroceryStore(Seller seller, Room room, List vegetables, Client client, String groceryStoreName) {
        this.seller = seller;
        this.room = room;
        this.vegetables = vegetables;
        this.client = client;
        this.groceryStoreName = groceryStoreName;
    }

    public String getGroceryStoreName() {
        return groceryStoreName;
    }

    public void setGroceryStoreName(String groceryStoreName) {
        this.groceryStoreName = groceryStoreName;
    }

    @Override
    public String toString() {
        return "GroceryStore{" +
                "seller=" + seller +
                ", room=" + room +
                ", vegetables=" + vegetables +
                ", client=" + client +
                ", groceryStoreName='" + groceryStoreName + '\'' +
                '}';
    }
}
