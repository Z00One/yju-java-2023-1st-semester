package Unit6;

public class Employee {
  private String name;
  private double salary;

  private static int count = 0;

  // 생성자
  public Employee(String name, double salary) {
    this.name = name;
    this.salary = salary;
    count++;
  }

  protected void finalize() {
    count--;
  }

  public static int getCount() {
    return count;
  }
}
