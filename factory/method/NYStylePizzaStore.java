package patterns.factory.method;

public class NYStylePizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        System.out.print("creates pizza NY style \n");

        if (type.equals("cheese")) {
            return new NYCheesePizza();
        } else return null;

    }
}
