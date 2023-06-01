package Unit9.AnonymousClass;

import Unit9.interfacetest.RemoteControl;

class PanasonicTV implements RemoteControl {
  @Override
  public void turnOn() {
    System.out.println("PanasonicTV 켜졌습니다.");
  }

  @Override
  public void turnOff() {
    System.out.println("PanasonicTV 꺼졌습니다.");
  }
}

public class CallbackTest2 {
  public void remoteControl(RemoteControl rc) {
    rc.turnOn();
  }

  public static void main(String[] args) {
    CallbackTest2 cb = new CallbackTest2();
    // 무명 클래스로 RemoteControl 객체를 인자로 전달하시오
    // 화면에는 "파나소닉 테레비가 켜졌습니다." 출력

    // 1. 변수 사용해서 전달
    // 1.1 일반 클래스
    PanasonicTV obj = new PanasonicTV();
    cb.remoteControl(obj);
    // 1.2 무명 클래스
    RemoteControl AnonymousObj = new RemoteControl() {
      @Override
      public void turnOn() {
        System.out.println("파나소닉 테레비가 켜졌습니다.");
      }

      @Override
      public void turnOff() {
        System.out.println("파나소닉 테레비가 꺼졌습니다.");
      }
    };
    cb.remoteControl(AnonymousObj);

    // 2. 변수 사용하지 않고 전달
    // 2.1 일반 클래스
    cb.remoteControl(new PanasonicTV());

    // 2.2 무명 클래스
    cb.remoteControl(new RemoteControl() {

      @Override
      public void turnOn() {
        System.out.println("파나소닉 테레비가 켜졌습니다.");
      }

      @Override
      public void turnOff() {
        System.out.println("파나소닉 테레비가 꺼졌습니다.");
      }
    });
  }
}
