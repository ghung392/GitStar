package p8;

import java.text.NumberFormat;
/**
 * Item.java
 *
 * Represents an item in a shopping cart.
 * @author Gabriel Hung
 * @version 1.0
 */
public class Item {
    /**Name of item. */
    private final String name;
    /**Price of item. */
    private final double price;
    /**Amount purchased. */
    private final int quantity;
    /**
     * Create a new item with the given attributes.
     * @param itemName Name of item
     * @param itemPrice Price of item
     * @param numPurchased Amount purchased
     */
    public Item(String itemName, double itemPrice, int numPurchased) {
        name = itemName;
        price = itemPrice;
        quantity = numPurchased;
    }
    @Override
    public String toString() {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        return (name + "\t" + fmt.format(price) + "\t" + quantity + "\t"
                + fmt.format(price * quantity));
    }
    /**
     * Returns the unit price of the item.
     * @return unit price
     */
    public double getPrice() {
        return price;
    }
    /**
     * Returns the name of the item.
     * @return item name
     */
    public String getName() {
        return name;
    }
    /**
     * Returns the quantity of the item.
     * @return quantity
     */
    public int getQuantity() {
        return quantity;
    }
}
