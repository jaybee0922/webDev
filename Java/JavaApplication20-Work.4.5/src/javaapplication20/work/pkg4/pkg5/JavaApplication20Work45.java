/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication20.work.pkg4.pkg5;

/**
 *
 * @author PROGRAMMER
 */
import java.util.Scanner;

public class JavaApplication20Work45 {

    /**
     * @param args the command line arguments
     */
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int myFirstRoll = newRandomNumber();
        int mySecondRoll = newRandomNumber();
        int myThirdRoll = newRandomNumber();

        System.out.println("Enter three numbers between 1 and 6: ");
        int myFirstInput = scanner.nextInt();
        int mySecondInput = scanner.nextInt();
        int myThirdInput = scanner.nextInt();

        if ((myFirstInput <= 0) || (myFirstInput > 6) || (mySecondInput <= 0) || (mySecondInput > 6) || (myThirdInput <= 0) || (myThirdInput > 6)) {
            System.out.println("Invalid input number");
            System.out.println("Cannot be less than 1 or greater than 6");
            System.exit(0);
        }
        int sumOfNumbers = myFirstInput + mySecondInput + myThirdInput;
        int sumOfDiceRollNumbers = myFirstRoll + mySecondRoll + myThirdRoll;
        System.out.println("Dice sum = " + sumOfDiceRollNumbers + " Numbers sum = " + sumOfNumbers);

        checkWin(sumOfDiceRollNumbers, sumOfNumbers);

    }

    public static int newRandomNumber() {

        double myRandom = Math.floor(Math.random() * 6);
        int myNewRandomInteger = (int) (Math.random() * myRandom) + 1;
        return myNewRandomInteger;
    }

    public static void checkWin(int sumOfDiceRollNumbers, int sumOfNumbers) {
        if ((sumOfNumbers > sumOfDiceRollNumbers) && (sumOfNumbers - sumOfDiceRollNumbers < 3)) {
            System.out.println("Congrats! You win!");
        } else {
            System.out.println("Sorry, you lose.");
        }

    }

}
