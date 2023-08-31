/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6.math.operators;

/**
 *
 * @author PROGRAMMER
 */
public class JavaApplication6MathOperators {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int myNumber = 10;
        
        myNumber += 20;
        System.out.println("The new number is: " + myNumber);
        //answer is 30
        
        myNumber -= 20;
        System.out.println("The new number is: " + myNumber);
        //answer is 10
        
        myNumber *= 20;
        System.out.println("The new number is: " + myNumber);
        //answer is 200
        
        myNumber /= 20;
        System.out.println("The new number is: " + myNumber);
        //answer is 10
        
        myNumber ++;
        System.out.println("The new number is: " + myNumber);
        //add by 11
        
        myNumber --;
        System.out.println("The new number is: " + myNumber);
        //minus by 10
        
        double profit = 89.6;
        int numOfCustomer = 3;
        int numOfApples = 500;
        
        
        System.out.println("Wow!, So far, you made: $" + profit);
        System.out.println(numOfCustomer+ " customers love your apples.");
        System.out.println("You have " + (numOfApples -= 224) + " apples left. We'll sell more tomorrow!");
    }
    
}
