public class VehicleFactory {
  public static Vehicle getVehicle(int id) {
    switch(id) {
      case Car.ID : {
        return new Car(new CarSteeringSystem());
      }
      case Truck.ID : {
        return new Truck(new TruckSteeringSystem());
      }
      default : {
        return null;
      }
    }
  }
}
