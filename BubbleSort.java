/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BubbleSort;

import java.util.Scanner;

/**
 *
 * @author Vux Mih Uyn
 */
public class BubbleSort {

    /**
     *
     */
    public BubbleSort() {

    }

    Scanner sc = new Scanner(System.in);
    int[] arr;
    boolean f = true;
    int type;
    int cout = 0;
    int choose;

    /**
     * Enter data to the program with the 3-feature menu.
     *
     */
    public void menu() {
        System.out.println("======== Bubble Sort Program =======");
        System.out.println("1. Input Element");
        System.out.println("2. Sort Ascending");
        System.out.println("3. Sort Descending");
        System.out.println("4. Exit");
        System.out.print("Please choose one option: ");
    }

    /**
     * The menu will reappear for the user to choose
     */
    public void reMenu() {
        do {
            menu();
            choose = checkData(); //check data entered by checkData function
            switch (choose) {
                case 1: //If the user chooses the number 1, request enter data
                    scanner();
                    break;
                case 2: //if user selects number 2,sort Ascending the string 
                    System.out.println("------- Ascending -------");
                    sortAscending();
                    System.out.println(toString());
                    System.out.println(" ++>> Thanks for using my service !! <<++");
                    System.out.println(" ");
                    break;
                case 3://if user selects number 2,sort Decending the string 
                    System.out.println("------- Descending -------");
                    sortDescending();
                    System.out.println(toString());
                    System.out.println(" ++>> Thanks for using my service !! <<++");
                    System.out.println(" ");
                    break;
                case 4://if user selects number 2,exit the program 
                    System.out.println("==================================");
                    System.out.println(" ++>> Thanks for using my service !! <<++");
                    System.out.println(" ");
                    break;
                default:
                    System.out.println("Please enter [1-4]");

            }
        } while (choose != 4);

    }

    /**
     * To check if the input is a positive integer between 1 and 4, you can
     * follow these steps: Prompt the user for a number using the input()
     * function.
     *
     * @return input value
     */
    public int checkData() {
        while (true) {
            try {
                int input = Integer.parseInt(sc.nextLine().trim());
                if (input < 1 || input > 4) { //if <1 or >4 is entered, a exception is thrown
                    throw new Exception();
                }
                if (cout == 0 && input == 2) {//if the user has not entered the feature =0 and input =2 is entered, a exception is thrown
                    throw new Exception();
                }
                if (cout == 0 && input == 3) {//if the user has not entered the feature =0 and input ==3 is entered, a exception is thrown
                    throw new Exception();
                }
                if (input == 2) { //if =2 is entered,run type2
                    this.type = 2;
                } else {//if =3 is entered,run type3
                    this.type = 3;
                }

                return input;
            } catch (Exception e) {
                System.out.println("Please enter NUMBER [1-4]");
                System.out.print("Please choice one option, again: ");
            }
        }
    }

    /**
     * Bubble Sort will repeat swapping consecutive pairs of elements if they
     * are in the wrong order.
     */
    public void sortAscending() {
        int temp;
        int n = this.arr.length;                          // ascending bubble sort algorithm      
        for (int i = 0; i < n; i++) {                       //i is the number of sorted elements
            for (int j = 1; j < (n - i); j++) {   // traverse from the end of the sequence back to position i
                if (this.arr[j - 1] > this.arr[j]) {   //if the position is wrong, change the place
                    temp = this.arr[j - 1];             //Convert the values of the variables
                    this.arr[j - 1] = this.arr[j];
                    this.arr[j] = temp;
                }

            }
        }
    }

    /**
     * Bubble Sort will repeat swapping consecutive pairs of elements
     */
    public void sortDescending() {
        int temp;
        int n = this.arr.length;    //algorithm bubble sort descending
        for (int i = 0; i < n; i++) {         //i number of molecules sorted
            for (int j = 1; j < (n - i); j++) {// traverse from the end of the sequence back to position i
                if (this.arr[j - 1] < this.arr[j]) {  //if the position is wrong, change the place
                    temp = this.arr[j - 1];    //Convert the values of the variables
                    this.arr[j - 1] = this.arr[j];
                    this.arr[j] = temp;
                }
            }
        }
    }

    /**
     * Input enter the number of elements and elements
     */
    public void scanner() {
        System.out.println("------- Input Element -------");
        System.out.println("Input Length Of Array");
        int num = 0;
        cout++;
        do {
            try {
                f = true;
                System.out.print("Enter Number: ");  //Enter the number of elements in the array to be sorted
                num = sc.nextInt(); //Enter a positive number.
                sc.nextLine();

                if (num <= 0) {      //check if the number of user input elements is negative or zero
                    System.out.println("**Please input a numberand number is greater than zero");
                }
            } catch (Exception e) {                                      // Error if user entered wrong data
                System.out.println("**Please input a numberand number is greater than zero");
                f = false;
                sc.nextLine();
            }
        } while (num <= 0 || f == false);     // exit the loop when the user input is correct
        arr = new int[num];                   //provide memory cells
        for (int i = 0; i < num; ++i) {       //this loop for the user to enter values for the elements in the arr
            do {                                                         //this loop lets the user re-enter the data until it's in the correct format
                try {
                    f = true;
                    System.out.print("Enter Number " + (i + 1) + ": ");
                    arr[i] = sc.nextInt();     //Enter the numbers in the array in order from 1 to n
                    sc.nextLine();
                } catch (Exception e) {
                    System.out.println("**Element must be a number!");
                    f = false;
                    sc.nextLine();
                } //otherwise rerun the loop until the input is valid
            } while (f == false);
        }
    }

    /**
     * Show the user the results of the program
     *
     * @return sorted string Ascending or Descending
     */
    @Override
    public String toString() {
        String str = "";
        if (type == 2) {
            for (int i = 0; i < arr.length; ++i) {     //loop to print values in descending arr
                if (i != arr.length - 1) {
                    str += "[" + arr[i] + "]" + "->";//if not the last position, add arrows from left to right for descending sort
                } else {
                    str += "[" + arr[i] + "]";   //if it is the last position, close brackets and do not add arrows
                }
            }
        } else {
            for (int i = 0; i < arr.length; ++i) {     //loop to print values in descending arr
                if (i != arr.length - 1) {
                    str += "[" + arr[i] + "]" + "<-";  //if it not the last position, add an arrow from right to left for descending sort
                } else {
                    str += "[" + arr[i] + "]";//if it is the last position, close brackets and do not add arrows
                }
            }
        }

        return str; //Returns the sorted string
    }
}
