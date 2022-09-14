
package patterns.observer;

public class Ferrari implements SubscriberBase {

  private String name;

  private Dealer dealer;

  private String latestFerrariUpdate;

  public Ferrari(String name, Dealer dealer) {
    this.name = name;
    this.dealer = dealer;
    this.latestFerrariUpdate = "";
    this.dealer.subscribe(this);
  }

  public void updateSelf(String latestUpdate) {
    this.latestFerrariUpdate = latestUpdate;

    System.out.println("The latest over-the-air update was delivered to " + this.getName() + ": " +
        getMyLatestUpdate());

  }

  public String getName() {
    return this.name;
  }

  public String getMyLatestUpdate() {
    return this.latestFerrariUpdate;
  }

}
