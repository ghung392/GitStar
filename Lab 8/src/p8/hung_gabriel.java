package p8;

import java.util.Scanner;

/**Prompts user for size and contents of an array. Program then reverses
 * the contents of the array.
 * @author Gabriel Hung
 * @version 1.0
 */
public class ReverseArray {

    /**Main method.
     * @param args unused
     */
    public static void main(String[] args) {
        int size;
        int count = 1;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        size = scan.nextInt();
        int[] array = new int[size];


        for (int i = 0; i < size; i++) {
            System.out.print("Enter the number in index " + i + ": ");
            array[i] = scan.nextInt();
        }
        scan.close();

        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }

        for (int i = 0; i < size / 2; i++) {
            int track = array[i];
            array[i] = array[size - count];
            array[size - count] = track;
            count++;
        }

        System.out.println("");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }

    }

}
