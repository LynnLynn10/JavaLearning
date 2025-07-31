package java102;

public class Dvd extends LibraryItem {
    public final double runTime;
    public Dvd(String title, String itemId, double runTime) {
        super(title, itemId);
        this.runTime = runTime;
    }

    @Override
    public String toString() {
        return "DVD: " + title + ", Runtime: " + runTime + " minutes";
    }
    
}
