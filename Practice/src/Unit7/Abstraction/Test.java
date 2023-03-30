package Unit7.Abstraction;

public class Test {

  public static void main(String[] args) {
    
    Circle circle = new Circle();
    Rectangle rectangle = new Rectangle();
    Triangle triangle = new Triangle();

    circle.draw();
    circle.move(1, 2);
    rectangle.draw();
    triangle.draw();
  }
}
