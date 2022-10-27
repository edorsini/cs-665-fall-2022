package patterns.composite.eg1;

import java.util.ArrayList;
import java.util.List;

public class MyCars implements Car {

  private List<Car> childCars = new ArrayList<>();


  @Override
  public void print() {


    // enhanced for loop
    for (Car car : childCars) {
      car.print();
    }

//    for(int i=0; i < childCars.size(); i++) {
//      childCars.get(i).print();
//    }
  }

  public void add(Car vehicle) {
    childCars.add(vehicle);
  }

  public void remove(Car vehicle) {
    childCars.remove(vehicle);
  }

}
