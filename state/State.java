package patterns.state;

// The patterns.state pattern allows an object to alter its behavior when its internal patterns.state changes.
// The object will appear to change its class.

public interface State {
  void startWorkingOn();

  void stopWorkingOn();

  void finishWorkingOn();
}
