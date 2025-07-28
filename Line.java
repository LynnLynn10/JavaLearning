package java102;

public class Line {
    public final double slope;
    public final double yinterc;
    public Line(double slope, double yinterc) {
        this.slope = slope;
        this.yinterc = yinterc;
    }

    public static Point intercept(Line a, Line b) {
        double x = (double)((b.yinterc - a.yinterc)/(a.slope-b.slope));

        double y = (double)((x*a.slope) + a.yinterc);
        return new Point(x, y);
    }

    public static Line perpenBisec(Point a, Point b) {
        Point[] ab = {a, b};
        Point mid = Point.centerOfMass(ab);
        double slope = (double)(-1/(Point.findSlope(a, b)));
        double yinterc = (double)(mid.y-(mid.x*slope));
        return new Line(slope, yinterc);
    }




    
}
