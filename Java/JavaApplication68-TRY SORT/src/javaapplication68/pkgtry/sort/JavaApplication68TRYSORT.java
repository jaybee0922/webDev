/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication68.pkgtry.sort;

/**
 *
 * @author PROGRAMMER
 */
public class JavaApplication68TRYSORT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int myStoreArrays[] = new int[10];

        myStoreArrays[0] = 95;
        myStoreArrays[1] = 65;
        myStoreArrays[2] = 12;
        myStoreArrays[3] = 36;
        myStoreArrays[4] = 42;
        myStoreArrays[5] = 7;
        myStoreArrays[6] = 55;
        myStoreArrays[7] = 2;
        myStoreArrays[8] = 4;
        myStoreArrays[9] = 9;

        for (int lastUnsortedIndex = myStoreArrays.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (myStoreArrays[i] < myStoreArrays[i + 1]) {
                    swap(myStoreArrays, i, i + 1);
                }
            }
        }
        for (int i = 0; i < myStoreArrays.length; i++) {
            System.out.println(myStoreArrays[i]);
        }

    }

    public static void swap(int array[], int i, int j) {

        if (i == j) {
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }

}
