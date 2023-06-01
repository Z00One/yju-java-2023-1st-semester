package Unit9.interfacetest;

// 인터페이스의 모든 메소드는 public abstract이다. 
public interface RemoteControl {
  void turnOn();
  void turnOff();

  // default void volumeControl(int amount) {
  //   String st = null;
  //   st = amount >= 0 ? "높입니다." : "줄입니다";
  //   amount = Math.abs(amount); // |number| 
  //   System.out.println("볼륨을 " + amount + " 만큼 " + st);
  // }
}
