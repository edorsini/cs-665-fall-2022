package patterns.factory.abst;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = {new Eggplant(), new Spinach(), new BlackOlives()};
        return new Veggies[0];
    }

    @Override
    public Pepperoni createPepperroni() {
        return new SlicedPepperroni();
    }

    @Override
    public Clams createClam() {
        return new FrozenClam();
    }
}
