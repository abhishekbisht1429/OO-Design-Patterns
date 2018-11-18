public class Main {
  public static void main(String[] args) {
    Car car = (Car)VehicleFactory.getVehicle(Car.ID);
    Truck truck = (Truck)VehicleFactory.getVehicle(Truck.ID);

    car.steerLeft();
    car.steerRight();

    truck.steerLeft();
    truck.steerRight();
  }
}
