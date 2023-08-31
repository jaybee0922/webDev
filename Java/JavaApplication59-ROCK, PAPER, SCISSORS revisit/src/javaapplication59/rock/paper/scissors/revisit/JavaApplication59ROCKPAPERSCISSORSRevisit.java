/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication59.rock.paper.scissors.revisit;

/**
 *
 * @author PROGRAMMER
 */
import java.util.Scanner;

public class JavaApplication59ROCKPAPERSCISSORSRevisit {

    /**
     * @param args the command line arguments
     */
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO code application logic here

        String computerChoices[] = {"Rock", "Paper", "Scissor", "Rock", "Paper", "Scissor", "Rock", "Paper", "Scissor"};
        int TypeCastingInteger = (int) (Math.floor(Math.random() * computerChoices.length));
        int playerScore = 0;
        int computerScore = 0;
        String inputButton;
        String myInputButtonPlayer;
        int myScore = 0;
        String theComputerMove = computerChoices[TypeCastingInteger];
        System.out.println("Please enter your name first: ");
        String name = scanner.nextLine();
        while (true) {
            System.out.println("\n");
            System.out.println("Are you ready " + name + " ?");
            System.out.println("Yes or No");
            inputButton = scanner.nextLine();
            if (inputButton.equals("Yes")) {
                System.out.println("\n");
                System.out.println("Welcome to Rock, Paper , Scissors Game.");
                System.out.println("Alright " + name + " !");
                System.out.println("Let's begin!");
                break;
            } else if (inputButton.equals("No")) {
                System.out.println("Okay " + name + " just run the system again once you are ready.");
                System.out.println("Thank you!");
                System.exit(0);
            } else {
                System.out.println("\n");
                System.out.println("Invalid input " + name + "!");
                System.out.println("Please enter Yes or No");
            }

        }

        while (true) {
            int myTotalPlayerScore = playerScore;
            int myComputerPlayerScore = computerScore;
            System.out.println("\n");
            System.out.println("Please select your move Rock, Paper, Scissor");
            myInputButtonPlayer = scanner.nextLine();
            if (!myInputButtonPlayer.equals("Rock") && (!myInputButtonPlayer.equals("Paper") && (!myInputButtonPlayer.equals("Scissor")))) {
                System.out.println("Invalid input " + name);
                continue;
            }
            if (myInputButtonPlayer.equals(theComputerMove)) {
                System.out.println("It's tie!");
                System.out.println("Player score is: " + playerScore);
                System.out.println("Computer score is: " + computerScore);
                continue;
            } else if ((myInputButtonPlayer.equals("Rock") && theComputerMove.equals("Scissor"))
                    || (myInputButtonPlayer.equals("Paper") && theComputerMove.equals("Rock"))
                    || (myInputButtonPlayer.equals("Scissor") && theComputerMove.equals("Paper"))) {
                System.out.println("You win!");
                playerScore++;
                System.out.println("Your score is: " + playerScore);
                System.out.println("Computer score is: " + computerScore);
                System.out.println("Computer's move: " + theComputerMove);
                continue;
            } else {
                System.out.println("Computer wins!");
                computerScore++;
                System.out.println("Computer score is: " + computerScore);
                System.out.println("Player score is: " + playerScore);

            }
        }

    }

}
