/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication16.work.pkg4.pkg2;

/**
 *
 * @author PROGRAMMER
 */
public class JavaApplication16Work42 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        restaurant(53,15);
        double newArea = totalArea(2.2,4.3);
        System.out.println("The area is: " + newArea);
    }
    public static void restaurant(double myBill, double myTip){
        
        //allow me to tip my waiter 15% of my bill
        //bill is 53
        double myTotal = myBill * (myTip/100);
        System.out.println("The percentage of tip is: " + myTotal);
    }
    
    public static double totalArea(double length, double width){
        double area = (length * width);
        return area;
    }
    
}
