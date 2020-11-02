/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 30-Oct-20
 *  Time: 4:40 PM
 */
package customexception.main;

import customexception.myexception.InvalidInputException;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class MyExceptionMain {
    public static void main(String[] args) {
        MyExceptionMain obj = new MyExceptionMain();
        int input = 0;

        try {
            input = obj.input();
        } catch (InvalidInputException e) {
            System.out.println(e);
        }
    }
    //method to accept input
    public int input() throws InvalidInputException{
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a integer");
        int no = 0;
        try {
            no = sc.nextInt();
        }catch (InputMismatchException | IllegalStateException e){
            throw new InvalidInputException("Invalid input");
        }
        finally {
            sc.close();
        }
        return no;
    }
}
