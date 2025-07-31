package java102;

public class B extends A {
    public final String bField;

    public B(double field1and2, String bField) {
        super(field1and2, field1and2);
        this.bField = bField;
        System.out.println("The constructor of B has been called");

    }

    @Override
    public void method2() {
        System.out.println("Method 2 of b has been called");
    }

    public double field() {
        return super.field1;
    }
    
}
