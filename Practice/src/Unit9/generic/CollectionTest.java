package Unit9.generic;

import java.util.ArrayList;

public class CollectionTest {
  public static void main(String[] args) {
    ArrayList<String> names = new ArrayList<>();

    names.add("a");
    names.add("b");
    names.add("c");
    names.add("d");
    names.add("e");

    for (String name : names) {
      System.out.println(name);
    }
  }
}
