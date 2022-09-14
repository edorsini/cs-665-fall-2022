package patterns.strategy;

public class Honda extends Car {

  public Honda() {

    this.type = "honda";
    fastType = new FourCylinder();
  }
}
