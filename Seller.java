package GroceryStore;

public class Seller extends People {

    private int workingHours;

    public Seller(int workingHours) {
        this.workingHours = workingHours;
    }

    public Seller(String name, double money, int workingHours) {
        setName(name);
        setMoney(money);
        this.workingHours = workingHours;
    }

     public int getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }
}
