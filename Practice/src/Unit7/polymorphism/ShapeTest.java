package Unit7.polymorphism;

public class ShapeTest {
  public static void main(String[] args) {
    Shape s1, s2, s3, s4, s5;
    Shape[] shapes = new Shape[5];

    s1 = new Shape();
    shapes[0] = s1;
    
    s2 = new Rectangle();
    shapes[1] = s2;
    
    s3 = new Triangle();
    shapes[2] = s3;
    
    s4 = new Circle();
    shapes[3] = s4;

    s5 = new Polygon();
    shapes[4] = s5;

    drawShapes(shapes);
  }

  public static void drawShapes(Shape[] shapes) {
    for (Shape s : shapes) {
      s.draw();
    }
  }
}
