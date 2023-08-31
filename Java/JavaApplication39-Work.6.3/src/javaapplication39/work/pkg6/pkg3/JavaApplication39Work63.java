/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication39.work.pkg6.pkg3;

/**
 *
 * @author PROGRAMMER
 */
import java.util.*;

public class JavaApplication39Work63 {

    /**
     * @param args the command line arguments
     */
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Welcome to my small shop for food and tea. ");
        String myStoreArrays[] = {"Banana", "Coffee", "Tea"};
        String myInputButton;
        while (true) {
            System.out.println("Do you have Banana? ");
            myInputButton = scanner.nextLine();
            if (myInputButton.equals("Yes")) {
                System.out.println("Yes! we have that banana product.");
                break;
            }
            System.out.println("Do you have Coffee? ");
            myInputButton = scanner.nextLine();
            if (myInputButton.equals("Yes")) {
                System.out.println("Yes! we that coffee product.");
                break;
            }
            System.out.println("Do you have Tea? ");
            myInputButton = scanner.nextLine();
            if (myInputButton.equals("Yes")) {
                System.out.println("Yes! we that tea product.");
                break;
            } else {
                System.out.println("Sorry, but we don't have that product");
            }
            scanner.close();
        }

    }

}
