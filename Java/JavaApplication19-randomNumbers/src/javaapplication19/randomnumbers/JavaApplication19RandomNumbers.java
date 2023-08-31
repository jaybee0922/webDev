/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication19.randomnumbers;

/**
 *
 * @author PROGRAMMER
 */
import java.util.Random;

public class JavaApplication19RandomNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        displayFirstDice();
        displaySecondDice();

        int myNumber = 2;
        if(myNumber % 2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
//        int myDice[] = {1, 2, 3, 4, 5};
//        int myNewIndex = (int) (Math.random() * myDice.length);
//        System.out.println("Dice: " + myDice[myNewIndex]);
//        String myArr[] = {"One", "Two", "Three", "Four", "Five"};
//        int myIndex = (int) (Math.random() * myArr.length);
//        System.out.println("Random: " + myArr[myIndex]);
    }

    public static void displayFirstDice() {

        int target = (int) Math.floor(Math.random() * 5);
        int guess = (int) Math.floor(Math.random() * 5);

        while (true) {
            if (guess != target) {
                System.out.println("Target: " + target + " Guess: " + guess);
                guess = (int) Math.floor(Math.random() * 5);
                System.out.println("Please try again!");
                System.out.println("\n");
            } else if (guess == target) {
                System.out.println("Target: " + target + " Guess: " + guess);
                System.out.println("CONGRATS YOU WIN!");
                System.out.println("YOU ARE GREAT!!!");
                System.out.println("\n");
                break;
            }
        }
    }

    public static void displaySecondDice() {

        String myArr[] = {"A", "B", "C"};
        String myNewArr[] = {"A", "B", "C"};
        int myFirstIndex = (int) (Math.random() * myArr.length);
        int mySecondIndex = (int) (Math.random() * myNewArr.length);

        while (true) {
            if (mySecondIndex != myFirstIndex) {
                System.out.println("Target: " + myArr[myFirstIndex] + " Guess: " + myNewArr[mySecondIndex]);
                mySecondIndex = (int) Math.floor(Math.random() * myArr.length);
                System.out.println("Please try again!");
                System.out.println("\n");
            } else if (mySecondIndex == myFirstIndex) {
                System.out.println("Target: " + myArr[myFirstIndex] + " Guess: " + myNewArr[mySecondIndex]);
                System.out.println("CONGRATS YOU WIN!");
                System.out.println("YOU ARE GREAT!!!");
                break;
            }
        }

    }

}
