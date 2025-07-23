package java102;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    
    static <T> String arrayToString(T[] arr) {
        String str = "[";
        for (int j=0; j<arr.length-1; j++) {
            str += arr[j] + ", ";
        }
        return str + arr[arr.length-1] + "]";
    }
    public static void main(String[] args) {
        Grid<Integer> j = new Grid<>(20, 4);
        Grid<Integer> a = new Grid<>(20, 4);
        Grid<Integer> b = new Grid<>(3, 4);
        System.out.println(Grid.maxSideLength());

    }
}

