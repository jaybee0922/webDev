/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication48.pkg2d.array.nested.loop;

/**
 *
 * @author PROGRAMMER
 */
public class JavaApplication482DARRAYNESTEDLOOP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int myGrades[][] = {
            {72, 74, 78, 76}, //firstRow = Harry
            {65, 64, 61, 67}, //secondRow = Ron
            {95, 98, 99, 100} //thirdRow = Hermione
        };

        for (int i = 0; i < myGrades.length; i++) {
            
            switch(i){
                case 0: System.out.print("\tHarry: ");break;
                case 1: System.out.print("\tRon: ");break;
                case 2: System.out.print("\tHermione: ");break;
            }
           for(int j = 0; j < myGrades[i].length; j++){
               System.out.print(myGrades[i][j] + " ");
           }
            System.out.println();
        }
    }

}
