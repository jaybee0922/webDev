/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication53.source;

import java.util.Arrays;

/**
 *
 * @author PROGRAMMER
 */
public class Car {

    private String color;
    private String make;
    private int year;
    private double price;

    private String[] parts;

    public Car(String color, String make, int year, double price, String[] parts) {
        this.color = color;
        this.make = make;
        this.year = year;
        this.price = price;
        this.parts = Arrays.copyOf(parts, parts.length);
    }

    public Car(Car source) {
        this.color = source.color;
        this.make = source.make;
        this.year = source.year;
        this.price = source.price;
    }

    public String getColor() {
        System.out.println(color);
        return color;
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

    public String[] getParts() {
        return parts;
    }

}
