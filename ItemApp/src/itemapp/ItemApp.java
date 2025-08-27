package itemapp;

public class ItemApp {

    public static void main(String[] args) {
        Item[] items = new Item[5];

        items[0] = new Item("101", "Bread", 15.00, 25);
        items[1] = new Item("102", "Milk", 20.50, 30);
        items[2] = new Item("103", "Sugar", 40.00, 18);
        items[3] = new Item("104", "Eggs", 55.00, 21);
        items[4] = new Item("105", "Salt", 10.00, 40);

        items[0].decrQtyOnHand(5);items[0].decrQtyOnHand(5);

        System.out.println("Inventory report");
        System.out.println("--------------------");
        
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i]); // calls toString() on each item.
        }
        
        System.out.println("-----------------------");
        System.out.println("End of inventory report");
        
    } // end of main

} // end of class
