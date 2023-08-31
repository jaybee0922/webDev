/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2.string.type;

/**
 *
 * @author PROGRAMMER
 */
public class JavaApplication2StringType {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int myPassengers = 50;
        String myFirstBus = "First Bus: " + myPassengers;
        System.out.println(myFirstBus);
        myPassengers += 100;
        myFirstBus = "Second Bus: " + myPassengers;
        System.out.println(myFirstBus);

        String myFirstScore = "MyFirstScore = ";
        int myIntFirstScore = 100;
        System.out.println(myFirstScore + myIntFirstScore);
    }

}
