/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication50.work.pkg6.pkg14.randomnumbers;

/**
 *
 * @author PROGRAMMER
 */
public class JavaApplication50Work614RandomNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int myRandomNumbers[][] = {
            {77, 10, 58, 44, 52, 89, 43, 75, 19, 22}, //10
            {23, 21, 34, 56, 87, 33, 84, 65, 11, 11}, //20
            {93, 76, 0, 45, 79, 5, 58, 3, 13, 49}, //30
            {7, 60, 17, 94, 34, 84, 77, 12, 24, 67}, //40
            {17, 39, 26, 29, 81, 98, 10, 22, 63, 51}, //50
            {8, 29, 56, 6, 59, 5, 12, 90, 25, 64}, 
            {72, 72, 64, 58, 85, 24, 54, 18, 5, 12},
            {53, 66, 90, 68, 23, 86, 83, 77, 40, 94},
            {53, 82, 2, 14, 52, 39, 83, 3, 61, 25},
            {86, 87, 32, 0, 16, 55, 50, 1, 43, 46},
            {40, 90, 3, 66, 68, 56, 1, 94, 6, 1},
            {40, 11, 25, 94, 88, 38, 8, 73, 81, 66},
            {93, 32, 47, 60, 18, 12, 94, 16, 21, 10},
            {2, 28, 4, 41, 51, 97, 81, 24, 45, 77},
            {50, 80, 14, 90, 50, 49, 51, 33, 1, 16},
            {67, 65, 17, 68, 67, 56, 10, 23, 19, 48}
        };
        for (int i = 0; i < myRandomNumbers.length; i++) {
            for (int j = 0; j < myRandomNumbers[i].length; j++) {
                System.out.print(myRandomNumbers[i][j] + " ");
            }
            System.out.println("");
        }
    }

}
