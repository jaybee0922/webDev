/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication65.bubble.sort;

/**
 *
 * @author PROGRAMMER
 */
public class JavaApplication65BUBBLESORT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        //bubble sort
        //swap elements
        
        int myArr[] = new int[7];
        myArr[0] = 20;
        myArr[1] = 35;
        myArr[2] = -15;
        myArr[3] = 7;
        myArr[4] = 55;
        myArr[5] = 1;
        myArr[6] = -22;

        //this is stable sort
        //although this is a bubble sort
       
        for(int lastUnsortedIndex = myArr.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--){
            for(int i = 0; i < lastUnsortedIndex; i++){
                if(myArr[i] > myArr[i + 1]){
                    swap(myArr, i, i + 1);
                }
            }
        }
        for(int i = 0; i < myArr.length; i++){
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



//-22
//-15
//1
//7
//20
//35
//55