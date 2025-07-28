package java102;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println(Point.distance(new Point(0, 0), new Point(2, 4)));
        System.out.println(Point.distance(new Point(0, 0), new Point(4, 0)));   
    
    
    }

    public interface Shape {
        public double area();
        public Shape scale(double k);
        public double perimeter();
        public boolean isOn(Point p);
        public boolean isInside(Point p);
        public Shape translate(double x, double y);
    }

    static double sumArea(Shape[] shapes) {
        double sum = 0;
        for(Shape s:shapes) {
            sum += s.area();
        }
        return sum;

    }

    static Shape[] scaleAll(Shape[] shapes, double k) {
        Shape[] scaled = new Shape[shapes.length];
        for (int i = 0; i<shapes.length; i++) {
            scaled[i] = shapes[i].scale(k);
        }
        return scaled;
        
    }
    
    static <T> String arrayToString(T[] arr) {
        String str = "[";
        for (int j=0; j<arr.length-1; j++) {
            str += arr[j] + ", ";
        }
        return str + arr[arr.length-1] + "]";
    }
}

