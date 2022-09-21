package patterns.factory.method;

public abstract class PizzaStore {
    abstract Pizza createPizza(String type); // This is the patterns.factory method!

    final Pizza orderPizza(String type) {
        System.out.println("ordering is the same for all pizza stores...");
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.cook();
        return pizza;
    }
}
