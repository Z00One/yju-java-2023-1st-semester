package Unit5.source;

public class MyMathTest {
  public static void main(String[] args) {
    int sum;  // 합계
    int squreInt;
    Double squreDouble;

    // 2 + 3 결과 출력
    sum = MyMath.add(2, 3);
    System.out.println("2와 3의 합은 " + sum);

    // 7 + 8 결과 출력
    sum = MyMath.add(7, 8);
    System.out.println("7과 8의 합은 " + sum);
    
    // 10의 제곱 결과 출력
    squreInt = MyMath.squre(10);
    System.out.println("10의 제곱은 " + squreInt);

    // 3.14의 제곱 결과 출력
    squreDouble = MyMath.squre(3.14);
    System.out.println("3.14의 제곱은 " + squreDouble);
  }
}
