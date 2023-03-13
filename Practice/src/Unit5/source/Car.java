package Unit5.source;

public class Car {
  private int SPEED_LIMIT = 10; // 기어 1단 - 10, 2단 - 20 ... n단 - 10n
  private int MAX_SPEED = 80;   // 최고 속도

  private String color;     // 색상
  private int speed;        // 속도
  private int gear = 1;     // 기어

  // 색 설정
  void setColor(String colorArg) {
    this.color = colorArg;
  };

  // 가속
  void speedUp() {
    speed++;

    // 기어 변속 하지 않고 버틸 수 있는 최대속도
    int maximumSpeed = gear * SPEED_LIMIT;

    // 기어 변경
    if (speed == maximumSpeed) {
      this.gear++;
      System.out.println("기어 변경 " + gear);
    }

    // 최고속도
    if (speed == MAX_SPEED) {
      System.out.println("최고 속도에요");
    }
  };

  // 감속
  void speedDown() {
    // 속도가 0인 경우
    if (speed == 0) {
      System.out.println("정지");
    }

    speed--;

    // 기어 변속 하지 않고 버틸 수 있는 최소속도
    int minimumSpeed = gear * SPEED_LIMIT;

    // 기어 변경
    if (speed == minimumSpeed) {
      this.gear--;
      System.out.println("기어 변경 " + gear);
    }
  };

  // toString 을 오버라이딩하여 해당 클래스의 맴버에 접근
  @Override
  public String toString() {
    return String.format("Car [color= %s, speed= %d, gear= %d]",
    color, speed, gear);
  };
}
