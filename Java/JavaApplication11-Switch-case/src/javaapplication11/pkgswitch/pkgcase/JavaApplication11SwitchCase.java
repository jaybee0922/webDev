/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11.pkgswitch.pkgcase;

/**
 *
 * @author PROGRAMMER
 */
import java.util.Scanner;

public class JavaApplication11SwitchCase {

    /**
     * @param args the command line arguments
     */
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int month = 0;

        System.out.println("Please enter number: ");
        month = scanner.nextInt();
        switch (month) {
            case 1:
                System.out.println("This is 1");
                break;
            case 2:
                System.out.println("This is 2");

            default:
                System.out.println("No other way!");
                break;
        }
    }

}
