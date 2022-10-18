package patterns.decorator;

public class Main {
    public static void main(String[] args) {
        Car sportyCar = new HondaAccord();
        System.out.println(sportyCar.getDescription() + ", " + sportyCar.getCost());

        sportyCar = new Sunroof(sportyCar);
        System.out.println(sportyCar.getDescription() + ", " + sportyCar.getCost());

        sportyCar = new Leather(sportyCar);
        System.out.println(sportyCar.getDescription() + ", " + sportyCar.getCost());

        sportyCar = new Foglight(sportyCar);
        System.out.println(sportyCar.getDescription() + ", " + sportyCar.getCost());
    }
}
