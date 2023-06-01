package Unit9.interfacetest;

import Unit7.polymorphism.Util;

public class Test {
  public static void main(String[] args) {
    // String s1 = "BBC";
    // String s2 = "BBC";
    // System.out.println(s1.compareTo(s2));
    // Student std1 = new Student("일지매", "컴정");
    // Student std2 = new Student("홍길동", "컴정");
    // findLarger(std1, std2);

    // Car c1 = new Car("HyunDai", "Granduer", 250, 5000);
    // Car c2 = new Car("GM", "Impala", 300, 4000);
    // Car c3 = new Car();
    // System.out.println(c3); // [브랜드:Unknown, 모델:Unknown, speed:0, price:0]

    // findLarger(c1, c2);
    // Student[] stds = new Student[5];
    // Student std1 = new Student("일지매", "컴정");
    // stds[0] = std1;
    // Student std2 = new Student("홍길동", "컴정");
    // stds[1] = std2;
    // Student std3 = new Student("김일곤", "컴정");
    // stds[2] = std3;
    // Student std4 = new Student("박수헌", "컴정");
    // stds[3] = std4;
    // Student std5 = new Student("안영진", "컴정");
    // stds[4] = std5;

    // // polymorphism.Util.selectionSort(stds);
    // Util.selectionSort(stds);

    // for (Student std : stds) {
    //   System.out.println(std.getName());
    // }

    Car[] cars = new Car[5];
    Car c1 = new Car("HyunDai", "Grandeur", 250, 5000);
    cars[0] = c1;
    Car c2 = new Car("GM", "Impala", 300, 4000);
    cars[1] = c2;
    Car c3 = new Car("HyunDai", "Sonata", 250, 3500);
    cars[2] = c3;
    Car c4 = new Car("KIA", "K9", 300, 9000);
    cars[3] = c4;
    Car c5 = new Car("Benz", "E300", 300, 8000);
    cars[4] = c5;

    Util.sortList(cars);
    for (Car car : cars) {
      System.out.println(car);
    }
  }

  public static void findLarger(Comparable c1, Comparable c2) {
    if (c1.compareTo(c2) == 0) {
      System.out.println("같다.");
    } else if (c1.compareTo(c2) > 0) {
      System.out.println("첫번째가 크다.");
    } else{
      System.out.println("두번째가 크다");
    }
  }
}
