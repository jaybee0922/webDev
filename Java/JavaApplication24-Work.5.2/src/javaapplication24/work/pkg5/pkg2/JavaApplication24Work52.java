/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication24.work.pkg5.pkg2;

/**
 *
 * @author PROGRAMMER
 */
import java.util.Scanner;

public class JavaApplication24Work52 {

    /**
     * @param args the command line arguments
     */
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


//        int myArr[] = new int[5];
//        int sum = 0;
//        for (int i = 0; i < myArr.length; i++) {
//            myArr[i] = scanner.nextInt();
//            sum += myArr[i];
//        }
//        System.out.println("The sum is: " + sum);

        System.out.println("Hi bart. I can write lines for you.");
        System.out.println("What do you want me to write? ");
        String myWords = scanner.nextLine();
        for(int i = 0; i <= 99; i++){
            System.out.println(i + ". " + myWords + "");
        }
      

    }

}
