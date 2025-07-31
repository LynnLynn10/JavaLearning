package java102;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Point p = new Point(1, -1);
        System.out.println(p.angle());
    
        
        

        

    
    }

    public static void returnAll(LibraryItem[] items) {
        for (LibraryItem item: items) {
            item.returnItem();
        }
    }

    public static ArrayList<LibraryItem> availableItems(LibraryItem[] items) {
        ArrayList<LibraryItem> available = new ArrayList<>(3);
        for (LibraryItem item:items) {
            if (item.available()) {
                available.add(item);
            }
        }
        return available;
    }

    public static void checkOutAll(LibraryItem[] items) {
        for (LibraryItem item: items) {
            item.checkOut();
        }
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

