package Unit7.polymorphism;

public class Student extends Comparable {
  private String name;
  private String stdNum;

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getStdNum() {
    return this.stdNum;
  }

  public void setStdNum(String stdNum) {
    this.stdNum = stdNum;
  }

  public Student(String name, String stdNum) {
    this.name = name;
    this.stdNum = stdNum;
  }

  @Override
  public int CompareTo(Comparable anotherVal) {
    
    Student std = (Student)anotherVal;  // another , Student에 접근할 수 있게 하향 형 변환
    
    String stdName = std.getName();     // 내 값

    // String compareTo 메서드
    // : 알바벳 순으로 내 이름 앞이면 -1, 이름이 같으면 0, 내 이름이 뒤면 1을 반환
    return name.compareTo(stdName);
  }

  @Override
  public String toString() {
    return "[이름은 " + name + " 학번은 " + stdNum + "]";
  }
}