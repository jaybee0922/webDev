/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication47.work.pkg6.pkg13;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author PROGRAMMER
 */
public class JavaApplication47Work613 {

    /**
     * @param args the command line arguments
     */
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        double sum = 0;
        double sum2 = 0;
        double sum3 = 0;
        double myFoodAndBeverages[][] = {
            {12.99, 8.99, 9.99, 10.49, 11.99},
            {0.99, 1.99, 2.49, 1.49, 2.99},
            {8.99, 7.99, 9.49, 9.99, 10.99}
        };
        System.out.println(Arrays.toString(myFoodAndBeverages[0]));
        System.out.println(Arrays.toString(myFoodAndBeverages[1]));
        System.out.println(Arrays.toString(myFoodAndBeverages[2]));

        for (int i = 0; i <= myFoodAndBeverages.length; i++) {
            sum += myFoodAndBeverages[0][i];
        }
        System.out.println("" + (sum + myFoodAndBeverages[0][4]));
        
        for(int j = 0; j <= myFoodAndBeverages.length; j++){
            sum2 += myFoodAndBeverages[1][j];
        }
        System.out.println("" + (sum2 + myFoodAndBeverages[1][4]));
        
        for(int k = 0; k <= myFoodAndBeverages.length; k++){
            sum3 += myFoodAndBeverages[2][k];
        }
        System.out.println("" + (sum3 + myFoodAndBeverages[2][4]));


//        int myInt[] = new int[5];
//        int sum = 0;
//        for(int i = 0; i < myInt.length; i++){
//            myInt[i] = scanner.nextInt();
//            sum += myInt[i];
//        }
//        System.out.println(sum);
    }

}
