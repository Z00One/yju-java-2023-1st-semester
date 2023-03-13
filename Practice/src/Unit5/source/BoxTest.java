package Unit5.source;

public class BoxTest {
  public static void main(String[] args) {
    // Box 객체 생성
    Box box0 = new Box();

    // 객체의 맴버 설정
    box0.setBoxInfo(20, 20, 30);

    // 객체의 맴버 출력
    box0.printBoxInfo();
  }
}