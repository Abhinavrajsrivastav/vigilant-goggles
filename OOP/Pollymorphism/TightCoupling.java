// TightCouplingExample.java

// Class representing a shopping cart
class ShoppingCart {
    private Item item;

    public ShoppingCart() {
        this.item = new Item();
    }

    public void displayItemDetails() {
        // Accessing item details directly
        System.out.println("Item name: " + item.getName());
        System.out.println("Item price: " + item.getPrice());
    }
}

// Class representing an item
class Item {
    private String name;
    private double price;

    public Item() {
        this.name = "Example Item";
        this.price = 10.0;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

public class TightCoupling {
    public static void main(String[] args) {
        // Creating a shopping cart
        ShoppingCart cart = new ShoppingCart();
        cart.displayItemDetails();
    }
}
