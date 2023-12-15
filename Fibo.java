/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fibonacci;

import java.util.Scanner;

/**
 *
 * @author Vux Mih Uyn
 */
public class Fibo {

    private int n;

    /**
     * Create the constructor
     */
    public Fibo() {
    }

    /**
     * Enter data [n] (n>o , not alphabet, not negative number, not Zero)
     */
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        while (true) {
            try {
                if (sc.hasNextInt()) {//Use the "hasNextInt" function to check if it is a positive integer.
                    n = sc.nextInt();
                    if (n > 0) {//If data is valid, print " The " + n + " sequence fibonacci: to show number of n "
                        System.out.println("The " + n + " sequence fibonacci: ");
                        for (int i = 0; i < n; i++) {//Let i go from 0 to n
                            System.out.print(fib(i));
                            if (i < n - 1) {   //If the position is next to the end, print ","
                                System.out.print(" , ");
                            }
                        }
                        System.out.println(" ");
                        break;   // Exit the loop if the input is valid.
                    } else {//If user enters into a character or an integer or 0, ask to re-enter another number
                        System.out.println("Accept positive integer greater than 0 only!");
                        System.out.println("      -*-*-*-*-*");
                        System.out.println("Enter again: ");
                    }
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {//Discard input if incorrect (negative number, zero or letter, special character)
                System.out.println(">>>Accept only positive integer!");//Display an error message and ask to re-enter
                System.out.println("      -*-*-*-*-*");
                System.out.println("Enter again: ");
                sc.next();
            }
        }
    }

    /**
     * Use recursion to find the Fibonacci number
     *
     * @return Fibonacci numbers found.
     */
    public static int fib(int n) {
        if (n <= 1) {  //Input n , if n <=1 then return n numbers
            return n;
        }
        int a = 0;  //Let a = 0; b=1 and fibo=0
        int b = 1;
        int fibo = 0;
        for (int i = 2; i <= n; i++) {  //Let i go from 2 to n, then let fibo=a=b
            fibo = a + b;   //Assign fibo=a=b
            a = b;      //Continue to assign  a = b
            b = fibo;       //Continue to assign  b = fib
        }
        return fibo; //return Fibonacci numbers found.
    }
}
