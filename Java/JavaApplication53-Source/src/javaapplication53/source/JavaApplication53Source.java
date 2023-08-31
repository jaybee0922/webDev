/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication53.source;

/**
 *
 * @author PROGRAMMER
 */
import java.util.Arrays;
public class JavaApplication53Source {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String[] parts = {"One","Two"};

        Car car = new Car("Brown", "Honda", 2005, 50000, parts);
        
        car.getColor();
        car.getMake();
        car.getYear();
        car.getPrice();
        car.getParts();
        
    }

}
