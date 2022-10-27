package patterns.mediator;

public interface Mediator {

  void registerDriver(Driver d);

  void unregisterDriver(Driver d);

  void notifyObservers(String driverName, float offer);

}
