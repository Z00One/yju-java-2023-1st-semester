package Unit9.generic;

public class GenericTest2 {
  private static final String RED = null;

  public static void main(String[] args) {
    // GenericPair 클래스 객체 2개 생성해서 값을 넣고 빼보기
    GenericPair<String, Integer> gp1 = new GenericPair<String, Integer>("홍길동", 20);

    String name = gp1.getKey();
    int age = gp1.getValue();

    System.out.println("이름: " + name + ", 나이: " + age);
    int red = Rainbow.RED.Rainbow(3);
    System.out.println(red);
  }
}
