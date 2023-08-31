/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication17.work.pkg4.pkg3;

/**
 *
 * @author PROGRAMMER
 */
import java.util.Scanner;

public class JavaApplication17Work43 {

    /**
     * @param args the command line arguments
     */
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        inputValue();

    }

    public static double inputValue() {
        System.out.println("Enter fahrenheit: ");
        double firstInput = scanner.nextDouble();
        double convertToCelcius = (firstInput - 32) * 5 / 9;
        System.out.println("The fahrenheit to celcius = " + convertToCelcius);
        return convertToCelcius;
    }

}
