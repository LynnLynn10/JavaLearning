package java102;

import java102.Main.Shape;

public class RightTriangle implements Shape {
    public final Point corner;
    public final double side1;
    public final double side2;

    public RightTriangle(Point corner, double side1, double side2) {
        this.corner = corner;
        this.side1 = side1;
        this.side2 = side2;
    }

    public double area() {
        return (double)(side1*side2*.5);
    }

    public double hypotenuse() {
        return Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));

    }
    
    public double perimeter() {
        return side1 + side2 + hypotenuse();
    }

    public RightTriangle scale(double k) {
        return new RightTriangle(corner, side1*k, side2*k);
    }

    public RightTriangle translate(double x, double y) {
        return new RightTriangle(corner.translateX(x).translateY(y), side1, side2);

    }

    public boolean similar(RightTriangle a, RightTriangle b) {
        return (a.side1==b.side1 && a.side2 == b.side2)||(a.side1==b.side2 && a.side2 == b.side1);

    }

    public boolean isOn(Point p) {
        double xDist = p.x - corner.x;
        Point topCorner = new Point(corner.x, corner.y + side2);
        Point bottomCorner = new Point(corner.x + side1, corner.y);
        
        
        return (p == topCorner) || 
               (p == bottomCorner) ||
               (p == corner) ||
               (xDist< side1 && 0<xDist && Point.findSlope(topCorner, p) == Point.findSlope (topCorner, bottomCorner));

    }

    public boolean isInside(Point p) {
        double xDist = p.x - corner.x;
        double yDist = p.y - corner.y;
        Point topCorner = new Point(corner.x, corner.y + side2);
        Point bottomCorner = new Point(corner.x + side1, corner.y);
        Line hypotenuse = new Line(Point.findSlope(topCorner, bottomCorner), side2);

        return 0 < yDist && yDist < side2 &&
               0<xDist && xDist < side1 &&
               (p.y < hypotenuse.findY(p.x));
    }

    


}
