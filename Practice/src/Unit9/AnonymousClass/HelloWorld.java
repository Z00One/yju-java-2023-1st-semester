package Unit9.AnonymousClass;

public class HelloWorld {
  public void sayHello() {
    Hello eng = new English();
    eng.greet("world");

  }
  
  public static void main(String[] args) {
    Hello frenchHello = new Hello() {
      @Override
      public void greet(String someOne) {
        System.out.println("Salut le monde " + someOne);        
      }
    };

    Hello spanHello = new Hello() {
      @Override
      public void greet(String someOne) {
        System.out.println("Hola " + someOne);        
      }
    };

    HelloWorld hw = new HelloWorld();
    hw.sayHello();

    frenchHello.greet("World");
    spanHello.greet("World");
  }


  interface Hello {
    void greet(String someOne);
  }

  class English implements Hello {

    @Override
    public void greet(String someOne) {
      System.out.println("Hello " + someOne);
    }
  }
}
