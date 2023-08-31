/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication44.work.pkg6.pkg10;

/**
 *
 * @author PROGRAMMER
 */
import java.util.*;

public class JavaApplication44Work610 {

    /**
     * @param args the command line arguments
     */
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//
//        String myString = "";
//        System.out.println("How many pizza toppings do you want? ");
//        int myInputButton = scanner.nextInt();
//        scanner.nextLine();
//        System.out.println("Great, enter each topping!");
//        for(int i = 0; i < myInputButton; i++){
//            myString += scanner.nextLine() + " \n";
//        }
//        System.out.println("Thank you! Here are the toppings that you ordered. ");
//        System.out.println("" + myString);

            System.out.println("How many pizza toppings do you want? ");
            int myInputButton = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Great, enter each topping!");
            String myToppings[] = new String[myInputButton];
            for(int i = 0; i < myInputButton; i++){
                myToppings[i] = scanner.nextLine();
            }
            System.out.println("Thank you! Here are the toppings that you ordered.");
            for(int i = 0; i < myToppings.length; i++){
                System.out.println(myToppings[i]);
            }
             
            //OR USE THIS for(String myTopping : myToppings){
            //  System.out.println(myTopping);
            //}   
            
    }
}
