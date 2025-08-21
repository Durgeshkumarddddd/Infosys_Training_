package Core_Java.Polymorphism;


    class Point {
    private double xCoordinate;
    private double yCoordinate;

    // Constructor
    public Point(double xCoordinate, double yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    // Getter and Setter for xCoordinate
    public double getxCoordinate() {
        return xCoordinate;
    }

    public void setxCoordinate(double xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    // Getter and Setter for yCoordinate
    public double getyCoordinate() {
        return yCoordinate;
    }

    public void setyCoordinate(double yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    // Method to calculate distance from origin
    public double calculateDistance() {
        double distance = Math.sqrt((xCoordinate * xCoordinate) + (yCoordinate * yCoordinate));
        return Math.round(distance * 100.0) / 100.0; // rounding to 2 decimal places
    }

    // Method to calculate distance from another point
    public double calculateDistance(Point point) {
        double distance = Math.sqrt(Math.pow(this.xCoordinate - point.xCoordinate, 2) + Math.pow(this.yCoordinate - point.yCoordinate, 2));
        return Math.round(distance * 100.0) / 100.0; // rounding to 2 decimal places
    }
}



class Tester {

	public static void main(String[] args) {
		Point point1 = new Point(3.5, 1.5);
        Point point2 = new Point(6, 4);
                                
        System.out.println("Distance of point1 from origin is "+point1.calculateDistance());
        System.out.println("Distance of point2 from origin is "+point2.calculateDistance());
        System.out.println("Distance of point1 from point2 is "+point1.calculateDistance(point2));
        
        //Create more objects for testing your code                

	}
}



/*   Problem: Implement Point Class

Description:
Create a class Point to represent a point in 2D space with two coordinates xCoordinate and yCoordinate.

Requirements

Constructor

Point(double xCoordinate, double yCoordinate)

Initializes xCoordinate and yCoordinate.

Methods: 

double calculateDistance()

Calculates and returns the distance of the point from the origin (0,0).

Round the result to 2 decimal places.

double calculateDistance(Point point)

Calculates and returns the distance between the current point and the given point object.

Round the result to 2 decimal places.

Getter and Setter Methods

For xCoordinate and yCoordinate.

Formula
𝑑𝑖𝑠t𝑎𝑛𝑐𝑒=(𝑥2−𝑥1)2+(𝑦2−𝑦1)2
distance=(x2−x1)2+(y2−y1)2
	​
Hints

Use Math.sqrt() for square root.

Use Math.pow() for powers.

Use Math.round(value * 100.0) / 100.0 to round to two decimal places. */




// Question Summary:
// Create a class Point to represent a point with two coordinates (xCoordinate, yCoordinate).

// Requirements:

// Implement a constructor Point(double xCoordinate, double yCoordinate) to initialize the values.

// Implement getter and setter methods for both coordinates.

// Implement calculateDistance() method to return the distance of the point from the origin (0,0), rounded to 2 decimal places.

// Implement calculateDistance(Point point) method to return the distance between the current point and the given point, rounded to 2 decimal places.

// Use Math.sqrt() for square root and Math.round() for rounding.

// Test the class using a Tester class by creating objects and printing the distances.
