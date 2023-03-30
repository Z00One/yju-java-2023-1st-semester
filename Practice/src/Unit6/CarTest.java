package Unit6;

public class CarTest {
  public static void main(String[] args) {
    // 객체 생성
    Car car0 = new Car();

    // 색상 설정
    

    // 증속
    for (int i = 0; i < 80; i+=5) {
      car0.speedUp();
    }

    // 차의 상태 출력
    System.out.println(car0);

    // 감속
    for (int i = 0; i < 100; i+=5) {
      car0.speedDown();
    }
  }
}
