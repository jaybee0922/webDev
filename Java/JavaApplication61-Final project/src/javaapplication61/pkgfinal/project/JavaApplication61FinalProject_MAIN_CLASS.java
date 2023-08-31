/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication61.pkgfinal.project;

/**
 *
 * @author PROGRAMMER
 */
public class JavaApplication61FinalProject_MAIN_CLASS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        SubClass subclass = new SubClass();
        subclass.choices();
        subclass.addBill();
        subclass.editBill();
        subclass.deleteBill();
        subclass.displayReceipt();

    }
}
