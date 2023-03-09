package source;

import java.util.Scanner;

public class StringTest {

  public static void main(String[] args) {
    // 출력을 위한 객체 생성
    Scanner scn = new Scanner(System.in);

    String str = ""; // 입력값을 담아줄 변수

    while(str != "quit") {
      // 입력 받기
      System.out.print("문자열을 입력하세요 >");
      str = scn.next();

      // quit
      if (str.equals("quit") == true) {
        break;
      }

      // www.~~~~~~~~~~~~~~~~~
      if (str.matches("^www(.*)")) {  // 정규표현식 www로 시작(^), 후에 어떤 문자가 붙어도((.*)) www만있으면 true
        System.out.println(str + " 은 'www'로 시작합니다");
      }

      //
      else {
        System.out.println(str + " 은 'www'로 시작하지 않습니다.");
      }
    }
  }
}
