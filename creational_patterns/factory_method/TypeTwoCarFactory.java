public class TypeTwoCarFactory implements CarFactory {
  @Override
  public Car createCar() {
    return new CarTypeTwo();
  }
}
