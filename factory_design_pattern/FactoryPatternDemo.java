class FactoryPatternDemo {
  public static void main(String[] args) {
    Shape circle = ShapeFactory.createShape(Shape.CIRCLE);
    Shape rectangle = ShapeFactory.createShape(Shape.RECTANGLE);
    ((Circle)circle).setRadius(4.0f);
    ((Rectangle)rectangle).setWidth(2.0f);
    ((Rectangle)rectangle).setHeight(4.0f);

    System.out.println(circle);
    System.out.println(rectangle);
  }
}
