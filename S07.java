/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinearSearch;

/**
 *
 * @author Vux Mih Uyn
 */
public class S07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinearSearch am = new LinearSearch();
        //Enter the number n of array
        am.input();
        //Random to show a random array from 0 to n-1
        am.random();
        //Print random string
        System.out.println("The array: " + am);
        //Show index of number to find
        am.showLinearSearch();
    }
}
