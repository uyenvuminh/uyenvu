/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BMI;

import java.util.Scanner;

/**
 *
 * @author Vux Mih Uyn
 */
public class BMI {

    Scanner in = new Scanner(System.in);
    private double bmi;
    private double weight;
    private double height;

    /**
     * Enter data to the program with the 3-feature menu.
     *
     * @Return : Result and tool of the program that user choose .
     */
    public void menu() {
        while (true) {
            System.out.println("========= Calculator Program =========");
            System.out.println("1.Normal Calculator");
            System.out.println("2.BMI Calculator");
            System.out.println("3.Exit");
            System.out.print("Please choice one option: ");
            int opt = checkOption();
            switch (opt) {
                case 1:  //If the user chooses the number 1, calculate the normal calculations
                    System.out.println("----- Normal Calculator -----");
                    normalCalculator();
                    break;
                case 2://if user selects number 2, calculate BMI using user input data
                    System.out.println("----- BMI Calculator -----");
                    calculateBMI();
                    break;
                case 3://if user selects number 3, exit the program and thanks
                    System.out.println(" ++>> Thanks for using my service !! <<++");
                    return;
            }
        }

    }

    /**
     * The function will check whether the number of the input feature is valid
     * from 1 - 3.
     *
     * @return the result of the user's service selection(1-3)
     */
    public int checkOption() {
        while (true) {
            try {
                int input = Integer.parseInt(in.nextLine().trim());
                if (input < 1 || input > 3) {//Check input if it is < 1 or > 3 => get , otherwise throw an exception
                    throw new NumberFormatException();
                }
                return input;
            } catch (NumberFormatException e) {//Throws an exception and requires re-entry.
                System.out.println("Please enter [1-3]");
                System.out.print("Enter again: ");
            }
        }
    }

    /**
     * The function will check whether the entered Weight and Height are valid.
     *
     * @return result input user's weight and height
     */
    public double checkBMI() {
        while (true) {
            try {
                double cBMI = Double.parseDouble(in.nextLine().trim());
                if (cBMI <= 0) {   //Check user weight and height are negative then throw exception, otherwise give user weight and height
                    throw new NumberFormatException();
                }
                return cBMI;
            } catch (NumberFormatException e) {  //If it is not correct, user will be asked to re-enter until it is valid, then continue the program
                System.out.println("Please enter Height and Weight is digit > 0");
                System.out.print("Enter again: ");
            }
        }
    }

    /**
     * The function will check if the divisor entered is valid.
     *
     * @return valid divisor when choosing division
     */
    public double checkDivisor() {
        System.out.print("Enter number: ");
        while (true) {
            try {
                double result = Double.parseDouble(in.nextLine());
                if (result == 0) {  //If divisor = 0, throw an exception asking to re-enter until it is greater than zero
                    throw new NumberFormatException();
                }
                return result;
            } catch (NumberFormatException e) {  //Throws an exception and requires re-entry.
                System.out.println("The divisor must be greater than 0");
                System.out.print("Enter again: ");
            }
        }
    }

    /**
     * The function will check whether the actual numbers entered are valid.
     *
     * @return real numbers to perform calculations
     */
    public double checkNumber() {
        System.out.print("Enter number: ");
        while (true) {
            try {
                double result = Double.parseDouble(in.nextLine());
                if (result >= 0 || result <= 0) { //Check input if it is a real number, get , otherwise throw an exception and ask to re-enter.
                    return result;
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter real number!!");  //Throws an exception and requires re-entry.
                System.out.print("Enter again: ");
            }
        }
    }

    /**
     * The function will check whether the entered calculations are valid.
     *
     * @return Calculus fits in 5 calculations (+, -, *, /, ^)
     */
    public String checkOperator() {
        while (true) {
            String operator = in.nextLine().trim();
            if (operator.isEmpty()) {  // check if not entered, the message is "Not empty" and ask to enter
                System.out.println("Not empty !!");
            } else if (operator.equalsIgnoreCase("+") || operator.equalsIgnoreCase("-") //If user enter 1 in 6 operator, print the result of operator that user choose              
                    || operator.equalsIgnoreCase("*") || operator.equalsIgnoreCase("/")
                    || operator.equalsIgnoreCase("^") || operator.equalsIgnoreCase("=")) {
                return operator;
            } else {
                System.out.println("Please input (+, -, *, /, ^)");//
            }
            System.out.print("Enter Operator again: ");
        }
    }

    /**
     * The function will calculate the normal operations by input calculation
     * and the information of 2 real numbers is checked in the CheckRealNumber
     * function.
     *
     */
    public void normalCalculator() {
        double x;
        x = checkNumber();    //Assign the input real number to the variable x
        while (true) {  //Calculation results are entered 
            System.out.print("Enter operator: ");
            String operator = checkOperator();
            if (operator.equalsIgnoreCase("+")) { //If you enter the "+" sign, the addition will be performed
                x += checkNumber();   //The result x will continue to be assigned by adding two real numbers
                System.out.println("Memory: " + x);
                System.out.println("");
                System.out.println(">> Enter (+, -, *, /, ^) to continue or '=' to comeback to menu");
            }
            if (operator.equalsIgnoreCase("-")) {//If you enter the "-" sign, the subtracting will be performed
                x -= checkNumber();//The result x will continue to be assigned by subtracting two real numbers
                System.out.println("Memory: " + x);
                 System.out.println("");
                System.out.println(">> Enter (+, -, *, /, ^) to continue or '=' to comeback to menu");
            }
            if (operator.equalsIgnoreCase("*")) {//If you enter the "*" sign, the multiplying will be performed
                x *= checkNumber();//The result x will continue to be assigned by multiplying two real numbers
                System.out.println("Memory: " + x);
                 System.out.println("");
                System.out.println(">> Enter (+, -, *, /, ^) to continue or '=' to comeback to menu");
            }
            if (operator.equalsIgnoreCase("/")) {//If you enter the "/" sign, the dividing will be performed
                x /= checkDivisor();//The result x will continue to be assigned by dividing two real numbers
                System.out.println("Memory: " + x);
                 System.out.println("");
                System.out.println(">> Enter (+, -, *, /, ^) to continue or '=' to comeback to menu");
            }
            if (operator.equalsIgnoreCase("^")) {//If you enter the "^" sign, the exponential calculation will be performed
                x = Math.pow(x, checkNumber()); //The result x will continue to be assigned by taking the 2nd number as the exponent and printing the result
                System.out.println("Memory: " + x);
                 System.out.println("");
                System.out.println(">> Enter (+, -, *, /, ^) to continue or '=' to comeback to menu");
            }
            if (operator.equalsIgnoreCase("=")) { //If you enter the "=" sign, it will return to the menu
                System.out.println("Result: " + x);
                 System.out.println("");
                System.out.println(" ++>> Thanks for using my service !! <<++");
                return;
            }
        }

    }

    /**
     * The function will calculate BMI based on input data
     */
    public void calculateBMI() {
        System.out.print("Enter Weight(kg): ");
        weight = checkBMI();            //Weight is checked with CheckBMI()
        System.out.print("Enter Height(cm): ");
        height = checkBMI();            //Height is checked with CheckBMI()
        bmi = weight * 10000 / (height * height);  //BMI is calculated using the formula:bmi = weight * 10000 / (height * height)
        System.out.printf("BMI number: %.2f\n", bmi);
        System.out.println("BMI Status: " + showBMI());   //Print out BMI status of body
    }

    /**
     * The function will check the body condition using the calculated BMI.
     *
     * @return body condition by BMI
     */
    public String showBMI() {
        if (bmi < 19) {   //If BMI is less than 19 then return the result:Under-standard.
            return "UNDER-STANDARD.";
        } else if (bmi >= 19 && bmi < 25) {    //If BMI is less than 19 then return the result:Standard.
            return "STANDARD.";
        } else if (bmi >= 25 && bmi < 30) {   //If BMI is less than 19 then return the result:Overweight
            return "OVERWEIGHT.";
        } else if (bmi >= 30 && bmi < 40) {   //If BMI is less than 19 then return the result:Fat-should lose weight
            return "FAT-SHOULD LOSE WEIGHT";
        } else {                        //Otherwise return:Very fat - should lose weight immediately
            return "VERY FAT - SHOULD LOSE WEIGHT IMMIDIATELY!!";
        }
    }

}
