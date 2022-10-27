package patterns.composite.eg1;

public class Lambo implements Car {

  @Override
  public void print() {

    System.out.println(".____                  ___.           \n" +
        "|    |   _____    _____\\_ |__   ____  \n" +
        "|    |   \\__  \\  /     \\| __ \\ /  _ \\ \n" +
        "|    |___ / __ \\|  Y Y  \\ \\_\\ (  <_> )\n" +
        "|_______ (____  /__|_|  /___  /\\____/ \n" +
        "        \\/    \\/      \\/    \\/        ");

  }

}
