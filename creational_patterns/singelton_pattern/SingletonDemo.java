class Singleton {
  private int data;
  /** This static variable will hold the reference to the only Object of this class
  */
  private static Singleton singleton;

  /** The constructor is declared private so that mulitple instance of this
    * class may not be created
  */
  private Singleton() {
    //default constructor
  }
  public static Singleton getInstance() {
    if(singleton == null) {
      singleton = new Singleton();
    }
    return singleton;
  }
  public int getData() {
    return data;
  }
  public void setData(int data) {
    this.data = data;
  }
}

class SingletonDemo {
  public static void main(String[] args) {
    //The line below will give an error if it is uncommented
    //Singleton instance = new Singleton();

    Singleton instance1 = Singleton.getInstance();
    System.out.println("instance1.getData() "+instance1.getData());// 0 - default value
    instance1.setData(34);
    System.out.println("instance1.getData() "+instance1.getData()); // 34

    /* here refence to the object referred by instance1 will be returned
       and stored in instance2
    */
    Singleton instance2 = Singleton.getInstance();
    System.out.println("instance2.getData() "+instance2.getData()); // 34
    instance2.setData(45);
    System.out.println("instance2.getData() "+instance2.getData()); // 45

    instance1.setData(56);
    System.out.println("instance2.getData() "+instance2.getData());// 56
  }
}
