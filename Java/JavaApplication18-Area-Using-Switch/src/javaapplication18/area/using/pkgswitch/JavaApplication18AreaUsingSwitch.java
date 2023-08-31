/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication18.area.using.pkgswitch;

/**
 *
 * @author PROGRAMMER
 */
public class JavaApplication18AreaUsingSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double measure1 = measureRectangle(4.3, 2.2, "area");
        double measure2 = measureRectangle(3.2, 4.1, "perimeter");
        stringPrinter(4.3, 2.2, measure1, "area");
        stringPrinter(3.2, 4.1, measure2, "perimeter");
    }

    public static double measureRectangle(double length, double width, String option) {

        if ((length < 0) || (width < 0)) {
            System.out.println("length or width cannot be negative");
            System.exit(0);
        }
        switch (option) {
            case "area":
                return length * width;
            case "perimeter":
                return (length + width) * 2;
            default:
                return 404;
        }
    }

    public static void stringPrinter(double length, double width, double area, String option) {
        System.out.println("The " + option + " of a rectangle with length " + length + " and width " + width + " is equal to " + area + "\n");
    }

}
