public abstract class Vehicle {
  SteeringSystem steerSys;
  Vehicle(SteeringSystem steerSys) {
    this.steerSys = steerSys;
  }
  abstract void steerLeft();
  abstract void steerRight();

  SteeringSystem getSteeringSystem() {
    return steerSys;
  }
}
