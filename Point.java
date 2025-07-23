package java102;

public class Point {
    public final double x;
    public final double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point TranslateX(double t) {
        return new Point(x+t, y);
    }
    
    public Point TranslateY(double t) {
        return new Point(x, y+t);
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
   }

   public static Double distance(Point a, Point b) {
        return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
   }

   public static Point centerofMass(Point[] points) {
        double xval = 0;
        double yval = 0;
        for (Point p:points) {
            xval += p.x;
            yval += p.y;
        }
        return new Point((xval/points.length), (yval/points.length));
    }
    static Point origin = new Point(0, 0);
    
    public double angle(Point point) {
        return Math.toDegrees(Math.asin((Math.abs(point.y))/distance(point, origin)));
    }    

    public Point rotate(double theta) {
        theta = Math.toRadians(theta);
        theta += Math.toRadians(angle(new Point(x, y)));
        double a = Math.cos(theta)*distance(new Point(x,y), origin);
        double b = Math.sin(theta)*distance(new Point(x,y), origin);
        return new Point(a, b);        
    }


}