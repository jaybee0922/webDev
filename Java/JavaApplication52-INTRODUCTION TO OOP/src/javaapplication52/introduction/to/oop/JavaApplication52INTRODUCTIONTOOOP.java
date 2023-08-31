/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication52.introduction.to.oop;

/**
 *
 * @author PROGRAMMER
 */
public class JavaApplication52INTRODUCTIONTOOOP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Car car = new Car("Honda", 2006, 5000.51, "Brown");
        Car car2 = new Car(car);
        car.getMake();
        car.getYear();
        car.getPrice();
        car.getColor();
        System.out.println("");
        car2.getMake();
        car2.getYear();
        car2.getPrice();
        car2.getColor();
    }

}
