/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SelectionSort; //Use Selection sort algorithm to sort an array.

import java.util.Random;
import java.util.Scanner;

/**
 * @author Vux Mih Uyn
 */
public class SelectionSort {

    private int n;
    private int[] a;

    /**
     * Create the constructor
     */
    public SelectionSort() {
    }

    /**
     * Enter data
     */
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of array: ");
        boolean f = true;
        while (f) {
            try {
                int n = Integer.parseInt(sc.nextLine());
                if (n == 1) { //If there is only one number then print that number and the message is "only one number so no need to sort"
                    System.out.println("Only one number, so no need to sort!");
                    System.out.println("=> Array : 1");
                    System.out.println("             -*-*-*-*-*-*");
                    System.out.println("Enter another number of array: ");
                }
                if (n > 1) {//If more than one number is entered, it will sort and print the sorted array, otherwise print the message "only accept numbers greater than 2 and ask for another number"
                    f = false;
                    this.n = n;
                    a = new int[n];
                } else {
                    System.out.println(">>>Accept positive integer and greater than 1 only! ");
                    System.out.println("             -*-*-*-*-*-*-*-*-*-*-*-*-");
                    System.out.println(" ");
                    System.out.println("Enter number of array: ");
                }
            } //If user enters into a character or an integer or 0, ask to re-enter another number
            catch (NumberFormatException e) {
                System.out.println(">>>Accept only positive integer!");
                System.out.println("      -*-*-*-*-*");
                System.out.println(" ");
                System.out.println("Enter number of array: ");
            }
        }
    }

    /**
     * For: iterates over each element of the array. The nextInt() method of the
     * Random class is called to generate a random integer from 1 to (n-1)
     */
    public void rand() {
        for (int i = 0; i < n - 1; i++) {
            Random rand = new Random();
            a[i] = rand.nextInt(n - 1);
        }
    }

    /**
     * Sort the randomly generated array using SelectionSort B1.Find the
     * smallest element in the unsorted array. B2.Complete the smallest element
     * position with the first element in the unsorted array. Marks the first
     * element as sorted and continues searching for the smallest element in the
     * unsorted array. B3.Complete the smallest element position with the second
     * element in the unsorted array. B4.Continue the process until all the
     * elements in the array are sorted.
     */
    public void selectionSort() {
        for (int i = 0; i < n - 1; i++) {
            int min = i;            //Let first value is minimum
            for (int j = i + 1; j < n; j++) {  // Let j go from next position to the end
                if (a[j] < a[min]) {           // Find the smallest value in the remaining sequence, if it is less than the assigned number "min" , then assign it "Min"
                    min = j;
                }
            }
            //Convert the values of the variables just found
            int temp = a[min];
            a[min] = a[i];
            a[i] = temp;
        }
    }

    /**
     * Represent array as String
     *
     * @Return sorted string
     */
    @Override
    public String toString() {
        //Create an empty string
        String str = "";
        str += "[";
        //Run loop to output a array
        for (int i = 0; i < a.length; i++) {
            //Output str = element i + ","  EXCEPT the last position
            if (i != a.length - 1) {
                str += a[i] + ", ";
            } //At the end of the string, only the number is printed, no commas are added
            else {
                str += a[i];
            }
        }
        str += "]";
        return str;  //Return sorted string
    }
}
