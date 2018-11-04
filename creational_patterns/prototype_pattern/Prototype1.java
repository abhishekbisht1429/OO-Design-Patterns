public class Prototype1 implements Prototype {
  public static final long PROTOTYPE_ID = 1; //uid generator can be used here
  int data;
  Prototype1() {
    System.out.println("Prototype1 object created using new operator");
    data = 32;
  }
  @Override
  public Object clone() throws CloneNotSupportedException {
      System.out.println("Prototype1 object created using cloning");
      return super.clone();
  }
}
