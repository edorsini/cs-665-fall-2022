package patterns.factory.abst;

// Design principles:
// Open Closed principle: classes, methods, or functions should be Open for extension and closed for modification.
//   The key benefit of this design principle is that already tried and tested code is not touched which means they
//   won’t break.


public class Main {


    public static void main(String[] args) {
        Pizza myPizza = null;
        PizzaStore nyPizzaStore = new NYPizzaStore();
        myPizza = nyPizzaStore.orderPizza("cheese");
        System.out.println(myPizza);
    }


}
