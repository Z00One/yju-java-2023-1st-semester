package Unit7.interfacetest;

import Unit7.interfacetest.Comparable;
import Unit7.interfacetest.Student;
import Unit7.polymorphism.Util;

public class Test {
  public static void main(String[] args) {
    // String s1 = "BBC";
    // String s2 = "BBC";
    // System.out.println(s1.compareTo(s2));
    // findLarger(std1, std2);
    Student[] stds = new Student[5];
    Student std1 = new Student("일지매", "컴정");
    stds[0] = std1;
    Student std2 = new Student("홍길동", "컴정");
    stds[1] = std2;
    Student std3 = new Student("김김김", "컴정");
    stds[2] = std3;
    Student std4 = new Student("박박박", "컴정");
    stds[3] = std4;
    Student std5 = new Student("안안안", "컴정");
    stds[4] = std5;

    Util.sortList(stds);

  }

  public static void findLarger(Comparable c1, Comparable c2) {
    if (c1.compareTo(c2) == 0) {
      System.out.println("같다.");
    }
    else if (c1.compareTo(c2) > 0) {
      System.out.println("첫번째가 크다.");
    }
    else{
      System.out.println("두번째가 크다");
    }
  }
}
