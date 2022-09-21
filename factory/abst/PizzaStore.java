package patterns.factory.abst;

public abstract class PizzaStore {

    abstract Pizza createPizza(String type);

    Pizza orderPizza(String type) {
        System.out.println("ordering is the same for all pizza stores...");
        Pizza pizza = createPizza(type);
        pizza.prepare();
        return pizza;
    }
}
