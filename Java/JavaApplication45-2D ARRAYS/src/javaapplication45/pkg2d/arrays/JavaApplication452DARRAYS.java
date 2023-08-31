/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication45.pkg2d.arrays;

import java.util.Arrays;

/**
 *
 * @author PROGRAMMER
 */
public class JavaApplication452DARRAYS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int myGrades[][] = {
            {72,74,78,76}, //firstRow = Harry
            {65,64,61,67}, //secondRow = Ron
            {95,98,99,100} //thirdRow = Hermione
        };
//        //ang 3 kay kung pila kabook row sa array
//        //ang 4 kay kung pila kabook element ang naa sa row
//        myGrades[0][0] = 72; //1st index of 1st element in 1st row
//        myGrades[0][1] = 74; //2nd index of 2nd element in 2nd row
//        myGrades[0][2] = 78; //3rd index of 3rd element in 3rd row
//        myGrades[0][3] = 76; //4th index of 4th element in 4th row
//        
//        myGrades[1][0] = 65;
//        myGrades[1][1] = 64;
//        myGrades[1][2] = 61;
//        myGrades[1][3] = 67;
//        
//        
//        myGrades[2][0] = 95;
//        myGrades[2][1] = 98;
//        myGrades[2][2] = 99;
//        myGrades[2][3] = 100;

           
           for(int i = 0; i <= myGrades.length; i++){
               System.out.println("1st Row "+ " " + myGrades[0][i]);
           }
        
        
        System.out.println("firstRow =  Harry " + Arrays.toString(myGrades[0]));
        System.out.println("secondRow = Ron " + Arrays.toString(myGrades[1]));
        System.out.println("thirdRow = Hermione " + Arrays.toString(myGrades[2]));
        System.out.println("The first grade of Harry is: " + myGrades[0][0]);
        System.out.println("The first grade of Ron is: " + myGrades[1][0]);
        System.out.println("The first grade of Hermione is: " + myGrades[2][0]);
    }
    
}
