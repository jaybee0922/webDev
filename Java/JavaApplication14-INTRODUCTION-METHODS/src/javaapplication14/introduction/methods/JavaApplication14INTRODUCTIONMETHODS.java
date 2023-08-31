/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication14.introduction.methods;

/**
 *
 * @author PROGRAMMER
 */
import java.util.Scanner;
public class JavaApplication14INTRODUCTIONMETHODS {

    /**
     * @param args the command line arguments
     */
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
              
        inputValue();
        displayValue();
    }
  
    public static void inputValue(){
        System.out.println("Enter your name: ");
        
    }
    public static void displayValue(){
        String name = scanner.nextLine();
        System.out.println("Your name is: " + name);
    }
    
}
