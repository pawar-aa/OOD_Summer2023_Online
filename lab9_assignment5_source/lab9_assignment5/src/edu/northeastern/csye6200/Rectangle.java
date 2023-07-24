package edu.northeastern.csye6200;

public class Rectangle extends GeometricObject {

    private double width;
    private double height;

    // Constructor
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Getter and setter for width and height
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // Calculate and override the getArea() method
    @Override
    public double getArea() {
        return width * height;
    }

    // Calculate and override the getPerimeter() method
    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }
}

