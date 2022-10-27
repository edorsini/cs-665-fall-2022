package patterns.iterator;

public class Main {
  public static void main(String[] args) {
    /* Iterator Pattern */

    // provides a way to access the elements of an aggregate object sequentially without exposing its
    // underlying representation

    FancyCars rockStarCars = new FancyCars();
    EconomyCars averageCars = new EconomyCars();

    Iterator fancyCarIterator = rockStarCars.createIterator();
    Iterator averageCarIterator = averageCars.createIterator();

    System.out.println("------------- fancy cars without patterns.iterator");
    printFancyCars(rockStarCars);

    System.out.println("------------- average cars without patterns.iterator");
    printAverageCars(averageCars);

    System.out.println("------------- fancy cars ");
    printCars(fancyCarIterator);

    System.out.println("------------- average cars ");
    printCars(averageCarIterator);

  }

  private static void printFancyCars(FancyCars list) {
    for (int i = 0; i < list.cars.length; i++) {
      System.out.println(list.cars[i]);
    }
  }

  private static void printAverageCars(EconomyCars list) {
    for (int i = 0; i < list.cars.size(); i++) {
      System.out.println(list.cars.get(i));
    }
  }

  private static void printCars(Iterator iterator) {
    while (iterator.hasNext()) {
      String car = (String) iterator.next();
      System.out.println(car);
    }
  }
}
