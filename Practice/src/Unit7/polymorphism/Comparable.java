package Unit7.polymorphism;

public abstract class Comparable {
  // 내가 더 크면 1, anotherVal 하고 값이 같으면 0, 내가 더 작으면 -1
  public abstract int CompareTo(Comparable anotherVal);
}
