package Unit5;

public class SafeArray {
  private int[] a;

  public void createArray(int size) {
    a = new int[size];
  }

  public int get(int index) {
    // 0 이상. 배열 a 의 길이보다 작은 값인 경우
    if (index >=0 && index < a.length) 
    return a[index];
    // 0 미만, 배열 a 의 길이보다 큰 값인 경우
    System.out.println("잘못된 인덱스:"+index);
    return -1;
  }
  
  public void put(int index, int value) {
    // 0 이상. 배열 a 의 길이보다 작은 값인 경우
    if (index >=0 && index < a.length) {
      a[index] = value;
      return ;
    }
    // 0 미만, 배열 a 의 길이보다 큰 값인 경우
    System.out.println("잘못된 인덱스:"+index);
  }

  public static void main(String[] args) {
    SafeArray array = new SafeArray();
    array.createArray(10); // 길이가 10인 배열 생성

    array.put(2, 100); // 배열의 길이를 넘지 않음으로 value가 넣어짐
    array.put(10, 200); // 배열의 길이를 넘어 value가 넣어지지 않음

    System.out.println(array.get(2));
  }
}