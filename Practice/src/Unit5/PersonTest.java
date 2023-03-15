package Unit5;

public class PersonTest {
  
  public static void main(String[] args) {
    Person person0 = new Person();
    person0.setAge(20);
    String d = person0.dept;
    int age = person0.getAge();

    System.out.println(age);
    System.out.println(d);
  }
}
