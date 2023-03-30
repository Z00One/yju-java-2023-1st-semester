package Unit7.Inheritance;

public class Lion extends Animal{
  private int legs = 4;

  public int getLegs() {
    return legs;
  }

  public void setLegs(int legs) {
    this.legs = legs;
  }

  public void roar() {
    System.out.println("roar()");
  }

  public void test() {
    this.eat();
    this.sleep();
  }
}