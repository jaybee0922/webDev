/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication62.data.structure.introduction;

/**
 *
 * @author PROGRAMMER
 */
public class JavaApplication62DATASTRUCTUREINTRODUCTION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        printItems(10);

    }

    public static void printItems(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    System.out.println(i + " " + j + " " + k);
                }
            }
        }
    }
}
