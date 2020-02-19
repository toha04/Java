package com.epam.hw7;

public class Shape {
    private String color;
    public Shape (String color) {
        this.color = color;
    }
    public void setColor (String color) {
        this.color = color;
    }
    public  String getColor () {
        return color;
    }
    public Shape() {

    }
    @Override
    public String toString() {
        return "class= " + this.getClass().getSimpleName() + "color= " + color;
    }
    public double calcArea() {
        return 0.0;
    }
}
