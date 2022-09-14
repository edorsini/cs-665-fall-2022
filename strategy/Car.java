package patterns.strategy;

public class Car {
  String type;
  public Fast fastType;  // <----Composition / HAS-A

  public String goFast() {
    return fastType.goFast();
  }

  public void swapEngine(Fast newEngine) {
    this.fastType = newEngine;
  }
}
