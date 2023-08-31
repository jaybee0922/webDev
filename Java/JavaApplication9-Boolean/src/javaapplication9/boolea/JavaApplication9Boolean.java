/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9.boolea;

/**
 *
 * @author PROGRAMMER
 */
import java.util.*;

public class JavaApplication9Boolean {

    /**
     * @param args the command line arguments
     */
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int englishGrade = 95;
        int filipinoGrade = 75;
        int mathGrade = 75;
        String firstWord = "Hello!";
        String secondWord = "Hello!";

        System.out.println(englishGrade > filipinoGrade);
        System.out.println(englishGrade < filipinoGrade);
        System.out.println(englishGrade >= filipinoGrade);
        System.out.println(englishGrade <= filipinoGrade);
        System.out.println(englishGrade == filipinoGrade);
        System.out.println(englishGrade != filipinoGrade);
        System.out.println(filipinoGrade != mathGrade);

        System.out.println(firstWord.equals(secondWord));
        System.out.println(!firstWord.equals(secondWord));

//        System.out.println("Hi java, do I have enough to buy chips?" );
//        boolean chips = scanner.nextBoolean();
//        System.out.println(chips);
//        System.out.println("Hi java, can the elevator hold everyone?" );
//        boolean elevator = scanner.nextBoolean();
//        System.out.println(elevator);
//        double wallet = 100;
//        System.out.println("Can you buy me this? ");
//        String firstQuestion = scanner.nextLine();
//        if (firstQuestion.equals(firstQuestion)) {
//            System.out.println("Sure!");
//            System.out.println("Enter amount: ");
//            double spendMoney = scanner.nextDouble();
//            wallet = wallet -= spendMoney;
//            int convertSales = (int) wallet;
//            System.out.println("Wallet: " + convertSales);
//        } 
        double wallet = 100;
        System.out.println("Can you buy me this? ");
        int spendMoney = scanner.nextInt();
        wallet = wallet -= spendMoney;
        int convertWallet = (int) wallet;
        System.out.println("Sure!");
        System.out.println("Wallet: " + convertWallet);
        System.out.println("Can you buy me that? ");
        int expensiveMoney = scanner.nextInt();
        if (expensiveMoney > wallet) {
            int convertExpensiveMoney = (int) wallet;
            System.out.println("Sorry, I have only " + convertExpensiveMoney + "$ left");
        }

    }

}
