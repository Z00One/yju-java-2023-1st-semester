package Unit7.interfacetest;

public class Car implements Comparable {
  private String brand;
  private String model;
  private int speed = 0;
  private int price;

  public Car(String brand, String model, int price){
    this.brand = brand;
    this.model = model;
    this.price = price;
  }
  
  public Car() {
    this("unknown", "unknown", 0);
  }

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

  public int getSpeed() {
    return this.speed;
  }

  public void plusSpeed() {
    this.speed++;
  }

  public void minusSpeed() {
    this.speed--;
  }

  public int getPrice() {
    return this.price;
  }

  public void setPrice(int price) {
    this.price = price;
  }
  
  @Override
  public int compareTo(Comparable obj){
    int returnValue = 0;

    Car anotheCar = (Car)obj;

    if (price == anotheCar.getPrice()) {
      returnValue = 0;
    }

    if (price > anotheCar.getPrice()) {
      returnValue = 1;
    }

    if (price < anotheCar.getPrice()) {
      returnValue = -1;
    }

    return returnValue;
  };

  @Override
  public String toString() {
    return "[ 브랜드 :" + this.brand + ", 모델 :" + this.model + ", 가격 :" + this.price +  "]";
  }
}
