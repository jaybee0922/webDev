/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication51.project.pkgfor.pkg2d.array;

/**
 *
 * @author PROGRAMMER
 */
public class JavaApplication51ProjectFor2DARRAY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int myStoreArrays[][] = {
            {94, 85, 29, 51, 95},
            {100, 291, 5, 20, 13},
            {75, 42, 65, 79, 81}
        };
        int myMaxNumber = myStoreArrays[0][0];
        int myLowestNumber = myStoreArrays[0][0];
        int myFirstIndex = myStoreArrays[0][0];
        int myLastIndex = myStoreArrays[0][0];
        for (int i = 0; i < myStoreArrays.length; i++) {
            for (int j = 0; j < myStoreArrays[i].length; j++) {
                if (myStoreArrays[i][j] > myMaxNumber) {
                    myMaxNumber = myStoreArrays[i][j];
                } else if (myStoreArrays[i][j] < myLowestNumber) {
                    myLowestNumber = myStoreArrays[i][j];
                }
            }
        }
        System.out.println("The lowest number in array is: " + myLowestNumber);
        System.out.println("The highest number in array is: " + myMaxNumber);
        for (int i = 0; i < myStoreArrays.length - 0; i++) {
            for (int j = 0; j < myStoreArrays[i].length - 0; j++) {
                myLastIndex = myStoreArrays[i][j];
            }
        }
        System.out.println("The last index or last element is: " + myLastIndex);

        for (int i = 0; i > myStoreArrays.length; i++) {
            for (int j = 0; j > myStoreArrays[i].length; j++) {
                myFirstIndex = myStoreArrays[i][j];
            }
        }
        System.out.println("The first index or first element is: " + myFirstIndex);

    }

}
