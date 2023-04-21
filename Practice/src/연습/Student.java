package 연습;

import 연습.Comparable;

public class Student implements Comparable {
  private String name;
  private String dept;
  private String CompareToKey;

  public Student(String name, String dept, String CompareToKey) {
    this.name = name;
    this.dept = dept;
    this.CompareToKey = CompareToKey;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDept() {
    return this.dept;
  }

  public void setDept(String dept) {
    this.dept = dept;
  }

  public String getCompareToKey() {
    return this.CompareToKey;
  }

  public void setCompareToKey(String CompareToKey) {
    this.CompareToKey = CompareToKey;
  }

  // 인증된 접근인지 확인
  @Override
  public boolean isAuthenticable(String keyA, String keyB) {
    boolean isAuthenticable = keyA == keyB;
    return isAuthenticable;
  };

  @Override
  public int CompareTo(Comparable obj, String key) {
    int returnValue = 0x0;

    // 하향 형 변환
    Student compareStd = (Student)obj;
    
    // 인증된 접근인 경우 값 비교
    if (isAuthenticable(Comparable.key, key)) {
      returnValue = this.getDept().compareTo(compareStd.getDept()); 
    }
    return returnValue;
  }
}
