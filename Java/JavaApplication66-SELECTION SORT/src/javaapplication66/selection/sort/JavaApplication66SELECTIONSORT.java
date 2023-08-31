/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication66.selection.sort;

/**
 *
 * @author PROGRAMMER
 */
public class JavaApplication66SELECTIONSORT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //selection sort
        //swap elements
        int myArr[] = new int[7];
        myArr[0] = 20;
        myArr[1] = 35;
        myArr[2] = -15;
        myArr[3] = 7;
        myArr[4] = 55;
        myArr[5] = 1;
        myArr[6] = -22;

        for (int lastUnsortedIndex = myArr.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {

            int largest = 0;
            for (int i = 1; i <= lastUnsortedIndex; i++) {
                if (myArr[i] > myArr[largest]) {
                    largest = i;
                }
            }
            swap(myArr, largest, lastUnsortedIndex);
        }
        for (int i = 0; i < myArr.length; i++) {
            System.out.println(myArr[i]);
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
