package patterns.observer;

import java.util.ArrayList;

public class Dealer implements PublisherBase {

  private String name;

  private String latestFerrariUpdate;

  private ArrayList<SubscriberBase> ferrariList = new ArrayList<SubscriberBase>();

  public Dealer(String name) {
    this.name = name;
    this.setLatestFerrariUpdate("Apple integration update 101.");
  }

  String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setLatestFerrariUpdate(String latestFerrariUpdate) {
    this.latestFerrariUpdate = latestFerrariUpdate;
    this.notifySubscribers();
  }

  public String getLatestFerrariUpdate() {
    return this.latestFerrariUpdate;
  }

  /*
   *  Add subscriber to the Arraylist of subscribers
   */
  public void subscribe(SubscriberBase o) {
    ferrariList.add(o);
  }

  /*
   * Remove subscriber to the Arraylist of subscribers
   */
  public void unsubscribe(SubscriberBase o) {
    ferrariList.remove(o);
  }

  /*
   * Call the update() on each subscriber when the data changes
   */
  public void notifySubscribers() {
    for (SubscriberBase o : ferrariList) {
      o.updateSelf(this.latestFerrariUpdate);
    }
  }


}
