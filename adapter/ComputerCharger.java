package patterns.adapter;

public class ComputerCharger implements UsbCharger {
  @Override
  public void charge() {
    System.out.println("My phone is now charging via my computer...");
  }
}
