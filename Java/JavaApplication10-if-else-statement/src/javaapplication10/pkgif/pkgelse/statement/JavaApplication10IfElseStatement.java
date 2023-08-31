/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10.pkgif.pkgelse.statement;

/**
 *
 * @author PROGRAMMER
 */

public class JavaApplication10IfElseStatement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

            int grade = 50;
            if((grade >= 20 || grade <= 24)){
                System.out.println("You got A!");
            } else if((grade > 100 && grade < 95)){
                System.out.println("You got B!");
            }
        

    }
    
}
