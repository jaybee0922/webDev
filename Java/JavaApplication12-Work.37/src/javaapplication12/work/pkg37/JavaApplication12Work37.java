/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12.work.pkg37;

/**
 *
 * @author PROGRAMMER
 */
import java.util.*;

public class JavaApplication12Work37 {

    /**
     * @param args the command line arguments
     */
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("****ROYAL BANK OF JAVA****");
        System.out.println("Are you here to get a mortage? (yes or no)");
        String firstQuestion = scanner.nextLine();

        switch (firstQuestion) {
            case "yes":
                if (firstQuestion.equals("yes")) {
                    System.out.println("Great! In one line");
                    System.out.println("How much money do you have in your savings? ");
                    System.out.println("And, how much do you owe in credit card debt? ");
                    int savings = scanner.nextInt();
                    int creditCard = scanner.nextInt();

                    System.out.println("How many years you have worked for? ");
                    int years = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("What is your name? ");
                    String name = scanner.nextLine();
                    int newSavings = (savings + savings);
                    int newCreditCard = (creditCard + creditCard);
                    if ((newSavings > 50000) && (newCreditCard > 2000)) {
                        System.out.println("Congratulations " + name + " you have been approved!");
                    } else if ((newSavings < 50000) && (newCreditCard < 2000)) {
                        System.out.println("I'm sorry " + name + " you been not approve.");
                    }
                } else {
                    break;
                }

        }

    }

}
