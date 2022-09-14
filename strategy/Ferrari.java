package patterns.strategy;

public class Ferrari extends Car {

  public Ferrari() {
    this.type = "ferrari";
    fastType = new V12(); // HAS-A relationship
  }
}
