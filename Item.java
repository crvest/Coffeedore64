public class Item {
    // member variables
    private String name;
    private double price;
    private int index;

    // contructor method
    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // name setter/getter
    public void setName(String newName) {
        this.name = newName;
    }
    public String getName() {
        return name;
    }

    // price setter/getter
    public void setPrice(double newPrice) {
        this.price = newPrice;
    }
    public double getPrice() {
        return price;
    }

    // index setter/getter
    public void setIndex(int newIndex) {
        this.index = newIndex;
    }
    public int getIndex() {
        return index;
    }
    
}
