package Unit7.objectclass;

public class Car {
  String brand;
  String model;

  public String getBrand() {
    return this.brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public String getModel() {
    return this.model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public Car(String brand, String model) {
    this.brand = brand;
    this.model = model;
  }

  public Car() {
    // 다른 생성자 사용
    this("unknown", "unknown");
  }

  @Override
  // 객체의 맴버와 입력되는 객체의 맴버 비교
  public boolean equals(Object anotherCar) {
    // 객체가 생성되지 않은 변수가 들어온 경우
    if (anotherCar == null){
      System.out.println("객체를 생성한 변수를 입력하세요");
      return false;
    }

    // Car 의 instance인지 확인
    boolean isNotInstanceOfCar = !(anotherCar instanceof Car);

    if (isNotInstanceOfCar) {
      System.out.println("Car 클래스의 객체를 입력하세요");
      return false;
    }
    
    // 인자값으로 전달된 객체의 맴버 가져오기
    Car argCar = (Car)anotherCar;

    // 브랜드
    boolean equalsBrand = brand == argCar.getBrand();

    // 모델
    boolean equalsModel = model == argCar.getModel();

    // 브랜드, 모델
    boolean isequals = equalsBrand && equalsModel;

    return isequals;
  }
}