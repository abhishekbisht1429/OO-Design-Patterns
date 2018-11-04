public class Main {
  public static void main(String[] args) throws CloneNotSupportedException  {
    Prototype1 proto1 = (Prototype1)ObjectCreator.createObject(Prototype1.PROTOTYPE_ID);
    System.out.println(proto1);
    System.out.println();
    Prototype2 proto2 = (Prototype2)ObjectCreator.createObject(Prototype2.PROTOTYPE_ID);
    System.out.println(proto2);
  }
}
