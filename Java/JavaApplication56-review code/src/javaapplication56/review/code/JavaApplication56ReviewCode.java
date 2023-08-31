/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication56.review.code;

/**
 *
 * @author PROGRAMMER
 */
import java.util.Scanner;

public class JavaApplication56ReviewCode {

    /**
     * @param args the command line arguments
     */
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("Please enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Thank you " + name + " !");

        System.out.println("Do you want to continue " + name + " ?");
        System.out.println("\n");
        System.out.println("Please enter Yes or No");
        while (true) {
            String inputButton = scanner.nextLine();
            if (!inputButton.equals(inputButton)) {
                continue;
            }
            if (inputButton.equals("Yes")) {
                System.out.println("Welcome to java input system!");
                System.out.println("Hopefully, you will enjoy this game!");
                System.out.println("Once again, have a nice day!");
                break;
            } else if (inputButton.equals("No")) {
                System.out.println("Okay " + name + " , just run the code again once you are ready. Thank you!");
                System.exit(0);
            } else {
                System.out.println("\n");
                System.out.println("INVALID INPUT " + name + "!");
                System.out.println("Please enter Yes or No");
            }

        }

        System.out.println("\n");
        System.out.println("Please enter 5 digits to get the sum: ");
        int myInputArray[] = new int[5];
        int myTotalSum = 0;
        for (int i = 0; i < myInputArray.length; i++) {
            myInputArray[i] = scanner.nextInt();
            myTotalSum += myInputArray[i];
        }
        System.out.println("The sum is: " + myTotalSum);
        System.out.println("\n");
        for (int i = myInputArray.length - 1; i >= 0; i--) {
            System.out.println("The reverse array is: " + myInputArray[i]);
        }

    }

}
