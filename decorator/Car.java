package patterns.decorator;

public abstract class Car {

  String description = "car";

  public String getDescription() {
    return description;
  }

  public abstract double getCost();
}
