package patterns.factory.method;

public class ChicagoStylePizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        System.out.print("creates pizza Chicago style \n");
        if (type.equals("cheese")) {
            return new ChicagoCheesePizza();
        } else return null;
    }

}
