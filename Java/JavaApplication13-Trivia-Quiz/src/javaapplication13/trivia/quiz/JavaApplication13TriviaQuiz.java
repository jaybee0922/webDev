/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13.trivia.quiz;

/**
 *
 * @author PROGRAMMER
 */
import java.util.Scanner;

public class JavaApplication13TriviaQuiz {

    /**
     * @param args the command line arguments
     */
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int countScore = 0;
        System.out.println("1. Which country held the 2016 Summer olympics? ");
        System.out.println("a) China ");
        System.out.println("b) Ireland ");
        System.out.println("c) Brazil ");
        System.out.println("d) Italy ");
        String firstQuestion = scanner.nextLine();
        if (firstQuestion.equals("c")) {
            countScore += 5;
        } else {
            countScore += 0;
        }

        System.out.println("2. Which planet is the hottest? ");
        System.out.println("a) Venus ");
        System.out.println("b) Saturn ");
        System.out.println("c) Mercury ");
        System.out.println("d) Mars ");
        String secondQuestion = scanner.nextLine();
        if (secondQuestion.equals("a")) {
            countScore += 5;
        } else {
            countScore += 0;
        }

        System.out.println("3. What is the rarest blood type? ");
        System.out.println("a) O ");
        System.out.println("b) A ");
        System.out.println("c) B ");
        System.out.println("d) AB-Negative ");
        String thirdQuestion = scanner.nextLine();
        if (thirdQuestion.equals("d")) {
            countScore += 5;
        } else {
            countScore += 0;
        }

        System.out.println("4. Which one of these characters is friends with Harry Potter? ");
        System.out.println("a) Ron Weasley ");
        System.out.println("b) Hermione Granger ");
        System.out.println("c) Draco Malfoy ");
        String fourthQuestion = scanner.nextLine();
        if (fourthQuestion.equals("a") || (fourthQuestion.equals("b"))) {
            countScore += 5;
        } else {
            countScore += 0;
        }

        int newScore = (countScore);
        System.out.println("Your final score is: " + newScore + "/" + newScore);
        System.out.println("Wow, you know your stuff!");

    }

}
