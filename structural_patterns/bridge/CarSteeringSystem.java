public class CarSteeringSystem implements SteeringSystem {
  @Override
  public void steerLeft() {
    System.out.println("Car steering left");
  }

  @Override
  public void steerRight() {
    System.out.println("Car steering Right");
  }
}
