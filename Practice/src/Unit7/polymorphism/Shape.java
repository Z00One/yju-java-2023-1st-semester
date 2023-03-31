package Unit7.polymorphism;

public class Shape {
  private int x, y;

  public void draw() {
    System.out.println("Shape Draw [" + x + ", " + y + "]");
  }

  public void setX(int x) {
    this.x = x;
  }

  public void setY(int y) {
    this.y = y;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }
}
