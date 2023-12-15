/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinarySearch; //Use BinarySearch algorithm to sort an array.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Vux Mih Uyn
 */
public class BinarySearch {

    private int n;
    private int find;
    private int[] arr;
    private int middle;

    /**
     * Create the constructor
     */
    public BinarySearch() {
    }

    /**
     * Enter data: Enter data:User enters valid data with conditions n >=1
     */
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of array: ");
        boolean f = true;
        while (f) {
            try {
                int n = Integer.parseInt(sc.nextLine());  //Requires input of a positive integer
                if (n == 1) { //If there is only one number then print that number and the message is "only one number, so no need to sort"
                    System.out.println("Only one number, so no need to sort!");
                    System.out.println("=> Array : 1");
                    System.out.println("             -*-*-*-*-*-*");
                    System.out.println("Enter another number of array: ");
                }
                if (n > 1) {//If more than 1 is entered, it will sort and print the sorted array, otherwise print the message "The value of the array must be greater than [1]"
                    f = false;
                    this.n = n;
                    arr = new int[n];
                } else {
                    System.out.println("Error: The value of the array must be greater than [1] ");
                    System.out.println("Enter number of array: ");
                }
            } //If the user enters a character, ask to re-enter another number
            catch (NumberFormatException e) {
                System.out.println(">>>Accept only positive integer!");
                System.out.println("Enter number of array: ");
            }

        }
        System.out.println("Enter search value:");//Enter the value you want to find in the array
        find = sc.nextInt();
    }

    /**
     * For: iterates over each element of the array. The nextInt() method of the
     * Random class is called to generate a random integer from 1 to (n-1).
     */
    public void rand() {
        for (int i = 0; i < arr.length; i++) { //Let i run from 0 to the end of the array length
            Random rand = new Random();
            arr[i] = rand.nextInt(n - 1);    //Randomly output a sequence of numbers from 0 to n-1
        }
    }

    /**
     * Rearrange the random array just generated with Arrays.sort(a)
     */
    public void sort() {
        Arrays.sort(arr);
    }

    /**
     * Find the value and print it to the screen If a[mid] is equal to k, the
     * algorithm assigns the value mid to the class-level variable this.mid and
     * returns the value mid. If a[mid] is greater than k, the algorithm updates
     * the last value to mid - 1 to search in the left half of the array. If
     * a[mid] is less than k, the algorithm updates the first value to mid + 1
     * to search in the right half of the array.
     *
     * @return index of number to find
     */
    public int binarySearch() {
        int first = arr[0];   //Set the first element in the array to first
        int last = arr.length - 1;   //Set the last element in the array to last
        boolean f = false; //Value initialization found to be "false"
        while (first <= last) {
            int middle = (first + last) / 2;    //Find value between array (middle)
            if (arr[middle] == find) {
                this.middle = middle;
                f = true; //Set found to "true" if element is found
                return middle;
            } else if (find < arr[middle]) { //If the "find" is less than middle, then move to the left :last = middle - 1.
                last = middle - 1;
            } else {
                first = middle + 1;    //Move to the right
            }
        }
        this.middle = -1; //Set mid to -1 if element is not found
        return -1;//Returns -1 if the element is not found
    }

    /**
     * Show the position of the element to be searched for in the array
     *
     * @returns the search result for the search position of the input element
     * BinarySearch
     */
    public void showBinarySearch() {
        if (middle == -1) { //Check if element is not found
            System.out.println("The value you are looking for is not in the array."); //display "The value you are looking for is not in the array."
        } else {  //If there are 2 identical elements in the sequence, the position of the next element will be printed. We will know the position of the other element.
            System.out.println("Found " + find + " at index: " + middle);//Display "find the position of the element you entered , at index..."
        }
    }

    /**
     * Represent array as String
     *
     * @return sorted string.
     */
    @Override
    public String toString() {
        //Create empty string
        String str = "";
        str += "[";
        //Loop to output the array
        for (int i = 0; i < arr.length; i++) {
            //Before last position => str = element i + ","
            if (i != arr.length - 1) {
                str += arr[i] + ", ";
            } //Last postion
            else {
                str += arr[i];
            }
        }
        str += "]";
        return str; //Return sorted string.
    }
}
