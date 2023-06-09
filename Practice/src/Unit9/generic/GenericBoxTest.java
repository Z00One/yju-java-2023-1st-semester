package Unit9.generic;

public class GenericBoxTest {
  public static void main(String[] args) {
    GenericBox<String> sb1 = new GenericBox<String>();
    sb1.setValue("abc ");
    String val = sb1.getValue();
    // sb1.setValue(123); // 타입이 맞지 않기 때문에 컴파일 타임에 에러가 난다.
    System.out.println("박스에 저장된 값은 [+val+] 입니다"); // 명시적인 타입캐스팅 없이 사용 가능

    GenericBox<Integer> sb2 = new GenericBox<>(); // 타입 파라미터에 Integer를 넣어줌 (생략 가능)
    sb2.setValue(123);
    System.out.println(sb2.getValue());

    // 왼쪽에 제네릭 클래스의 적용할 타입이 명시되어 있기 때문에
    // 오른쪽에 생성자 부분에 타입 생략이 가능하다.
  }
}
