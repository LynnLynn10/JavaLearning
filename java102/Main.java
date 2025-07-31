package java102;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Book b1 = new Book("Harry Potter and the Chamber of Secrets", "A", "J.K.Rowling", 341);
        Dvd d1 = new Dvd("IT", "B", 135);
        Book b2 = new Book("The Art of War", "C", "Sun Tzu", 592);
        LibraryItem[] items = {b1, d1, b2};
        checkOutAll(items);
        for (LibraryItem item: items) {
            System.out.println(item.available());
        }
        
        returnAll(items);
        for (LibraryItem item: items) {
            System.out.println(item.available());
        }
        d1.checkOut();
        b1.checkOut();
        System.out.println(availableItems(items));

        

    
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

