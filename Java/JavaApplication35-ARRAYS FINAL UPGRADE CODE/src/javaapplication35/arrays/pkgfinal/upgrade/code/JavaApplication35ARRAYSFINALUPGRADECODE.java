/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication35.arrays.pkgfinal.upgrade.code;

/**
 *
 * @author PROGRAMMER
 */
import java.util.*;

public class JavaApplication35ARRAYSFINALUPGRADECODE {

    /**
     * @param args the command line arguments
     */
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("*******************************");
        System.out.println("** Welcome to guessing game! **");
        System.out.println("*******************************");
        System.out.println("\n");
        System.out.println("Please enter your name first: ");
        String myName = scanner.nextLine();
        System.out.println("\n");
        System.out.println("Alright " + myName + " Do you want to continue? 'Yes' or 'No' ");

        while (true) {
            String startButton = scanner.nextLine();
            if (!startButton.equals(startButton)) {
                continue;
            }
            if (startButton.equals("Yes")) {
                System.out.println("\n");
                System.out.println("Great " + myName + "!");
                System.out.println("Here are the rules: ");
                System.out.println("• There are 8 guessing word that you have to guess.");
                System.out.println("• Every Question is a random word.");
                System.out.println("• Every correct answer will be 1 point.");
                System.out.println("• If your score is 0 THAT MEANS YOU ARE NOT A PROGRAMMER YOU ALWAYS SAYING YES BUT DEEP INSIDE YOU ARE NOT.");
                System.out.println("• If your score is 1 THAT MEANS YOU ARE NOT A PROGRAMMER AND YOU ALWAYS FIND SOMEONE TO FIX YOUR CODE.");
                System.out.println("• If your score is 2 THAT MEANS YOU ARE NOT A PROGRAMMER YOU ALWAYS COPY CODE TO OTHERS.");
                System.out.println("• If your score is 3 THAT MEANS YOU ARE NOT A PROGRAMMER AND PRETEND TO BE A PRO.");
                System.out.println("• If your score is 4 THAT MEANS YOU ARE A PROGRAMMER BUT YOU ALWAYS CHEATING.");
                System.out.println("• If your score is 5 THAT MEANS YOU ARE A PROGRAMMER BUT YOU ALWAYS FINDING ANSWER IN STACK OVERFLOW.");
                System.out.println("• If your score is 6 THAT MEANS YOU ARE A PROGRAMMER BUT YOU ASK FOR HELP SOMETIMES AND COPY CODE SOMETIMES.");
                System.out.println("• If your score is 7 THAT MEANS YOU ARE A PROGRAMMER BUT YOU OPEN GOOGLE SOMETIMES.");
                System.out.println("• If your score is 8 THAT MEANS YOU ARE A VERY PROFESSIONAL PROGRAMMER AND YOU ARE SKILLED I CALL YOU MASTER.");
                System.out.println("GOODLUCK!");
                break;
            } else if (startButton.equals("No")) {
                System.out.println("Okay " + myName + " , just run the code again once you are ready. Thank you!");
                System.exit(0);
            } else {
                System.out.println("\n");
                System.out.println("INVALID INPUT " + myName + "!");
                System.out.println("Please enter Yes or No");
            }
        }

        String myGuessingGame[] = {"Apple", "Orange", "Banana", "Durian", "Super", "Fast", "Happy", "Peace"};
        int myIndex = (int) (Math.random() * myGuessingGame.length);
        String myRandomElement = myGuessingGame[myIndex];
        int playerScore = 0;
        String inputButton;
        while (true) {
            System.out.println("\n");
            System.out.println("Choices: Apple, Orange, Banana, Durian, Super, Fast, Happy, Peace");
            System.out.println("First Question: ");
            System.out.println("• Guess the word: ");
            inputButton = scanner.next();
            for (int i = 0; i < myRandomElement.length(); i++) {
                System.out.print("");
            }
            System.out.println();
            if (inputButton.equals(myRandomElement)) {
                System.out.println("Your answer is correct! ");
                playerScore++;
                System.out.println("Your score is: " + playerScore);
            } else if (!inputButton.equals(myRandomElement)) {
                System.out.println("Your answer is wrong! ");
                System.out.println("Your current score was: " + playerScore);
            }
            System.out.println("\n");
            System.out.println("Choices: Apple, Orange, Banana, Durian, Super, Fast, Happy, Peace");
            System.out.println("Second Question: ");
            System.out.println("• Guess the word: ");
            inputButton = scanner.next();
            for (int i = 0; i < myRandomElement.length(); i++) {
                System.out.print("");
            }
            System.out.println();
            if (inputButton.equals(myRandomElement)) {
                System.out.println("Your answer is correct! ");
                playerScore++;
                System.out.println("Your score is: " + playerScore);
            } else if (!inputButton.equals(myRandomElement)) {
                System.out.println("Your answer is wrong! ");
                System.out.println("Your current score was: " + playerScore);
            }
            System.out.println("\n");
            System.out.println("Choices: Apple, Orange, Banana, Durian, Super, Fast, Happy, Peace");
            System.out.println("Third Question: ");
            System.out.println("• Guess the word: ");
            inputButton = scanner.next();
            for (int i = 0; i < myRandomElement.length(); i++) {
                System.out.print("");
            }
            System.out.println();
            if (inputButton.equals(myRandomElement)) {
                System.out.println("Your answer is correct! ");
                playerScore++;
                System.out.println("Your score is: " + playerScore);
            } else if (!inputButton.equals(myRandomElement)) {
                System.out.println("Your answer is wrong! ");
                System.out.println("Your current score was: " + playerScore);
            }
            System.out.println("\n");
            System.out.println("Choices: Apple, Orange, Banana, Durian, Super, Fast, Happy, Peace");
            System.out.println("Fourth Question: ");
            System.out.println("• Guess the word: ");
            inputButton = scanner.next();
            for (int i = 0; i < myRandomElement.length(); i++) {
                System.out.print("");
            }
            System.out.println();
            if (inputButton.equals(myRandomElement)) {
                System.out.println("Your answer is correct! ");
                playerScore++;
                System.out.println("Your score is: " + playerScore);
            } else if (!inputButton.equals(myRandomElement)) {
                System.out.println("Your answer is wrong! ");
                System.out.println("Your current score was: " + playerScore);
            }
            System.out.println("\n");
            System.out.println("Choices: Apple, Orange, Banana, Durian, Super, Fast, Happy, Peace");
            System.out.println("Fifth Question: ");
            System.out.println("• Guess the word: ");
            inputButton = scanner.next();
            for (int i = 0; i < myRandomElement.length(); i++) {
                System.out.print("");
            }
            System.out.println();
            if (inputButton.equals(myRandomElement)) {
                System.out.println("Your answer is correct! ");
                playerScore++;
                System.out.println("Your score is: " + playerScore);
            } else if (!inputButton.equals(myRandomElement)) {
                System.out.println("Your answer is wrong! ");
                System.out.println("Your current score was: " + playerScore);
            }
            System.out.println("\n");
            System.out.println("Choices: Apple, Orange, Banana, Durian, Super, Fast, Happy, Peace");
            System.out.println("Sixth Question: ");
            System.out.println("• Guess the word: ");
            inputButton = scanner.next();
            for (int i = 0; i < myRandomElement.length(); i++) {
                System.out.print("");
            }
            System.out.println();
            if (inputButton.equals(myRandomElement)) {
                System.out.println("Your answer is correct! ");
                playerScore++;
                System.out.println("Your score is: " + playerScore);
            } else if (!inputButton.equals(myRandomElement)) {
                System.out.println("Your answer is wrong! ");
                System.out.println("Your current score was: " + playerScore);
            }

            System.out.println("\n");
            System.out.println("Choices: Apple, Orange, Banana, Durian, Super, Fast, Happy, Peace");
            System.out.println("Seventh Question: ");
            System.out.println("• Guess the word: ");
            inputButton = scanner.next();
            for (int i = 0; i < myRandomElement.length(); i++) {
                System.out.print("");
            }
            System.out.println();
            if (inputButton.equals(myRandomElement)) {
                System.out.println("Your answer is correct! ");
                playerScore++;
                System.out.println("Your score is: " + playerScore);
            } else if (!inputButton.equals(myRandomElement)) {
                System.out.println("Your answer is wrong! ");
                System.out.println("Your current score was: " + playerScore);
            }

            System.out.println("\n");
            System.out.println("Choices: Apple, Orange, Banana, Durian, Super, Fast, Happy, Peace");
            System.out.println("Eighth Question: ");
            System.out.println("• Guess the word: ");
            inputButton = scanner.next();
            for(int i = 0; i < myRandomElement.length(); i++){
                System.out.print("");
            }
            System.out.println();
            if (inputButton.equals(myRandomElement)) {
                System.out.println("Your answer is correct! ");
                playerScore++;
                System.out.println("Your score is: " + playerScore);
            } else if (!inputButton.equals(myRandomElement)) {
                System.out.println("Your answer is wrong! ");
                System.out.println("Your current score was: " + playerScore);
            }

            int myTotalScore = playerScore;
            System.out.println("\n");
            System.out.println("Your total score " + myName + " was: " + playerScore);
            if (myTotalScore == 1) {
                System.out.println("THAT MEANS YOU ARE NOT A PROGRAMMER AND YOU ALWAYS FIND SOMEONE TO FIX YOUR CODE.");
            } else if (myTotalScore == 2) {
                System.out.println("THAT MEANS YOU ARE NOT A PROGRAMMER YOU ALWAYS COPY CODE TO OTHERS.");
            } else if (myTotalScore == 3) {
                System.out.println("THAT MEANS YOU ARE NOT A PROGRAMMER AND PRETEND TO BE A PRO.");
            } else if (myTotalScore == 4) {
                System.out.println("THAT MEANS YOU ARE A PROGRAMMER BUT YOU ALWAYS CHEATING.");
            } else if (myTotalScore == 5) {
                System.out.println("THAT MEANS YOU ARE A PROGRAMMER BUT YOU ALWAYS FINDING ANSWER IN STACK OVERFLOW.");
            } else if (myTotalScore == 6) {
                System.out.println("THAT MEANS YOU ARE A PROGRAMMER BUT YOU ASK FOR HELP SOMETIMES AND COPY CODE SOMETIMES.");
            } else if (myTotalScore == 7) {
                System.out.println("THAT MEANS YOU ARE A PROGRAMMER BUT YOU OPEN GOOGLE SOMETIMES");
            } else if (myTotalScore == 8) {
                System.out.println("THAT MEANS YOU ARE A VERY PROFESSIONAL PROGRAMMER AND YOU ARE SKILLED I CALL YOU MASTER.");
            } else {
                System.out.println("THAT MEANS YOU ARE NOT A PROGRAMMER YOU ALWAYS SAYING YES BUT DEEP INSIDE YOU ARE NOT");
            }
            break;

        }
        scanner.close();
//        String[] myGuessingGame = {"Apple", "Orange", "Banana", "Durian"};
//        int myIndex = (int) (Math.random() * myGuessingGame.length); // type casting
//        String myRandomElement = myGuessingGame[myIndex]; //final variable for casting and array
//
//        System.out.println("Guess the word: ");
//        for (int i = 0; i < myRandomElement.length(); i++) {
//            System.out.print("_");
//        }
//        System.out.println();
    }
}
