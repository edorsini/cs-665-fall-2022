package patterns.mediator;

import java.util.HashMap;
import java.util.Map;

public class Shop implements Mediator {

  Map<String, Driver> driverMap = new HashMap<>();


  public void registerDriver(Driver d) {
    if (!driverMap.containsKey(d.getDriverName())) {
      driverMap.put(d.getDriverName(), d);
    }
  }

  public void unregisterDriver(Driver d) {
    driverMap.remove(d.getDriverName(), d);
  }

  public void notifyObservers(String driverName, float offer) {
    for (Map.Entry<String, Driver> entry : driverMap.entrySet()) {
      // if not the same driver
      if (entry.getKey().equals(driverName)) {
        System.out.printf("[Broadcast to all drivers] ---------->  NEW OFFER for: $%.2f  \n",
            offer);
      } else {
        entry.getValue().setLastOffer(offer);
      }
    }
  }

}
