package patterns.strategy;

// Design principles:
// Program for an interface not an implementation
// Favor composition over inheritance (HAS-A is better than IS-A)
//   More flexible, specifically at run-time.

public class Main {
  public static void main(String[] args) {

    Car mine = new Ferrari();
    Car other = new Honda();

    // Without the Strategy Pattern:
//    System.out.println("\nWithout the Strategy Pattern");
//    System.out.println("My car: " + goFastWithoutPattern(mine));
//    System.out.println("Someone else's car: " + goFastWithoutPattern(other));

//     With the Strategy Pattern:
    System.out.println("My car: " + mine.goFast());
    System.out.println("Someone else's car: " + other.goFast());

    other.swapEngine(new V12());
    System.out.println("Someone else's car after the engine swap: " + other.goFast());

  }

  public static String goFastWithoutPattern(Car car) {
    switch (car.type) {
      case "honda":
        return "This will go 4 cylinder fast....";
      case "ferrari":
        return "This will go V12 fast....";
    }
    throw new RuntimeException("Should be unreachable");
  }

}
