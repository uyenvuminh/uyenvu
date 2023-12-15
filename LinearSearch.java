/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinearSearch; // Linear search.

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Vux Mih Uyn
 */
public class LinearSearch {

    private int n;
    private int find;
    private int[] arr;

    Random rand = new Random();

    /**
     * Create the constructor
     */
    public LinearSearch() {
    }

    /**
     * Enter data:User enters valid data with conditions n >=1
     */
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of array: ");
        boolean f = true;
        while (f) {
            try {
                int n = Integer.parseInt(sc.nextLine());//Requires input of a positive integer
                if (n == 1) { //If there is only one number then print that number and the message is "only one number so no need to sort"
                    System.out.println("Only one number, so no need to sort!");
                    System.out.println("=> Array : 1");
                    System.out.println("             -*-*-*-*-*-*");
                    System.out.println("Enter another number of array: ");
                }
                if (n >= 1) {   //If more than one number is entered, it will sort and print the sorted array, otherwise print the message "The value of the array must be greater than [1]"
                    f = false;
                    this.n = n;
                    arr = new int[n];
                } else {
                    System.out.println("Error: The value of the array must be greater than [1] ");
                    System.out.println("Enter number of array: ");
                }
            } //If the user enters a character, input again
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
    public void random() {
        for (int i = 0; i < arr.length; i++) { //Let i run from 0 to the end of the array length
            Random random = new Random();
            arr[i] = random.nextInt(n - 1);   //Randomly output a sequence of numbers from 0 to n-1
        }
    }

    /**
     * Create a function that takes two arguments: a list and an element to
     * search for. 
     * @return index of number to find
     */
    public int linearSearch(int k) {
        for (int i = 0; i < n; i++) {   //Let i run from 0 to n
            if (arr[i] == k) {  //Let position i in the array be the key to find
                System.out.println(i);         //Returns the position of i which is the key(element) to find
            }
        }
        return -1;//Returns -1 if the element is not found.
    }


     public void showLinearSearch() {
          int result = linearSearch(find);
        if (result == -1) { //Check if element is not found
            System.out.println("The value you are looking for is not in the array."); //display "The value you are looking for is not in the array."
       
        } else {  //If there are 2 identical elements in the sequence, the position of the next element will be printed. We will know the position of the other element.
            System.out.println("Found " + find + " at index: " + result);//Display "find the position of the element you entered , at index..."
        }
    }


    @Override
    public String toString() {
        //Create empty string
        String str = "";
        str += "[";
        //loop to output the array
        for (int i = 0; i < arr.length; i++) {
            //before last position => str = element i + ","
            if (i != arr.length - 1) {
                str += arr[i] + ", ";
            } //Last postion
            else {
                str += arr[i];
            }
        }
        str += "]";
        return str;  //Returns a string without sorting
    }
}
