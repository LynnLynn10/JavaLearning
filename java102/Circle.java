package java102;

import java102.Main.Shape;

public class Circle implements Shape {
    public final Point center;
    public final double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    /** 
    * @return Whether point p is inside of the circle.
    */
    public boolean isInside(Point p) {
        return Point.distance(center, p) < radius;
    }

    /** 
    * @return Whether point p part of/on the border of the circle.
    */
    public boolean isOn(Point p) {
        return Point.distance(center, p) == radius;
    }

    /** 
    * @param x How much to translate the circle by in the + x direction.
    * @param y How much to translate the circle by in the + y direction.
    * @return The circle that results from the translation.
    */
    public Circle translate(double x, double y) {
        return new Circle(center.translateX(x).translateY(y), radius);
    }

    /** 
    * @return The circle that results from scaling by k.
    */
    public Circle scale(double k) {
        return new Circle(center, radius * k);
    }

    public static Circle fromPoints(Point p1, Point p2, Point p3) {

        Line line1 = Line.perpenBisec(p1, p2);
        Line line2 = Line.perpenBisec(p2, p3);
        Point center = Line.intercept(line1, line2);
        double radius = (double)(Point.distance(p1, center));
        return new Circle(center, radius);

    }

    @Override
    public String toString() {
        return "(center: " + center + "; radius: " + radius + ")";
    }
}