package Unit7.Inheritance;

public class Car {
  private int speed;

  protected boolean isParent() {
    return true;
  }

  protected int getSpeed() {
    return speed;
  }

  public void setSpeed(int speed) {
    this.speed = speed;
  }
}