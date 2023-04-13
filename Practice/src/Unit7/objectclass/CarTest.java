package Unit7.objectclass;

import Unit5.Box;

public class CarTest{
  public static void main(String[] args) {
    // Car car0 = new Car();
    
    // Class classVar = car0.getClass();
    // System.out.println(classVar); // 전체적인 클래스의 패키지 정보 클래스 명 등 정보를 얻어온다.
    // System.out.println(classVar.getName()); // package, 클래스 정보를 얻어 온다.
    
    // System.out.println("브랜드 : " + car0.brand + " , " + "모델 : " + car0.model);
    
    Car car1 = new Car("현대", "그랜져");
    Car car2 = new Car("토요타", "렉서스");

    // 사용자가 값을 잘못 입력해 객체가 생성되지 않은 경우
    Car car3 = null;
    // System.out.println(car3);
    // System.out.println(car2.equals(car3));

    // 비교할 수 없는 객체가 들어간 경우
    Box box0 = new Box(1,1,1);

    System.out.println(car1.equals(box0));

    // System.out.println("property : " + car1.equals(car2));
    // System.out.println("memory address : " + (car1 == car2));
  }
}