package Unit7.polymorphism;

public class StudentTest {
  public static void main(String[] args) {
    Student[] stds = new Student[5];
    stds[0] = new Student("가", "9");
    stds[1] = new Student("라", "8");
    stds[2] = new Student("나", "7");
    stds[3] = new Student("마", "6");
    stds[4] = new Student("다", "5");
    Util.sortList(stds);

    for (int i = 0; i < stds.length; i ++) {
      System.out.println(stds[i]);
    }
  }
}