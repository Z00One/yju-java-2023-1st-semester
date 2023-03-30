package Unit6;

public class MyClassTest {
  public static void main(String[] args) {
    
    // 클래스를 처음 호출할 때 정적 블록 실행됨
    System.out.println(MyClass.x);
    // 이후에 정적 블록은 호출되지 않음
    System.out.println(MyClass.x);
  }
}
