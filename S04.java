/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinarySearch;

/**
 *
 * @author Vux Mih Uyn
 */
public class S04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BinarySearch am = new BinarySearch();
        //Enter the number n of array
        am.input();
        //Random to show a random array from 0 to n-1
        am.rand();
        //Sort
        am.sort();
        //Print random string
        System.out.println("Sorted array: " + am);
        //Use BinarySearch to create array and show index of number to find
        am.binarySearch();
        am.showBinarySearch();
    }
}
