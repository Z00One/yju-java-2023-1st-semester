package 연습;
class A {
  int x = 3;
  int y = 5;
  void prtX() {
    System.out.println(x);
  }
}

class B extends A {
  int x = 4;
  void prtY() {
    System.out.println(y);
  }
}

public class Overloading {
  int OverloadingMethod(int argA, int argB) {
    return argA + argB;
  };

  long OverloadingMethod(int argA, String argB) {
    return (long)argA;
  }
 
  public static void main() {
    A bar = new B();
    bar.prtX();
    ((B)bar).prtY();
  }
}
