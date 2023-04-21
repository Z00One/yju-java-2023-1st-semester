package Unit7.staticoverriding;

public class Test {

  public static void main(String[] args) {
    Animal animal = new Cat();
    animal.sound(); // 오버라이딩
    animal.eat(); // 재정의 - 정적 메서드는 오버라이딩 안된다.
    
    animal = new Animal();
    animal.sound();
    animal.eat();
  }
}
