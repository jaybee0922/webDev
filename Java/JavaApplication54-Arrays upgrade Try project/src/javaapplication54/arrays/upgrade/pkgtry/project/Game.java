/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication54.arrays.upgrade.pkgtry.project;

/**
 *
 * @author PROGRAMMER
 */
import java.util.*;

public class Game {

    private static Scanner scanner = new Scanner(System.in);

    private String startButton;
    private int playerScore;
    private String inputButton;
    private String myName;
    private String myFirstRandomElement;
    private int myFirstIndex;
    private String mySecondRandomElement;
    private int mySecondIndex;
    private String myThirdRandomElement;
    private int myThirdIndex;
    private String myFourthRandomElement;
    private int myFourthIndex;
    private String myFifthRandomElement;
    private int myFifthIndex;
    private String mySixthRandoElement;
    private int mySixthIndex;
    private String mySevenRandomElement;
    private int mySevenIndex;
    private String myEightRandomElement;
    private int myEightIndex;
    private int myTotalScore;

    public String getMyName() {
        System.out.println("*******************************");
        System.out.println("** Welcome to guessing game! **");
        System.out.println("*******************************");
        System.out.println("\n");
        System.out.println("Please enter your name first: ");
        myName = scanner.nextLine();
        return myName;
    }

    public void myStartGame() {

        System.out.println("\n");
        System.out.println("Alright " + myName + " Do you want to continue? 'Yes' or 'No' ");

        while (true) {
            startButton = scanner.nextLine();
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

    }

    public void gameBegin() {

        String myFirstGuessingGame[] = {"Steve Jobs", "Happiness", "World", "Hands", "Flowers", "Waste", "Happy", "Peace"};
        myFirstIndex = (int) (Math.random() * myFirstGuessingGame.length);
        myFirstRandomElement = myFirstGuessingGame[myFirstIndex];

        String mySecondGuessingGame[] = {"Bill Gates", "Nation", "Island", "Rose", "Red", "Sky", "Human", "Hope"};
        mySecondIndex = (int) (Math.random() * mySecondGuessingGame.length);
        mySecondRandomElement = mySecondGuessingGame[mySecondIndex];

        String myThirdGuessingGame[] = {"President", "Senate", "Congress", "Military", "Revolution", "Car", "Sports", "Actor"};
        myThirdIndex = (int) (Math.random() * myThirdGuessingGame.length);
        myThirdRandomElement = myThirdGuessingGame[myThirdIndex];

        String myFourthGuessingGame[] = {"Government", "Food", "Spicy", "Fish", "Chicken", "Vegetable", "Dog", "Cat"};
        myFourthIndex = (int) (Math.random() * myFourthGuessingGame.length);
        myFourthRandomElement = myFourthGuessingGame[myFourthIndex];

        String myFifthGuessingGame[] = {"Water", "Oil", "Solar", "Mars", " Moon", "Jupiter", "Apple", "Orange"};
        myFifthIndex = (int) (Math.random() * myFifthGuessingGame.length);
        myFifthRandomElement = myFifthGuessingGame[myFifthIndex];

        String mySixthGuessingGame[] = {"Number", "Cellphone", "Ethernet", "Mobile", "Telephone", "Calendar", "Christmas", "Galaxy"};
        mySixthIndex = (int) (Math.random() * mySixthGuessingGame.length);
        mySixthRandoElement = mySixthGuessingGame[mySixthIndex];

        String mySevenGuessingGame[] = {"Clay", "Swords", "Gun", "Bombs", "Shades", "Paper", "Ballpen", "Basketball"};
        mySevenIndex = (int) (Math.random() * mySevenGuessingGame.length);
        mySevenRandomElement = mySevenGuessingGame[mySevenIndex];

        String myEightGuessingGame[] = {"Keyboard", "Mouse", "Chocolate", "Milk", "Clock", "White", "Speaker", "Rice"};
        myEightIndex = (int) (Math.random() * myEightGuessingGame.length);
        myEightRandomElement = myEightGuessingGame[myEightIndex];

        playerScore = 0;
        while (true) {
            System.out.println("\n");
            System.out.println("Choices: Steve Jobs, Happiness, World, Hands, Flowers, Waste, Happy, Peace");
            System.out.println("First Question: ");
            System.out.println("• Guess the word: ");
            inputButton = scanner.nextLine();
            for (int i = 0; i < myFirstRandomElement.length(); i++) {
                System.out.print("");
            }
            System.out.println();
            if (inputButton.equals(myFirstRandomElement)) {
                System.out.println("Your answer is correct! ");
                playerScore++;
                System.out.println("Your score is: " + playerScore);
            } else if (!inputButton.equals(myFirstRandomElement)) {
                System.out.println("Your answer is wrong! ");
                System.out.println("Your current score was: " + playerScore);
            }

            System.out.println("\n");
            System.out.println("Choices: Bill Gates, Nation, Island, Rose, Red, Sky, Human, Hope");
            System.out.println("Second Question: ");
            System.out.println("• Guess the word: ");
            inputButton = scanner.nextLine();

            for (int i = 0; i < mySecondRandomElement.length(); i++) {
                System.out.print("");
            }
            System.out.println();
            if (inputButton.equals(mySecondRandomElement)) {
                System.out.println("Your answer is correct! ");
                playerScore++;
                System.out.println("Your score is: " + playerScore);
            } else if (!inputButton.equals(mySecondRandomElement)) {
                System.out.println("Your answer is wrong! ");
                System.out.println("Your current score was: " + playerScore);
            }

            System.out.println("\n");
            System.out.println("Choices: President, Senate, Congress, Military, Revolution, Car, Sports, Actor");
            System.out.println("Third Question: ");
            System.out.println("• Guess the word: ");
            inputButton = scanner.next();
            for (int i = 0; i < myThirdRandomElement.length(); i++) {
                System.out.print("");
            }
            System.out.println();
            if (inputButton.equals(myThirdRandomElement)) {
                System.out.println("Your answer is correct! ");
                playerScore++;
                System.out.println("Your score is: " + playerScore);
            } else if (!inputButton.equals(myThirdRandomElement)) {
                System.out.println("Your answer is wrong! ");
                System.out.println("Your current score was: " + playerScore);
            }

            System.out.println("\n");
            System.out.println("Choices: Government, Food, Spicy, Fish, Chicken, Vegetable, Dog, Cat");
            System.out.println("Fourth Question: ");
            System.out.println("• Guess the word: ");
            inputButton = scanner.next();
            for (int i = 0; i < myFourthRandomElement.length(); i++) {
                System.out.print("");
            }
            System.out.println();
            if (inputButton.equals(myFourthRandomElement)) {
                System.out.println("Your answer is correct! ");
                playerScore++;
                System.out.println("Your score is: " + playerScore);
            } else if (!inputButton.equals(myFourthRandomElement)) {
                System.out.println("Your answer is wrong! ");
                System.out.println("Your current score was: " + playerScore);
            }

            System.out.println("\n");
            System.out.println("Choices: Water, Oil, Solar, Mars, Moon, Jupiter, Apple, Orange");
            System.out.println("Fifth Question: ");
            System.out.println("• Guess the word: ");
            inputButton = scanner.next();
            for (int i = 0; i < myFifthRandomElement.length(); i++) {
                System.out.print("");
            }
            System.out.println();
            if (inputButton.equals(myFifthRandomElement)) {
                System.out.println("Your answer is correct! ");
                playerScore++;
                System.out.println("Your score is: " + playerScore);
            } else if (!inputButton.equals(myFifthRandomElement)) {
                System.out.println("Your answer is wrong! ");
                System.out.println("Your current score was: " + playerScore);
            }

            System.out.println("\n");
            System.out.println("Choices: Number, Cellphone, Ethernet, Mobile, Telephone, Calendar, Christmas, Galaxy");
            System.out.println("Sixth Question: ");
            System.out.println("• Guess the word: ");
            inputButton = scanner.next();
            for (int i = 0; i < mySixthRandoElement.length(); i++) {
                System.out.print("");
            }
            System.out.println();
            if (inputButton.equals(mySixthRandoElement)) {
                System.out.println("Your answer is correct! ");
                playerScore++;
                System.out.println("Your score is: " + playerScore);
            } else if (!inputButton.equals(mySixthRandoElement)) {
                System.out.println("Your answer is wrong! ");
                System.out.println("Your current score was: " + playerScore);
            }

            System.out.println("\n");
            System.out.println("Choices: Clay, Swords, Gun, Bombs, Shades, Paper, Ballpen, Basketball");
            System.out.println("Seventh Question: ");
            System.out.println("• Guess the word: ");
            inputButton = scanner.next();
            for (int i = 0; i < mySevenRandomElement.length(); i++) {
                System.out.print("");
            }
            System.out.println();
            if (inputButton.equals(mySevenRandomElement)) {
                System.out.println("Your answer is correct! ");
                playerScore++;
                System.out.println("Your score is: " + playerScore);
            } else if (!inputButton.equals(mySevenRandomElement)) {
                System.out.println("Your answer is wrong! ");
                System.out.println("Your current score was: " + playerScore);
            }

            System.out.println("\n");
            System.out.println("Choices: Keyboard, Mouse, Chocolate, Milk, Clock, White, Speaker, Rice");
            System.out.println("Eighth Question: ");
            System.out.println("• Guess the word: ");
            inputButton = scanner.next();
            for (int i = 0; i < myEightRandomElement.length(); i++) {
                System.out.print("");
            }
            System.out.println();
            if (inputButton.equals(myEightRandomElement)) {
                System.out.println("Your answer is correct! ");
                playerScore++;
                System.out.println("Your score is: " + playerScore);
            } else if (!inputButton.equals(myEightRandomElement)) {
                System.out.println("Your answer is wrong! ");
                System.out.println("Your current score was: " + playerScore);
            }

            break;

        }
        scanner.close();

    }

    public int getPlayerScore() {
        myTotalScore = playerScore;
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
        return playerScore;
    }

}
