/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication49.work6.pkg13.revisit;

/**
 *
 * @author PROGRAMMER
 */
public class JavaApplication49Work613Revisit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double myFoodAndBeverages[][] = {
            {12.99, 8.99, 9.99, 10.49, 11.99},
            {0.99, 1.99, 2.49, 1.49, 2.99},
            {8.99, 7.99, 9.49, 9.99, 10.99}
        };

        for (int i = 0; i < myFoodAndBeverages.length; i++) {
            switch(i){
                case 0: System.out.print("\tBaking: ");break;
                case 1: System.out.print("\tBeverage: ");break;
                case 2: System.out.print("\tCereals: ");break;
            }
            for(int j = 0; j < myFoodAndBeverages[i].length; j++){
                System.out.print(myFoodAndBeverages[i][j] + " ");
            }
            System.out.println();
        }
    }

}
