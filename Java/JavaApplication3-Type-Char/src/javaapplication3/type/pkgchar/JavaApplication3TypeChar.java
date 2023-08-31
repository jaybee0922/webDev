/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3.type.pkgchar;

/**
 *
 * @author PROGRAMMER
 */
public class JavaApplication3TypeChar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        char myGender = 'M';
        String gender = "My gender is = ";
        System.out.println(gender + myGender + " stands for male");

        String myName = "Jeb";
        int myAge = 27;
        String myCountry = "Philippines";
        String mySports = "Basketball";
        int myHours = 2;
        String myGame = "Games";
        String mySubject = "Physics";
        char myGrade = 'A';

        System.out.println("My name is " + myName + ". I'm " + myAge + " years old, and"
                + " I'm from " + myCountry + ".");
        System.out.println("My favourite sport is " + mySports + "." + " I play for " + myHours + "hour(s) a day");
        System.out.println("When I'm tired, I like to play " + myGame + ".");
        System.out.println("In school, my favourite subject was " + mySubject + ", I scored a " + myGrade);
    }

}
