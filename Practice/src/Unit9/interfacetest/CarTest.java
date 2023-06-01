package Unit9.interfacetest;

public class CarTest {
  public static void main(String[] args) {
    Car c1 = new Car("bmw", "x6", 1000, 0);
    Car c2 = new Car("bmw", "x100", 9000, 0);
    Car c3 = new Car();

    System.out.println(c3);

    whichMoreExpensive(c1, c2);
  }

  public static void whichMoreExpensive(Comparable carA, Comparable carB) {
    switch(carA.compareTo(carB)) {
      case 0: System.out.println("같은 가격이에요"); break;
      
      case 1: System.out.println("첫번째 차가 더 비싸요"); break;
      
      case -1: System.out.println("두번째 차가 더 비싸요"); break;
    }
  }
}