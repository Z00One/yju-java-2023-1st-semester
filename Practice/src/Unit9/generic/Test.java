package Unit9.generic;

public class Test {
  public static void main(String[] args) {
    // IntBox ib1 = new IntBox();
    // ib1.setValue(10);

    // System.out.println(ib1.getValue());

    // IntBox ib2 = new IntBox();
    // ib2.setValue(20);

    // int result = ib1.getValue() + ib2.getValue();

    // System.out.println(result);

    StrBox sb1 = new StrBox();
    sb1.setValue("abc ");

    StrBox sb2 = new StrBox();
    sb2.setValue("def");

    String result = sb1.getValue() + sb2.getValue();
    // System.out.println(result);
    
    int idx1 = result.indexOf(sb1.getValue());
    int idx2 = result.indexOf(sb2.getValue());  // 인자값에 해당하는 인덱스를 지정해준다.!!!!!!!!!!!!!!!!!

    System.out.println(result.substring(idx2)); // 인자값으로 들어온 인덱스 부터 서브스트링으로 추출함
    
    // ############## 타입캐스팅을 사용하면 다양한 타입을 사용할 수 있지만 실수가 생길 수 있다.
    // Box b1 = new Box();
    // b1.setValue(20);

    // Box b2 = new Box();
    // b2.setValue(30);

    // // int result = b1.getValue() + b2.getValue(); // int 형의 값은 Integer 형으로 박싱되어 메서드를 사용할 수 있음
    // int result = (int)b1.getValue() + (int)b2.getValue();

    Box strBox = new Box();
    strBox.setValue("마르고 달도록 하느님이 보우하사 우리 나라만세");
    Object v = strBox.getValue();

    // int idx = ((String)strBox.getValue()).indexOf("우리나라"); // 타입 캐스팅 해준다면 사용가능
    int idx = ((String)v).indexOf("우리 나라만세"); // 인자값에 해당하는 인덱스를 지정해준다.
    System.out.println(((String)v).substring(idx));

    int val = (int)strBox.getValue(); // 타입 캐스팅을 잘못하면 프로그램이 죽을 수도 있다.
    System.out.println(val);

    /* 문제점
     * 1. 타입캐스팅을 잘못하면 프로그램이 죽을 수 있다.
     * 2. 타입캐스팅을 하기 위해선 어떤 타입으로 캐스팅해야 하는지 알아야 한다.
     * 3. 값을 쓸 때 명시적 타입캐스팅을 해줘야 한다. 귀찮다.
     */

    // ############## 타입캐스팅 하는 과정이 잘못되면 프로그램이 죽을 수도 있는데 이 문제를 해결하기 위해 제네릭을 사용한다.
    // 컴파일 타임에는 에러가 나지 않는다!! 컴파일 타임에 잡아주려고 제네릭 사용?
    // 타입캐스팅을 명시적으로 하여 실수가 생길 수 있는데 타입캐스팅의 과정을 제네릭으로 대체 가능?
  }
}
