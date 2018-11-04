import java.util.Map;
import java.util.HashMap;
public class ObjectCreator {
  static Map<Long,Prototype> prototypeMap = new HashMap<>();
  static {
    System.out.println("************** Hard coded Prototype Database is intitializing ***********");
    prototypeMap.put(Prototype1.PROTOTYPE_ID,new Prototype1());
    prototypeMap.put(Prototype2.PROTOTYPE_ID,new Prototype2());
    System.out.println("************** Hard coded Prototype Database initialized      **********\n");
  }

  public static Object createObject(long prototypeId) throws CloneNotSupportedException {
    Object obj = prototypeMap.get(prototypeId).clone();
    return obj;
  }
}
