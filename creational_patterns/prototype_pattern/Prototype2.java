public class Prototype2 implements Prototype {
  public static final long PROTOTYPE_ID = 2;
  float data;
  Prototype2() {
    System.out.println("Prototype2 object created using new operator");
    data = 232f;
  }
  @Override
  public Object clone() throws CloneNotSupportedException {
    System.out.println("Prototype2 object created using cloning");
    return super.clone();
  }
}
