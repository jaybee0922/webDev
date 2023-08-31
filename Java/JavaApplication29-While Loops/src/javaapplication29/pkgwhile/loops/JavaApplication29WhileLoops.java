/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication29.pkgwhile.loops;

/**
 *
 * @author PROGRAMMER
 */
import java.util.*;

public class JavaApplication29WhileLoops {

    /**
     * @param args the command line arguments
     */
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int myRandoNumberComputer[] = {1, 2, 3, 4, 5};
        int myComputerFinalRandom = (int) (Math.random() * myRandoNumberComputer.length + 1);

        while (true) {
            System.out.println("Please guess number 1 to 5: ");
            int guess = scanner.nextInt();
            if (guess > 5 || guess < 0) {
                System.out.println("");
                System.out.println("Invalid number: ");
                System.out.println("Please enter a valid number.");
                continue;
            } else if (guess != myRandoNumberComputer[myComputerFinalRandom]) {
                System.out.println("wrong guess number.");
                System.out.println("Please try again!");
                continue;
            } else if (guess == myRandoNumberComputer[myComputerFinalRandom]) {
                System.out.println("Congrats! you guess the game");
                break;
            }
        }

    }

}
