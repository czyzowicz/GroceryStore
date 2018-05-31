package GroceryStore;

import java.util.ArrayList;
import java.util.List;

public class GroceryStoreDemo {
    public static void main(String[] args) {
        Seller seller = new Seller("Kazimierz", 325.89, 10);
        Room room = new Room(true, 3, 5, 10);
        List<String> purchasedVegetables = new ArrayList<>();
            purchasedVegetables.add(0, "jabłko");
            purchasedVegetables.add(1, "kapusta");
            purchasedVegetables.add(2, "rzodkiewka");
        Client client = new Client("Jarek", 13.99, purchasedVegetables);
        List<Vegetable> vegetables = new ArrayList<>();
            vegetables.add(new Vegetable(true, 10, "burak"));
            vegetables.add(new Vegetable(true, 6, "kapusta"));
            vegetables.add(new Vegetable(false, 3, "ogórek"));
            vegetables.add(new Vegetable(true, 16, "jabłko"));
            vegetables.add(new Vegetable(false, 5, "rzodkiewka"));
            vegetables.add(new Vegetable(true, 10, "pomidor"));

    GroceryStore groceryStore = new GroceryStore(seller, room, vegetables, client, "Warzywa - tanie i świerze!");

        System.out.println(groceryStore);
    }
}
