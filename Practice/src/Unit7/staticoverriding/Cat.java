package Unit7.staticoverriding;

public class Cat extends Animal{
  public static void eat() {
    System.out.println("cat eat");
  }

  @Override
  public void sound() {
    System.out.println("sound of cat");
  }  
}
