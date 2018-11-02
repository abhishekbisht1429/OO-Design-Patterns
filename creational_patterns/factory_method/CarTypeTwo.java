class CarTypeTwo implements Car {
  @Override
  public void accelerate() {
    System.out.println("CarTypeTwo accelerating");
  }

  @Override
  public void brake() {
    System.out.println("CarTypeTwo brake applied");
  }
}
