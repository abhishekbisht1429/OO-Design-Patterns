public class Truck extends Vehicle {
  public static final int ID = 0x00000002;
  Truck(SteeringSystem steeringSys) {
    super(steeringSys);
  }

  void steerLeft() {
    getSteeringSystem().steerLeft();
  }
  void steerRight() {
    getSteeringSystem().steerRight();
  }
}
