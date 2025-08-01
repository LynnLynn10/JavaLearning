package java102;
import java.util.ArrayList;

public class Grid<T> {
    private final ArrayList<ArrayList<T>> grid;
    public final int sideLength;
    public static int max = 0;

    public Grid(int sideLength, T defaultVal) {
        this.sideLength = sideLength;
        this.grid = new ArrayList<ArrayList<T>>(sideLength);
        for(int i=0; i<sideLength; i++) {
            grid.add(new ArrayList<>(sideLength));
            for(int j=0; j<sideLength; j++) {
                grid.get(i).add(defaultVal);
            }
        }
        if (max<sideLength) {
            max = sideLength;
        }
    }

    public T get(int row, int col) {
        return grid.get(row).get(col);
    }

    public void set(int row, int col, T input) {
        grid.get(row).set(col, input);
    }

    @Override
    public String toString() {
        String str = "";
        for (ArrayList<T> row:grid) {
            for (T element: row) {
                str += element + " ";
            }
            str += "\n";
        }
        return str;
    }

    public ArrayList<T> diagonal() {
        ArrayList<T> n = new ArrayList<T>();
        for(int i=0; i<sideLength; i++){
            n.add(grid.get(i).get(i));
        }
        return n;
    }

    public static int maxSideLength() {
        return max;
    }
    
}
