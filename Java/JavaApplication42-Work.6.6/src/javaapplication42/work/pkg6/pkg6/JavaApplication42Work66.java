/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication42.work.pkg6.pkg6;

/**
 *
 * @author PROGRAMMER
 */
public class JavaApplication42Work66 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int highestScore[] = {6061, 18673, 39703, 46338, 35390, 23529, 48704, 22778, 30428, 48859};
        int myMaxNumber = 0;
        int myLastIndex = 0;
        highestScore[9] = 95091; //to update new value of array
        for (int i = 0; i < highestScore.length; i++) {
            if (highestScore[i] > myMaxNumber) {
                myMaxNumber = highestScore[i];
            }
        }
        System.out.println("The highest score was: " + myMaxNumber);
        for (int i = 0; i < highestScore.length - 0; i++) {
            myLastIndex = i;
        }
        System.out.println("It's the gentleman in seat: " + myLastIndex + ". Give that man a cookie!");
    }
}
