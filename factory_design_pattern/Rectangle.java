public class Rectangle implements Shape{
  float width;
  float height;

  public float getWidth() {
    return width;
  }

  public float getHeight() {
    return height;
  }

  public void setWidth(float width) {
    this.width = width;
  }
  public void setHeight(float height) {
    this.height = height;
  }

  @Override
  public void draw() {
    System.out.println("Rectangle Drawn");
  }

  @Override
  public float area() {
    return width*height;
  }

  @Override
  public float perimeter() {
    return width+height;
  }

  @Override
  public String toString() {
    return "Rectangle : width = "+width+" height = "+height;
  }
}
