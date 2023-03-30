package Unit7.Inheritance;

public class Animal {
  private double weight;
  private String picture;

  protected void eat() {
    System.out.println("eat()");
  }

  void sleep() {
    System.out.println("sleep()");
  }

  public double getWeight() {
    return weight;
  }

  public void setWeight(double weigth) {
    this.weight = weigth;
  }

  public String getPicture() {
    return picture;
  }

  public void setPicture(String picture) {
    this.picture = picture;
  }
}