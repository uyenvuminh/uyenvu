/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InsertionSort; //Use InsertionSort algorithm to sort an array.

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Vux Mih Uyn
 */
public class InsertionSort {

    private int n;
    private int[] a;

    /**
     * Create the constructor
     */
    public InsertionSort() {
    }

    Random rand = new Random();

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
     * Random class is called to generate a random integer from 1 to (n-1).
     */
    public void rand() {
        for (int i = 0; i < n - 1; i++) {
            Random rand = new Random();
            a[i] = rand.nextInt(n - 1);
        }
    }

    /**
     * Sort the randomly generated array using Insert Sort: B1.Traverse each
     * element in the array from the second to the last element. B2.Compare the
     * current element with the previously sorted elements, find the appropriate
     * position to insert the current element. B3.Insert the current element in
     * its correct position in the previously sorted array.
     */
    public void insertSort() {
        for (int i = 1; i < a.length; ++i) { //Insert sort selects 2nd number as primary key and compares
            int k = a[i];    // Take the second number of the array as key
            int j = i - 1;     // Let j be the first number
            while (j >= 0 && a[j] > k) {   // If j is greater than zero and the value of aj is greater than the primary key
                a[j + 1] = a[j];             // Change assign next value to a[j]
                j = j - 1;
            }
            a[j + 1] = k;
        }
    }

    /**
     * Represent array as String
     *
     * @Return sorted string by InsertSort
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
            } //Last postion
            else {
                str += a[i];
            }
        }
        str += "]";
        return str;//Return sorted string
    }
}
