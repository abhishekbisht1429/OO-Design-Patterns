public class Circle implements Shape {
  private static final float PI = 3.14f;
  float radius;

  public float getRadius() {
    return radius;
  }

  public void setRadius(float radius) {
    this.radius = radius;
  }

  @Override
  public void draw() {
    System.out.println("Circle Drawn");
  }

  @Override
  public float area() {
    return PI*radius*radius;
  }

  @Override
  public float perimeter() {
    return 2*PI*radius;
  }

  @Override
  public String toString() {
    return "Circle : radius = "+radius;
  }
}
