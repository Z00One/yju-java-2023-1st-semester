package Unit9.lambda;

public class AddTest {

  public static void main(String[] a) {
    int result = sum(100, 21, 323, ((n1, n2) -> {
      return n1 + n2;
    }));
    System.out.println(result);
  }

  public static int sum(int n1, int n2, int n3, Add add) {
    int result = add.add(n1, n2);
    result = add.add(n3, result);
    return result;
  }
}

interface Add {
  public int add(int n1, int n2);
}