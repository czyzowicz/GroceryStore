package GroceryStore;

public class Room {
    private boolean isServiceRoom;
    private int quantityOfDoors;
    private int quantityOfWindows;
    private int quantityOfShelf;

    public Room(boolean isServiceRoom, int quantityOfDoors, int quantityOfWindows, int quantityOfShelf) {
        this.isServiceRoom = isServiceRoom;
        this.quantityOfDoors = quantityOfDoors;
        this.quantityOfWindows = quantityOfWindows;
        this.quantityOfShelf = quantityOfShelf;
    }

    public boolean isServiceRoom() {
        return isServiceRoom;
    }

    public void setServiceRoom(boolean serviceRoom) {
        isServiceRoom = serviceRoom;
    }

    public int getQuantityOfDoors() {
        return quantityOfDoors;
    }

    public void setQuantityOfDoors(int quantityOfDoors) {
        this.quantityOfDoors = quantityOfDoors;
    }

    public int getQuantityOfWindows() {
        return quantityOfWindows;
    }

    public void setQuantityOfWindows(int quantityOfWindows) {
        this.quantityOfWindows = quantityOfWindows;
    }

    public int getQuantityOfShelf() {
        return quantityOfShelf;
    }

    public void setQuantityOfShelf(int quantityOfShelf) {
        this.quantityOfShelf = quantityOfShelf;
    }
}
