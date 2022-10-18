package patterns.adapter;

/**
 * This is the Adapter
 * It follows the signature that we are used to using: charge(), but maps it to the adaptee
 * and handles it
 */
public class UsbToCigaretteLighterAdapter implements UsbCharger {

  private CigaretteLighterCharger carCigaretteLighter;

  public UsbToCigaretteLighterAdapter(CigaretteLighterCharger carCigaretteLighter) {
    this.carCigaretteLighter = carCigaretteLighter;
  }

  // This is where the magic happens.  We are re-wiring the charge() to invoke the
  // chargeViaCartLighter() in the adaptee.
  @Override
  public void charge() {
    carCigaretteLighter.chargeViaCarLighter();
  }
}
