/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication41.work.pkg6.pkg5;

/**
 *
 * @author PROGRAMMER
 */
public class JavaApplication41Work65 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int myHighestScore[] = {5236, 40234, 47599, 11426, 3464, 47469, 32428, 23009, 42045, 19433};
        int myMaxNumber = myHighestScore[0];
        for (int i = 0; i < myHighestScore.length; i++) {
            if (myHighestScore[i] > myMaxNumber) {
                myMaxNumber = myHighestScore[i];
            }

        }
        
        System.out.println("The highest score was: " + myMaxNumber + ". Impressive!");
    }
}

//
//        while (true) {
//            System.out.println("What can I help you find? ");
//            inputButton = scanner.nextLine();
//            for (int i = 0; i < myStoreArrays.length; i++) {
//                if (inputButton.equals(myStoreArrays[i])) {
//                    System.out.println("We have that in aisle: " + i);
//                    continue;
//                }
//            }
//            break;
//        }