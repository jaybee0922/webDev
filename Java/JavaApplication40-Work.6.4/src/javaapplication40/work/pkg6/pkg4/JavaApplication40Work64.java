/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication40.work.pkg6.pkg4;

/**
 *
 * @author PROGRAMMER
 */
import java.util.*;

public class JavaApplication40Work64 {

    /**
     * @param args the command line arguments
     */
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

//        System.out.println("Welcome to Java Grocers. ");
//        String myStoreArrays[] = {"Banana", "Coffee", "Cup cake", "Lemon juice", "Ice cream", "Tea"};
//        for (int i = 0; i < myStoreArrays.length; i++) {
//            System.out.println(myStoreArrays[i] + " is at index " + i);
//        }
        System.out.println("Welcome to Java Grocers. ");
        String myStoreArrays[] = {"Banana", "Coffee", "Cup cake", "Lemon juice", "Ice cream", "Tea"};
        String inputButton;
        while (true) {
            System.out.println("What can I help you find? ");
            inputButton = scanner.nextLine();
            for (int i = 0; i < myStoreArrays.length; i++) {
                if (inputButton.equals(myStoreArrays[i])) {
                    System.out.println("We have that in aisle: " + i);
                    continue;
                }
            }
            break;
        }
    }

}
