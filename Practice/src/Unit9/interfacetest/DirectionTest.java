package Unit9.interfacetest;

public class DirectionTest implements Direction {
  public static void main(String[] args) {
    System.out.println(Direction.EAST);
    System.out.println(Direction.NORTH);

    // 인터페이스 구현 후에 해당 클래스 상수에 바로 접근 가능
    System.out.println(EAST);
  }
}
