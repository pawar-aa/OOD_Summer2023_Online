package edu.northeastern.csye6200;

public class Lab9P2 {
    public static void main(String[] args) {
        GeometricObject[] objects = {
                new Square(2),
                new Circle(5),
                new Square(5),
                new Rectangle(3, 4),
                new Square(4.5)
        };

        for (GeometricObject obj : objects) {
            System.out.println("Area is " + obj.getArea());
            if (obj instanceof Colorable) {
                ((Colorable) obj).howToColor();
            }
        }
    }
}

interface Colorable {
    void howToColor();
}

class Square extends GeometricObject implements Colorable {
    private double side;

    // Constructor
    public Square(double side) {
        this.side = side;
    }

    // Getter and setter for side
    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    // Calculate and override the getArea() method
    @Override
    public double getArea() {
        return side * side;
    }

    // Calculate and override the getPerimeter() method
    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    // Implement the howToColor() method from the Colorable interface
    @Override
    public void howToColor() {
        System.out.println("Color all four sides\n");
    }
}
