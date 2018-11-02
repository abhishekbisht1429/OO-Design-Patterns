class Main {
  public static void main(String[] args) {
    Car myCar1,myCar2;
    myCar1 = new TypeOneCarFactory()
                  .createCar();
    myCar2 = new TypeTwoCarFactory()
                  .createCar();

    myCar1.accelerate();
    myCar2.accelerate();
    myCar1.brake();
    myCar2.brake();
  }
}
