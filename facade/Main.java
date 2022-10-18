package patterns.facade;

public class Main {
  public static void main(String[] args) {
    FacadeClass carFacade = new FacadeClass();

    System.out.println(carFacade.startCar());

  }
}
