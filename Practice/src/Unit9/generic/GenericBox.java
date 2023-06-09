package Unit9.generic;

/* 클래스 내부에서 사용할 데이터 타입을 미리 정해 놓지 않겠다.
 * 사용자가 이 클래스의 객체를 생성할 때 데이터 타입을 결정하겠다.
 * 즉 사용할 데이터 타입을 파라미터로 받겠다. => 타입 파라미터(Type Parameter)
 * 타입 파라미터는 대문자 한글자로 표현하는 것이 관례이다. 보통 T를 사용한다.
 */

public class GenericBox<T> {
  T value;

  public T getValue() {
    return value;
  }

  public void setValue(T value) {
    this.value = value;
  }
}

  
