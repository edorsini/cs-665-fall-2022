package patterns.factory.abst;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = {new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
        return new Veggies[0];
    }

    @Override
    public Pepperoni createPepperroni() {
        return new SlicedPepperroni();
    }

    @Override
    public Clams createClam() {
        return new FreshClam();
    }
}
