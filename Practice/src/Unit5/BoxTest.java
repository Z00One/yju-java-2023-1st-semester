package Unit5;

public class BoxTest {
  public static void main(String[] args) {
    // Box 객체 생성
    Box box0 = new Box(20, 20, 30);

    // 박스의 부피 가져오기
    int boxVolume = box0.getVolume();

    // 출력
    System.out.println("상자의 부피는 " + boxVolume + " 입니다.");
  }
}