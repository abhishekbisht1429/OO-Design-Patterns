class CarTypeOne implements Car {
  @Override
  public void accelerate() {
    System.out.println("CarTypeOne accelerating");
  }

  @Override
  public void brake() {
    System.out.println("CarTypeOne brake applied");
  }
}
