package edu.northeastern.csye6200;

public class Lab9P1 {
    public static void main(String[] args) {
        // Create an Octagon object with side value 9
        Octagon octagon = new Octagon(9);

        // Display the area and perimeter of the Octagon
        System.out.println("Area is " + octagon.getArea());
        System.out.println("Perimeter is " + octagon.getPerimeter());

        // Create a new object using the clone() method
        Octagon clonedOctagon = (Octagon) octagon.clone();

        // Compare the two objects using the compareTo() method
        int comparisonResult = octagon.compareTo(clonedOctagon);
        System.out.println("Compare the methods " + comparisonResult);
    }
}

class Octagon extends GeometricObject implements Comparable<Octagon>, Cloneable {
    private double side;

    // Constructor
    public Octagon(double side) {
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
        return (2 + 4 / Math.sqrt(2)) * side * side;
    }

    // Calculate and override the getPerimeter() method
    @Override
    public double getPerimeter() {
        return 8 * side;
    }

    // Implement the compareTo() method to compare Octagon objects based on their area
    @Override
    public int compareTo(Octagon o) {
        double diff = this.getArea() - o.getArea();
        if (diff > 0) {
            return 1;
        } else if (diff < 0) {
            return -1;
        } else {
            return 0;
        }
    }

    // Implement the clone() method to create a copy of the Octagon object
    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}
