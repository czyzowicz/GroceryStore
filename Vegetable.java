package GroceryStore;

public class Vegetable {

    private boolean isVegetableFresh;
    private int quantityOfVegetables;
    private String vegetableName;

    public Vegetable(boolean isVegetableFresh, int quantityOfVegetables,String vegetableName) {
        this.isVegetableFresh = isVegetableFresh;
        this.quantityOfVegetables = quantityOfVegetables;
        this.vegetableName = vegetableName;
    }

    public String getVegetableName() {
        return vegetableName;
    }

    public void setVegetableName(String vegetableName) {
        this.vegetableName = vegetableName;
    }

    public boolean isVegetableFresh() {
        return isVegetableFresh;
    }

    public void setVegetableFresh(boolean vegetableFresh) {
        isVegetableFresh = vegetableFresh;
    }

    public int getQuantityOfVegetables() {
        return quantityOfVegetables;
    }

    public void setQuantityOfVegetables(int quantityOfVegetables) {
        this.quantityOfVegetables = quantityOfVegetables;
    }
}
