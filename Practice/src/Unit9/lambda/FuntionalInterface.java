package Unit9.lambda;

public class FuntionalInterface {

  // 함수형 인터페이스에만 람다식 사용
  // 일회용 쓰레드 같은 거 만들 때 사용
  @FunctionalInterface // 하나의 메서드만 가지는 함수형 인터페이스
  interface Math {
    public int Calc(int first, int second);
  }


  public static void main(String[] args) {

    // 추상 메서드를 바로 구현해버릴 수 있음
    Math plusLambda = (first, second) -> first + second;
    System.out.println(plusLambda.Calc(4, 2));

    Math minusLambda = (first, second) -> first - second;
    System.out.println(minusLambda.Calc(4, 2));
  }
}