package Unit7.polymorphism;

public class ProfessorTest {
  public static void main(String[] args) {
    
    Professor[] array = new Professor[4];
    
    array[0] = new Professor("park", "handsome");
    array[1] = new Professor("park", "cool");
    array[2] = new Professor("park", "smart");
    array[3] = new Professor("park", "awesome");
    
    Util.sortList(array);

    for (Professor pro:array) {
      System.out.println(pro);
    }
  }
}