package Unit7.polymorphism;

public class Util {

  public static void sortList(Comparable[] list) {
    // 입력 받은 배열을 첫 번째 요소부터 접근
    for (int index = 0; index < list.length; index++) {
      // 최소값의 인덱스를 잡는다
      int minIndex = index;

      for (int j = index + 1; j < list.length; j++) {
        // 비교해보고 0 보다 큰 값이 나오면
          if (list[minIndex].CompareTo(list[j]) > 0){
            minIndex = j;
          }
      }
      // 인덱스 바꿔주기
      swap(index, minIndex, list);
    }
  }

  // 인덱스 바꿔주기
  private static void swap(int indexA, int indexB, Comparable[] list) {
    Comparable temp = list[indexA];
    list[indexA] = list[indexB];
    list[indexB] = temp;
  }
}
