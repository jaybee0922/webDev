/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7.type.casting;

/**
 *
 * @author PROGRAMMER
 */
public class JavaApplication7TypeCasting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        double firstSalary = 95112.415;
        int convertToInt = (int) firstSalary; //type casting
        System.out.println("firstSalary = " + convertToInt);
        
        
        double sales = 24309.65;
        double profit = 18562.18;
        double refunds = 688.78;
        double shipping = 1233.57;
        
        int convertSales = (int) sales;
        int convertProfit = (int) profit;
        int convertRefunds = (int) refunds;
        int convertShipping = (int) shipping;
        
        System.out.println("This month, we made $" + convertSales + " in sales");
        System.out.println("Factoring in costs, we made $" + convertProfit + " in profit");
        System.out.println("The refunds are at a low $" + convertRefunds + "." + " This is a good sign!");
        System.out.println("Shipping costs were hight. We paid $" + convertShipping + " in shipping");
    }
    
}
