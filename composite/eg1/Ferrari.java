package patterns.composite.eg1;

public class Ferrari implements Car {

  @Override
  public void print() {

    System.out.println("___________                              .__ \n" +
        "\\_   _____/______________________ _______|__|\n" +
        " |    __)/ __ \\_  __ \\_  __ \\__  \\\\_  __ \\  |\n" +
        " |     \\\\  ___/|  | \\/|  | \\// __ \\|  | \\/  |\n" +
        " \\___  / \\___  >__|   |__|  (____  /__|  |__|\n" +
        "     \\/      \\/                  \\/          ");

  }

}
