package Unit5;

// 맴버를 사용하지 않는 메서드 -> 클래스 메서드로 만들어 주기
public class MyMath {

  // 입력된 정수 값을 더해주는 메서드
  static int add(int argX, int argY) {
    return argX + argY;
  }

  // 입력한 값의 제곱을 반환해주는 메서드 - 오버로딩
  // 정수 값을 제곱하는 메서드
  static int squre(int argInt) {
    return argInt * argInt;
  }

  // 실수 값을 제곱하는 메서드
  static double squre(double argDouble) {
    return argDouble * argDouble;
  }
}