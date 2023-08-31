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
public class Car {

    private String make;
    private int year;
    private double price;
    private String color;

    public Car(String make, int year, double price, String color) {
        this.make = make;
        this.year = year;
        this.price = price;
        this.color = color;
    }

    public Car(Car source) {
        this.make = source.make;
        this.year = source.year;
        this.price = source.price;
        this.color = source.color;
    }

    public String getMake() {
        System.out.println(make);
        return make;
    }

    public int getYear() {
        System.out.println(year);
        return year;

    }

    public double getPrice() {
        System.out.println(price);
        return price;
    }

    public String getColor() {
        System.out.println(color);
        return color;
    }

    public void hasAWheel() {
        System.out.println("I have a wheel");
    }

}
