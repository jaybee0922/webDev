/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication38.work.pkg6.pkg2;

/**
 *
 * @author PROGRAMMER
 */
public class JavaApplication38Work62 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("It's time to take your 5th year exams. Please take your seats.");
        String nameOfSudent[] = {"Malfoy", "Crabbe", "Goyle", "Pansy", "Dean"};
        
        for(int i = 0; i < nameOfSudent.length; i++){
            System.out.println(nameOfSudent[i] + ", you will take seat " + i);
        }
    }

}
