package p8;

import java.util.Scanner;

/**
 * Sales.java
 *
 * Reads in and stores sales for each of 5 salespeople. Displays
 * sales entered by salesperson id and total sales for all salespeople.
 * @author Gabriel Hung
 * @version 1.0
 */
public class Sales {
    /**
     * Main method.
     * @param args unused
     */
    public static void main(String[] args) {
        final int max = 9999;
        int salespeople;
        int sum;
        double average;
        int maxSale;
        int maxID;
        int minSale = max;
        int minID = 0;
        int maximum;
        int count = 0;
        Scanner scan = new Scanner(System.in);

        maxSale = 0;
        maxID = 0;

        System.out.print("How many salespeople?: ");
        salespeople = scan.nextInt();
        int[] sales = new int[salespeople];

        for (int i = 0; i < sales.length; i++) {
            System.out.print("Enter sales for salesperson " + (i + 1) + ": ");
            sales[i] = scan.nextInt();
            if (sales[i] > maxSale) {
                maxSale = sales[i];
                maxID = i + 1;
            }
            if (sales[i] < minSale) {
                minSale = sales[i];
                minID = i + 1;
            }
        }

        System.out.println("\nSalesperson Sales");
        System.out.println(" ------------------ ");
        sum = 0;
        for (int i = 0; i < sales.length; i++) {
            System.out.println(" " + (i + 1) + " " + sales[i]);
            sum += sales[i];
        }
        System.out.println("\nTotal sales: " + sum);
        average = (double) sum / salespeople;
        System.out.println("\nAverage sales: " + average);
        System.out.println("\nSalesperson " + maxID
                + " had the highest sale with " + maxSale);
        System.out.println("\nSalesperson " + minID
                + " had the lowest sale with " + minSale);

        System.out.print("Enter a maximum amount of sales: ");
        maximum = scan.nextInt();
        scan.close();

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > maximum) {
                System.out.println("\nSalesperson " + (i + 1) + " with "
                        + sales[i] + " sales");
                count++;
            }
        }
        System.out.println("\nTotal number of salespeople who exceeded maximum"
                + " amount of sales: " + count);
    }
}

