package patterns.decorator;

public class Sunroof extends FeatureDecorator {
  // IS-AND and HAS A RELATIONSHIP....

  public Sunroof(Car car) {
    this.car = car;
  }

  public double getCost() {
    return 2000 + car.getCost();
  }

  public String getDescription() {
    return car.getDescription() + ", " + "includes sunroof";
  }

}
