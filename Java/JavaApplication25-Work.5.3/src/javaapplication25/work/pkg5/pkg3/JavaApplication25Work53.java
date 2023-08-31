/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication25.work.pkg5.pkg3;

/**
 *
 * @author PROGRAMMER
 */
import java.util.Scanner;

public class JavaApplication25Work53 {

    /**
     * @param args the command line arguments
     */
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        inputValue();
        displayInputValue();
    }

    public static void inputValue() {
        System.out.print("Hi Timmy! Choose a number to count to: ");
    }

    public static int displayInputValue() {
        int myNumbers = scanner.nextInt();
        System.out.print("Great! Here's how it's done");
        for (int i = 0; i <= i; i++) {
            if (myNumbers < i) {
                break;
            }
            System.out.print(" " + i);

        }
        System.out.println(" ");
        return myNumbers;

    }

}
