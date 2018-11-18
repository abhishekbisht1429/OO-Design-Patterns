public class Car extends Vehicle {
  public static final int ID = 0x00000001;
  Car(SteeringSystem steeringSys) {
    super(steeringSys);
  }

  void steerLeft() {
    getSteeringSystem().steerLeft();
  }
  void steerRight() {
    getSteeringSystem().steerRight();
  }
}
