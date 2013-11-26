package p8;

import java.text.NumberFormat;
/**
 * ShoppingCart.java
 *
 * Represents a shopping cart as an array of items.
 * @author Gabriel Hung
 * @version 1.0
 */
public class ShoppingCart {
    /**total number of items in the cart. */
    private int itemCount;
    /**total price of items in the cart. */
    private double totalPrice;
    /**current cart capacity. */
    private final int capacity;
    /**Array holding item objects. */
    private Item[] cart;
    /**
     * Creates an empty shopping cart with a capacity of 5 items.
     */
    public ShoppingCart() {
        final int startCapacity = 1;
        capacity = startCapacity;
        itemCount = 0;
        totalPrice = 0.0;
        cart = new Item[capacity];
    }
    /**
     * Adds an item to the shopping cart.
     * @param itemName item name
     * @param price price of item
     * @param quantity amount purchased
     */
    public void addToCart(String itemName, double price, int quantity) {
        if (itemCount == cart.length) {
            increaseSize();
        }
        cart[itemCount] = new Item(itemName, price, quantity);
        totalPrice += price * quantity;
        itemCount++;
    }

    @Override
    public String toString() {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        String contents = "\nShopping Cart\n";
        contents += "\nItem\tUnit Price\tQuantity\tTotal\n";
        for (int i = 0; i < itemCount; i++) {
            contents += cart[i].toString() + "\n";
        }
        contents += "\nTotal Price: " + fmt.format(totalPrice);
        contents += "\n";
        return contents;
    }
    /**
     * Increases the capacity of the shopping cart by 3.
     */
    private void increaseSize() {
        final int size = 3;
        Item[] temp = new Item[capacity + size];

        for (int item = 0; item < capacity; item++) {
            temp[item] = cart[item];
        }
        cart = temp;
    }
    /**
     * Returns the total price of all the items in the shopping cart.
     * @return total price in currency format
     */
    public String getTotalPrice() {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        return fmt.format(totalPrice);
    }
}
