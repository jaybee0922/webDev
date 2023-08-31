/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication64.introduction.to.arrays;

/**
 *
 * @author PROGRAMMER
 */
public class JavaApplication64INTRODUCTIONTOARRAYS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int myArr[] = new int[7];
        myArr[0] = 20;
        myArr[1] = 35;
        myArr[2] = -15;
        myArr[3] = 7;
        myArr[4] = 55;
        myArr[5] = 1;
        myArr[6] = 22;

        int index = - 1;
        for (int i = 0; i < myArr.length; i++) {
            if (myArr[i] == 7) {
                index = i;
                break;
            }
           
        }
         System.out.println("The index is = " + index);

    }

}
