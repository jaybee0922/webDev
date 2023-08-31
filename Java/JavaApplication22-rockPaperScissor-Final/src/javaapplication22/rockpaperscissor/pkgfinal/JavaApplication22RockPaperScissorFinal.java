/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication22.rockpaperscissor.pkgfinal;

/**
 *
 * @author PROGRAMMER
 */
import java.util.Scanner;

public class JavaApplication22RockPaperScissorFinal {

    /**
     * @param args the command line arguments
     */
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String computerRandom[] = {"r", "p", "s"};
        String player, start;
        int playerScore = 0;
        int computerScore = 0;
        int convertToInteger = (int) (Math.random() * computerRandom.length);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Let's play Rock Paper Scissors.");
        System.out.println("When I say 'shoot', choose: rock, paper, or scissors.");
        System.out.println("\n");
        System.out.println("Are you ready? Write 'yes' if you are, 'no' if you don't.");
        start = scanner.nextLine();

        if (start.equalsIgnoreCase("yes")) {
            System.out.println("Great!");
        } else {
            System.out.println("Well, thank you! You can come back anytime you want.");
            System.exit(0);
        }

        while (true) {
            System.out.println("\n");
            System.out.println("Please select your move: (r, p, or s)");
            player = scanner.nextLine();

            if (!player.equals("r") && !player.equals("p") && !player.equals("s")) {
                System.out.println("Invalid input");
                continue;
            }

            String computerMove = computerRandom[convertToInteger];

            System.out.println("Computer's move: " + computerMove);

            if (player.equals(computerMove)) {
                System.out.println("It's a tie!");
            } else if ((player.equals("r") && computerMove.equals("s"))
                    || (player.equals("p") && computerMove.equals("r"))
                    || (player.equals("s") && computerMove.equals("p"))) {
                System.out.println("You win!");
                playerScore++;
            } else {
                System.out.println("Computer wins!");
                computerScore++;
            }

            System.out.println("Your score: " + playerScore);
            System.out.println("Computer's score: " + computerScore);
            System.out.println("\n");
            System.out.println("Do you want to play again? Write 'yes' to continue or 'no' to exit.");
            String playAgain = scanner.nextLine();

            if (playAgain.equalsIgnoreCase("no")) {
                System.out.println("Thank you for playing!");
                break;
            }

            convertToInteger = (int) (Math.random() * computerRandom.length);
        }

    }

}
