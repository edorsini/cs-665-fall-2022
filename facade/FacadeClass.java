package patterns.facade;

public class FacadeClass {

  private Battery battery;

  private Starter starter;

  public FacadeClass() {
    this.battery = new Battery();

    this.starter = new Starter();
  }

  protected String startCar() {
    return this.battery.supplyElectricPower() + this.starter.turnTheEngine();
  }
}
