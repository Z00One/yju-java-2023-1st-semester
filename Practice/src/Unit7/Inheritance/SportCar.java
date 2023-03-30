package Unit7.Inheritance;

public class SportCar extends Car {
  private boolean turbo = false;

  public boolean isTurbo() {
    return turbo;
  }

  public void setTurbo() {
    turbo = !turbo;
  }

  @Override
  public String toString() {
    return "speed[" + getSpeed() + "] " + "turbo[" + isTurbo() + "]";
  }
}
