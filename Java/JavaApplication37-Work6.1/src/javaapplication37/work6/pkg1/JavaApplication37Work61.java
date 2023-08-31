/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication37.work6.pkg1;

/**
 *
 * @author PROGRAMMER
 */
public class JavaApplication37Work61 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("It's time to take your 5th year exams. Please take your seats.");
        String nameOfStudents[] = {"Harry", "Naville", "Ron", "Hermione", "Seamus"};
        String numberOfSeats[] = {"You will take seat ", "You will take seat ", "You will take seat ", "You will take seat ", "You will take seat "};
        int assignOfIndex[] = {0, 1, 2, 3, 4};
        System.out.println(nameOfStudents[0] + " ," + numberOfSeats[0] + "" + assignOfIndex[0]);
        System.out.println(nameOfStudents[1] + " ," + numberOfSeats[1] + "" + assignOfIndex[1]);
        System.out.println(nameOfStudents[2] + " ," + numberOfSeats[2] + "" + assignOfIndex[2]);
        System.out.println(nameOfStudents[3] + " ," + numberOfSeats[3] + "" + assignOfIndex[3]);
        System.out.println(nameOfStudents[4] + " ," + numberOfSeats[4] + "" + assignOfIndex[4]);

        //Looping arrays
        String fruits[] = {"1", "2", "3", "4", "5"};
        int i = 0;
        while (i < fruits.length) {
            System.out.println("Display " + fruits[i]);
            i++;
        }
    }

}
