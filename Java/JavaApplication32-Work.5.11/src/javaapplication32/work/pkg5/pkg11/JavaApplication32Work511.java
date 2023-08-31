/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication32.work.pkg5.pkg11;

/**
 *
 * @author PROGRAMMER
 */
import java.util.Scanner;

public class JavaApplication32Work511 {

    /**
     * @param args the command line arguments
     */
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int rollNumbers[] = {1, 2, 3, 4, 5, 6};
        int myCastingRollNumbers = (int) Math.floor(Math.random() * rollNumbers.length) + 1;
        int score = 0;

        System.out.println("Let's play Rolling Java. Type anything to start.");
        String startButton = scanner.nextLine();
        if (startButton.equals(startButton)) {
            System.out.println("\nGreat, here are the rules: ");
            System.out.println("• If you roll a 6 the game stops.");
            System.out.println("• If you roll a 4 nothing happens.");
            System.out.println("• Otherwise, you get 1 point.\n");
            System.out.println("\n");
            System.out.println("You must collect at least 3 points to win. Enter anything to roll:");
            while (score < 3) {
                System.out.println("Enter anything to roll: ");
                String rollButton = scanner.nextLine();
                myCastingRollNumbers = (int) Math.floor(Math.random() * rollNumbers.length) + 1;
                int rolledNumber = (rollNumbers[myCastingRollNumbers]);
                System.out.println("You rolled a " + rolledNumber + ".");
                if (rolledNumber == 6) {
                    System.out.println("Game over! You rolled a 6.");
                    break;
                } else if (rolledNumber == 4) {
                    System.out.println("Nothing happens. Roll again.");
                } else {
                    score++;
                    System.out.println("you got " + score + " point! Your current score is " + score);
                }
                myCastingRollNumbers = (int) Math.floor(Math.random() * rollNumbers.length) + 1;
            }
            if (score >= 3) {
                System.out.println("Congratulations! You won the game!");
            }
        } else {
            System.out.println("Invalid input. Exiting the game.");
        }
    }
}
