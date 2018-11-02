public class TypeOneCarFactory implements CarFactory {
  @Override
  public Car createCar() {
    return new CarTypeOne();
  }
}
