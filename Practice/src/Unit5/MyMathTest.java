package Unit5;

public class MyMathTest {
  public static void main(String[] args) {
    int sum;  // 합계

    // 2 + 3 결과 출력
    sum = MyMath.add(2, 3);
    System.out.println("2와 3의 합은 " + sum);

    // 7 + 8 결과 출력
    sum = MyMath.add(7, 8);
    System.out.println("7과 8의 합은 " + sum);
  }
}
