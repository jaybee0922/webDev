/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication55.pkgtry.to.code;

/**
 *
 * @author PROGRAMMER
 */
public class JavaApplication55TryToCode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String myFirstArray[][] = {
            {"One", "Two", "Three", "Four", "Five"},
            {"Six", "Seven", "Eight", "Nine", "Ten"}
        };
        int myIndex = (int) (Math.random() * myFirstArray.length);
        for(int i = 0; i < myFirstArray.length; i++){
            for(int j = 0; j < myFirstArray[i].length; j++){
                int myLastIndex = myIndex;
            }
        }      
    }
}


//        String myArr[] = {"One", "Two", "Three", "Four", "Five"};
//        int myIndex = (int) (Math.random() * myArr.length);
//        System.out.println("Random: " + myArr[myIndex]);



//   int target = (int) Math.floor(Math.random() * 5);
//        int guess = (int) Math.floor(Math.random() * 5);
//
//        while (true) {
//            if (guess != target) {
//                System.out.println("Target: " + target + " Guess: " + guess);
//                guess = (int) Math.floor(Math.random() * 5);
//                System.out.println("Please try again!");
//                System.out.println("\n");
//            } else if (guess == target) {
//                System.out.println("Target: " + target + " Guess: " + guess);
//                System.out.println("CONGRATS YOU WIN!");
//                System.out.println("YOU ARE GREAT!!!");
//                System.out.println("\n");
//                break;
//            }
//        }
