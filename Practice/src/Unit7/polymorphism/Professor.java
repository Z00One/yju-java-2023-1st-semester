package Unit7.polymorphism;
import Unit7.interfacetest.Comparable;

public class Professor implements Comparable{
  private String name;
  private String property;

  public String getProperty() {
    return this.property;
  }

  public void setProperty(String property) {
    this.property = property;
  }

  Professor(String name, String property) {
    this.name = name;
    this.property = property;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public int compareTo(Comparable anotherVal) {
    Professor pro = (Professor)anotherVal;
    
    String proName = pro.getProperty();
    
    // property순
    return property.compareTo(proName);
  }

  @Override
    public String toString() {
      return "[name : " + name + ", property : " + property + " ]";
    }
}