public class ShapeFactory {
  /*Note : In Factory Pattern do not pass parameters for the type of object
           being created to the static function.
  */
  public static Shape createShape(int type) {
    Shape shape;
    switch(type) {
      case Shape.RECTANGLE : {
        shape = new Rectangle();
        break;
      }

      case Shape.CIRCLE : {
        shape = new Circle();
        break;
      }

      default : {
        shape = null;
      }
    }

    return shape;
  }
}
