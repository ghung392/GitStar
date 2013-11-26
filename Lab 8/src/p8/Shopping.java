package p8;

import java.util.Scanner;

/**Simulate shopping by adding items to a cart then printing out the total
 * price.
 * @author Gabriel Hung
 * @version 1.0
 */
public class Shopping {

    /**Main method.
     * @param args unused
     */
    public static void main(String[] args) {
        String continueShopping = "y";
        String itemName;
        double itemPrice;
        int quantity;

        Scanner scan = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();

        do {
            System.out.print("Input name of item: ");
            itemName = scan.next();
            System.out.print("Input price of item: ");
            itemPrice = scan.nextDouble();
            System.out.print("How many do you wan to buy? ");
            quantity = scan.nextInt();

            cart.addToCart(itemName, itemPrice, quantity);
            System.out.println(cart);

            System.out.print("Do you want to continue shopping? (y/n) ");
            continueShopping = scan.next();
        }
        while (continueShopping.equals("y"));
        scan.close();

        System.out.println("Please pay " + cart.getTotalPrice());
    }

}
