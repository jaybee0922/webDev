/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication31.work.pkg5.pkg10;

/**
 *
 * @author PROGRAMMER
 */
public class JavaApplication31Work510 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int myFirstDice[] = {1, 2, 3, 4, 5};
        int mySecondDice[] = {1, 2, 3, 4, 5};
        int firstDice = (int) Math.floor(Math.random() * myFirstDice.length) + 1;
        int secondDice = (int) Math.floor(Math.random() * mySecondDice.length) + 1;

        while (true) {
            if (firstDice != secondDice) {
                System.out.println("Dice 1: " + firstDice);
                firstDice = (int) Math.floor(Math.random() * myFirstDice.length) + 1;
                System.out.println("Dice 2: " + secondDice);
                secondDice = (int) Math.floor(Math.random() * mySecondDice.length) + 1;
                System.out.println("");
                continue;
            } else if (firstDice == secondDice) {
                System.out.println("");
                System.out.println("Dice 1: " + firstDice);
                System.out.println("Dice 2: " + secondDice);
                System.out.println("You rolled doubles!");
                break;
            }
        }
    }
}
