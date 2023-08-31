/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication67.insertion.sort;

/**
 *
 * @author PROGRAMMER
 */
public class JavaApplication67INSERTIONSORT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //insertion sort
        //shift elements
        int myArr[] = new int[8];
        myArr[0] = 20;
        myArr[1] = 35;
        myArr[2] = -15;
        myArr[3] = 7;
        myArr[4] = 55;
        myArr[5] = 1;
        myArr[6] = -22;
        myArr[7] = -50;

        for (int firstSortedIndex = 0; firstSortedIndex < myArr.length; firstSortedIndex++) {
            int newElement = myArr[firstSortedIndex];
            int i;
            for (i = firstSortedIndex; i > 0 && myArr[i - 1] > newElement; i--) {
                myArr[i] = myArr[i - 1];
            }
            myArr[i] = newElement;
        }

        for (int i = 0; i < myArr.length; i++) {
            System.out.println(myArr[i]);
        }
    }
}

//-50
//-22
//-15
//1
//7
//20
//35
//55
