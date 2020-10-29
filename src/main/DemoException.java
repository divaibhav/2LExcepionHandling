/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 29-Oct-20
 *  Time: 4:47 PM
 */
package main;

import java.util.InputMismatchException;
import java.util.Scanner;

//demonstrating exception handling using try catch and finally
public class DemoException {
    public static void main(String[] args) {
        int numerator;
        int denominator;
        int result = 0;

        Scanner sc = new Scanner(System.in);
        try{
        System.out.println("enter numerator");
        numerator = sc.nextInt();
        System.out.println("enter denominator");
        denominator = sc.nextInt();

            result = numerator / denominator;
        }
        catch (ArithmeticException e ){
            System.out.println("Denominator can not be zero");
        }
        catch (InputMismatchException e){
            System.out.println("please enter integer value");
        }

        System.out.println("result = " +result );
    }
}
