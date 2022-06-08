import java.util.ArrayList;

public class CoffeeKiosk {
    // member variables
    private ArrayList<Item> menu;
    private ArrayList<Order> orders;

    // constructor
    public CoffeeKiosk() {
        this.menu = new ArrayList<>();
        this.orders = new ArrayList<>();
    }

    // ------methods------
    // create a new item and add it to menu
    public void addMenuItem(String newName, double newPrice) {
        // creates and adds new item to menu arraylist
        Item newItem = new Item(newName, newPrice);
        menu.add(newItem);
        // find index of new menu item in array and add it to Item object
        int index = menu.indexOf(newItem);
        newItem.setIndex(index);
    }

    // display menu
    public void displayMenu() {
        for(Item item:menu) {
            System.out.printf("%d %s -- $%.2f\n", item.getIndex(), item.getName(), item.getPrice());
        }
    }

    // take a new order from user
    public void newOrder() {
        // shows the user a message prompt and then sets their input to a variable, name
        System.out.println("Please enter customer name for a new order:");
        String newName = System.console().readLine();
        // creates new Order instance
        Order newOrder = new Order(newName);
        // displays menu for user
        displayMenu();
        // prompt user to enter order option or press 'q' for quit
        System.out.println("Please enter a menu item index or q to quit:");
        String itemNumber = System.console().readLine();

        // while loop to collect all users order items
        while(!itemNumber.equals("q")) {
            // cast itemnumber to integer for indexing
            int i = Integer.parseInt(itemNumber);
            // check that item number is in menu
            if(i < menu.size()) {
                // add item at index i to order
                newOrder.addItem(menu.get(i));
            } else {
                // if user selects item not on menu
                System.out.println("Please choose a valid item from the menu.");
            }
            System.out.println("Please enter another menu item index or q to quit:");
            itemNumber = System.console().readLine();
        }
        // print order
        newOrder.display();
        // add to orders arraylist
        orders.add(newOrder);
    }
}
