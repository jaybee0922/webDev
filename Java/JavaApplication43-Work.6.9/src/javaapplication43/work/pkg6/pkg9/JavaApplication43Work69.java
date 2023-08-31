/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication43.work.pkg6.pkg9;

/**
 *
 * @author PROGRAMMER
 */
import java.util.Arrays;

public class JavaApplication43Work69 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double originalPricesAre[] = {1.99, 2.99, 3.99, 4.99};
        double taxAfterPrices[] = Arrays.copyOf(originalPricesAre, originalPricesAre.length);
        for (int i = 0; i < originalPricesAre.length; i++) {
            taxAfterPrices[i] = originalPricesAre[i];
        }
        taxAfterPrices[0] = 2.2487; //update the value 
        taxAfterPrices[1] = 3.3787; //update the value 
        taxAfterPrices[2] = 4.5087; //update the value 
        taxAfterPrices[3] = 5.6387; //update the value 

        System.out.println("Original prices are: " + Arrays.toString(originalPricesAre));
        System.out.println("After tax prices are: " + Arrays.toString(taxAfterPrices));

    }

}
