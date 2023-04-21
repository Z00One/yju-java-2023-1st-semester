package 연습;

public interface Comparable extends Interface{
  public final String key = "Comparable key";
  // 기본적으로 인터페이스는 추상 메서드만 존재한다?.
  // 하지만 JDK 8 이후에는 추상 메서드 이외에도
  // 메소드 바디를 가지는 디폴트 메서드도 정의할 수 있다.
  // 인터페이스의 모든 메서드는 기본적으로 public 이다.
  // 왜냐하면 어느 클래스와도 상호작용할 수 있는 접점이기 때문이다.
  // 접근제어자 없이 생성해도 default가 아닌 public 이다.
  // abstract 키워드가 없어도 자동으로 추상메서드로 만들어짐.

  abstract int CompareTo(Comparable obj, String key);
}