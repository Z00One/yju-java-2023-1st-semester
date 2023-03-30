package Unit5;

import Unit7.Inheritance.Car;;

public class sportCar extends Car {
  
  public static void main(String[] args) {
    sportCar sc = new sportCar();

    System.out.println(sc.isParent());
    System.out.println(sc.getSpeed());
  }
}