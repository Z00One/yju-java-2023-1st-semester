package Unit7.Inheritance;

public class Derived extends Base {
  // 기본 생성자
  public Derived() {
    System.out.println("Derived() 생성자 호출됨");
  }

  // 생성자 오버로딩
  public Derived(String arg) {
    System.out.println("Derived(String arg) 생성자 호출됨");
  }
}
