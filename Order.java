import java.util.ArrayList;

public class Order {
    // member variables
    private String name;
    private boolean ready;
    private ArrayList<Item> items;

    // constructor
    public Order() {
        this.name = "Guest";
        this.ready = false;
        this.items = new ArrayList<Item>();
    }
    // overloaded constructor
    public Order(String name) {
        this.name = name;
        this.ready = false;
        this.items = new ArrayList<Item>();
    }

    // name setter/getter
    public void setName(String newName) {
        this.name = newName;
    }
    public String getName() {
        return name;
    }

    // ready setter/getter
    public void setReady(boolean readyState) {
        this.ready = readyState;
    }
    public boolean getReady() {
        return ready;
    }

    // items setter/getter
    public void setItems(ArrayList<Item> newItems) {
        this.items = newItems;
    }
    public ArrayList<Item> getItems() {
        return items;
    }

    // ------order methods------
    // add items
    public void addItem(Item item) {
        this.items.add(item);
    }

    // get status of order
    public String getStatusMessage() {
        if(this.ready == true) {
            return "Your order is ready";
        }
        return "Thank you for waiting. Your order will be ready soon";
    }

    // get total cost of order
    public double getOrderTotal() {
        // initialize total to 0
        double total = 0.0;
        // iterate through items list
        for(Item item:items) {
            // add price of item to total
            total += item.getPrice();
        }
        return total;
    }

    // display order information
    public void display() {
        System.out.printf("Customer name: %s\n", this.getName());
        for(Item item:items) {
            System.out.printf("%s - $%.2f\n",item.getName(), item.getPrice());
        }
        System.out.printf("Total: $%.2f\n", this.getOrderTotal());
        System.out.println("------");
    }
}