/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication21.rock.paper.scissors;

/**
 *
 * @author PROGRAMMER
 */
import java.util.*;

public class JavaApplication21RockPaperScissors {

    /**
     * @param args the command line arguments
     */
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int score = 0;
        String myComputerArray[] = {"rock", "paper", "scissor"};
        int myIntegerComputer = (int) (Math.random() * myComputerArray.length);

        System.out.println("Let's play Rock Paper Scissors. ");
        System.out.println("When I say 'shoot', Choose: rock, paper, or scissors. ");
        System.out.println("\n");
        System.out.println("Are you ready? Write 'yes' if you are, 'no' if you don't. ");
        String ready = scanner.nextLine();
        if (ready.equals("yes")) {
            System.out.println("Great!");
        } else if (ready.equals("no")) {
            System.exit(0);
        }
        String player;
        while (true) {
            System.out.println("\n");
            System.out.println("Please select your move: (r, p, or s) ");
            player = scanner.nextLine();
            if (player.equals("r") || player.equals("p") || player.equals("s")) {
                myIntegerComputer = (int) (Math.random() * myComputerArray.length);
                System.out.println("Computer picked: " + myComputerArray[myIntegerComputer]);

            }
        }
    }
}
