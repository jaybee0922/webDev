/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication27.work.pkg5.pkg5;

/**
 *
 * @author PROGRAMMER
 */
import java.util.Scanner;

public class JavaApplication27Work55 {

    /**
     * @param args the command line arguments
     */
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        inputValue();
        displayInputValue();
    }

    public static void inputValue() {
        System.out.println("I hear you like to count by threes ");
        System.out.println("\n");
        System.out.println("Jimmy: It depends. ");
        System.out.println("Oh, ok... ");
    }

    public static void displayInputValue() {
        System.out.println("1. Pick a number to count by: ");
        int firstNumber = scanner.nextInt();
        System.out.println("2. Pick a number to start counting from: ");
        int secondNumber = scanner.nextInt();
        System.out.println("3. Pick a number to count to: ");
        int thirdNumber = scanner.nextInt();
        for (int i = 1; i <= i; i++) {
            secondNumber = (secondNumber);
            System.out.println(secondNumber);
            break;
        }
        for (int i = 0; i <= i; i++) {
            int newTotal = (secondNumber += firstNumber);
            System.out.println(newTotal);
            if (newTotal == thirdNumber) {
                break;
            }
        }
        scanner.close();
    }
}
