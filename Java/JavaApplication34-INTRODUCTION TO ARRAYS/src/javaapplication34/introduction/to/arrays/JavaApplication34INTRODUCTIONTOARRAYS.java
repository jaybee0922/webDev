/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication34.introduction.to.arrays;

/**
 *
 * @author PROGRAMMER
 */
import java.util.*;

public class JavaApplication34INTRODUCTIONTOARRAYS {

    /**
     * @param args the command line arguments
     */
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        inputValue();
        inputProcessValue();

    }

    public static void inputValue() {

        String myGuessingGame[] = {"Apple", "Orange", "Banana", "Durian"};
        System.out.println("*******************************");
        System.out.println("** Welcome to guessing game! **");
        System.out.println("*******************************");
        System.out.println("\n");
        System.out.println("Do you want to start the game? Type 'Yes' or 'No' ");
        String startButton = scanner.nextLine();
        if (startButton.equals("Yes")) {
            System.out.println("\n");
            System.out.println("Great!");
            System.out.println("Here are the rules: ");
            System.out.println("• There are 4 guessing word that you have to guess.");
            System.out.println("• Every correct answer will be 1 point");
            System.out.println("• If your score is 0 YOUR NOT EVEN A PROGRAMMER THEN YOU ARE PRETENDING TO BE A PROGRAMMER AND YOU ARE IDIOT");
            System.out.println("• If your score is 1 YOUR GRADE IS 'D' THAT MEANS YOU ARE NOT A PROGRAMMER");
            System.out.println("• If your score is 2 YOUR GRADE IS 'C' THAT MEANS YOU ARE NOT A PROGRAMMER THEN YOU ARE ALWAYS COPYING CODES");
            System.out.println("• If your score is 3 YOUR GRADE IS 'B' THAT MEANS YOU ARE A PROGRAMMER BUT YOU ALWAYS ASKING FOR HELP");
            System.out.println("• If your score is 4 YOUR GRADE IS 'A' THAT MEANS YOU ARE A VERY PROFESSIONAL PROGRAMMER AND YOU ARE SKILLED");
            System.out.println("Goodluck!");
            System.out.println("\n");
        } else if (startButton.equals("No")) {
            System.out.println("Okay, just run the code again if you are ready thank you!");
            System.exit(0);
        }
    }

    public static boolean inputProcessValue() {

        int playerScore = 0;
        String inputButton;

        while (true) {
            System.out.println("First Question: ");
            System.out.println("• Please guess the word: _,P,_,_,_");
            inputButton = scanner.nextLine();
            if (inputButton.equals("Apple")) {
                System.out.println("You are correct!");
                playerScore++;
                System.out.println("You have " + playerScore + " point.");

            } else if (!inputButton.equals("Apple")) {
                System.out.println("You are wrong!!!");
                System.out.println("Your current score is: " + playerScore);

            }
            System.out.println("\n");
            System.out.println("Second Question: ");
            System.out.println("• Please guess the word: _,_,_,_,g,_");
            inputButton = scanner.nextLine();
            if (inputButton.equals("Orange")) {
                System.out.println("You are correct!");
                playerScore++;
                System.out.println("You have " + playerScore + " point");

            } else if (!inputButton.equals("Orange")) {
                System.out.println("You are wrong!!!");
                System.out.println("Your current score is: " + playerScore);

            }
            System.out.println("\n");
            System.out.println("Third Question: ");
            System.out.println("• Please guess the word: _,a,_,_,_,_");
            inputButton = scanner.nextLine();
            if (inputButton.equals("Banana")) {
                System.out.println("You are correct!");
                playerScore++;
                System.out.println("You have " + playerScore + " point");

            } else if (!inputButton.equals("Banana")) {
                System.out.println("You are wrong!!!");
                System.out.println("Your current score is: " + playerScore);

            }
            System.out.println("\n");
            System.out.println("Fourth Question: ");
            System.out.println("• Please guess the word: _,u,_,_,_,_");
            inputButton = scanner.nextLine();
            if (inputButton.equals("Durian")) {
                System.out.println("You are correct!");
                playerScore++;
                int myTotalScore = playerScore;
                System.out.println("Your score was: " + myTotalScore);
                if (myTotalScore == 1) {
                    System.out.println("YOUR GRADE IS 'D' THAT MEANS YOU ARE NOT A PROGRAMMER");
                } else if (myTotalScore == 2) {
                    System.out.println("YOUR GRADE IS 'C' THAT MEANS YOU ARE NOT A PROGRAMMER THEN YOU ARE ALWAYS COPYING CODES");
                } else if (myTotalScore == 3) {
                    System.out.println("YOUR GRADE IS 'B' THAT MEANS YOU ARE A PROGRAMMER BUT YOU ALWAYS ASKING FOR HELP");
                } else if (myTotalScore == 4) {
                    System.out.println("YOUR GRADE IS 'A' THAT MEANS YOU ARE A VERY PROFESSIONAL PROGRAMMER AND YOU ARE SKILLED");
                } else {
                    System.out.println("YOUR NOT EVEN A PROGRAMMER THEN YOU ARE PRETENDING TO BE A PROGRAMMER AND YOU ARE IDIOT");
                }
                break;
            }
            scanner.close();
        }
        return true;
    }
}
