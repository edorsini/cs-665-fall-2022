package patterns.factory.method;

// Design principles:
// Open Closed principle: classes, methods, or functions should be Open for extension and closed for modification.
//   The key benefit of this design principle is that already tried and tested code is not touched which means they
//   won’t break.

// Factory method allows you to vary the products you are creating...


public class Main {
    PizzaStore chicagoStore = new ChicagoStylePizzaStore();

    PizzaStore nyStore = new NYStylePizzaStore();

    public static void main(String[] args) {

        Main franchise = new Main();

        franchise.chicagoStore.orderPizza("cheese");

        franchise.nyStore.orderPizza("cheese");



    }


}
