package Unit7;

class A {
	int x = 3;
	int y = 3;
	static void a(){
		System.out.println('a');
	}
	void prtX() {
		System.out.println(x);
	}
}

class B extends A {
	int x = 4;
  // int y = 1;
	void prtY() {
		System.out.println(y);
	}

  int prtY(int x) {
    // System.out.println();
    return 1;
  }
}

public class Polymorphism {
public static void main(String[] args) {
  B bar = new B();
  bar.prtY(); // 현재 자료형의 클래스를 참조. 없으면 부모의 클래스에 멤버가 있는지 확인. 있으면 해당 맴버를 사용함
	bar.a();
}
  
}