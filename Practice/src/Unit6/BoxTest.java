package Unit6;

public class BoxTest {
  public static void main(String[] args) {
    // Box 객체 생성
    Box box0 = new Box(20, 20, 30);
    Box box1 = new Box(20, 20, 30);
    Box box2 = new Box(10, 10, 30);

    // 박스의 부피 비교
    Box.whoisLargeBox(box0, box1);
    Box.whoisLargeBox(box0, box2);
  }
}