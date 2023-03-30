package Unit7.Inheritance;

public class SportCarTest {
  public static void main(String[] args) {
    SportCar sc = new SportCar();

    sc.setSpeed(150);
    sc.setTurbo();

    System.out.println(sc);
  }
}