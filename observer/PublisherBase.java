package patterns.observer;

public interface PublisherBase {

  void subscribe(SubscriberBase o);

  void unsubscribe(SubscriberBase o);

  void notifySubscribers();

}
