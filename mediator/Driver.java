package patterns.mediator;

class Driver {

  private String driverName;
  private float lastOffer;

  public Driver(String name) {
    setDriverName(name);
  }

  public String getDriverName() {
    return driverName;
  }

  public void setDriverName(String name) {
    this.driverName = name;
  }

  public void setMyOffer(Shop mediator, float offer) {

    System.out.printf("Current offer is: $%.2f  " +
        this.driverName + "'s new offer is: $%.2f \n", this.getLastOffer(), offer);

    // inform all drives about my Offer.
    mediator.notifyObservers(this.driverName, offer);
  }

  public float getLastOffer() {
    return this.lastOffer;
  }

  public void setLastOffer(float lastOffer) {
    this.lastOffer = lastOffer;
  }

}