package patterns.factory.method;

public class NYCheesePizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("prepares NY Cheese Pizza...");
    }

    @Override
    public void cook() {
        System.out.println("cooks NY Cheese Pizza...");
    }
}
