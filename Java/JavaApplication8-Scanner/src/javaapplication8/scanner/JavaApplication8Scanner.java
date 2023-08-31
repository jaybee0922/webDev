/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8.scanner;

/**
 *
 * @author PROGRAMMER
 */
import java.util.Scanner;

public class JavaApplication8Scanner {

    /**
     * @param args the command line arguments
     */
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

//        int questions = 0;
//        System.out.println("Enter your name: ");
//        String name = scanner.nextLine();
//        questions++;
//        System.out.println("Your name is: " + name);
//
//        System.out.println("Enter your age: ");
//        int age = scanner.nextInt();
//        questions++;
//        System.out.println("Your age is: " + age);
//
//        System.out.println("Enter your address: ");
//        String address = scanner.next();
//        questions++;
//        System.out.println("Your address is: " + address);
//
//        System.out.println("Thank you for answering " + questions + " questions!");
//        System.out.println("Pick up First Name: ");
//        String firstName = scanner.nextLine();
//
//        System.out.println("Pick up Last Name: ");
//        String lastName = scanner.nextLine();
//
//        System.out.println("Pick up Age: ");
//        int age = scanner.nextInt();
//
//        System.out.println("Pick up Username: ");
//        String username = scanner.next();
//
//        System.out.println("Here is the information you entered:");
//        System.out.println("First Name: " + firstName + "\nLast Name: " + lastName + "\nAge: " + age + "\nUsername: " + username);


        System.out.println("Hello. What is your name? ");
        String name = scanner.nextLine();
        System.out.println("Hi " + name + "!" + " I'm Javabot. Where are you from? ");
        String city = scanner.nextLine();
        System.out.println("I hear it's beautiful at " + city + "!" + " I'm from a place called Oracle");
        System.out.println("How old are you? ");
        int age = scanner.nextInt();
        System.out.println("So you're " + age + "," + " cool! I'm 400 years old.");
        System.out.println("This means I'm 8 times older than you.");
        System.out.println("Enough about me. What's your favourite language? (just don't say Python)");
        String language = scanner.next();
        System.out.println(language + " fair enough! How many years you have been coding in " + language);
        int years = scanner.nextInt();
        System.out.println(years + "years eh? Tha's great, keep it up!");
        System.out.println("Nice chatting with you " + name + "." + " I have to log off now. See ya!");

    }

}
