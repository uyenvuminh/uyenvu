/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fibonacci;

import static Fibonacci.Fibo.fib;
import java.util.Scanner;

/**
 *
 * @author Vux Mih Uyn
 */
public class S06 {

    public static void main(String[] args) {
        Fibo oo = new Fibo();
        oo.input();
        System.out.println("  Thanks for using my services!");

    }

}

//        //If the requirement is to find exactly the first 45 Fibonacci numbers:
//        System.out.println("The 45 sequence fibonacci: ");
//        int n = 45;
//        System.out.println("");
//         for (int i = 0; i < n; i++) {//Let i go from 0 to n
//                        System.out.print(fib(i));
//                        if (i < n - 1) {
//                            System.out.print(" , "); //If the position is next to the end, print ","
//                        }
//                    }
//                    System.out.println(" ");
