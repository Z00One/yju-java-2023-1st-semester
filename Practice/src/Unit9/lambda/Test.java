// Test.java
package Unit9.lambda;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        Person p1 = new Person("홍길동", LocalDate.of(2000, 1, 4), "hgd@gmail.com", Sex.MALE);
        Person p2 = new Person("일지매", LocalDate.of(1995, 2, 15), "ijm@gmail.com", Sex.FEMALE);
        Person p3 = new Person("김문수", LocalDate.of(1988, 5, 30), "kms@gmail.com", Sex.MALE);

        // List는 인터페이스, 이 인터페이스를 구현하는 클래스로
        // ArrayList, LinkedList 등이 있다.
        // List<Person> list = new ArrayList<Person>(); 인스턴스의 제너릭은 생략 가능
        List<Person> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);

        // printPersonOlderThan(list, 33);

        // printPersonWithinAgeRange(list, 19, 45);

        // checkPerson 인터페이스를 implements 하는 클래스를 하나 생성해서
        // printPersons 메소드를 호출해라.
        // 단, 이 메소드에 의해 출력되는 Person 객체는 성별이 남자인 객체이어야 한다.
        // printPersons(list, new CheckGender());

        // 위와 똑같이 성별이 남자인 객체만 출력하도록
        // printPersons 메서드를 호출하되, 무명클래스를 이용해봐라.
        // ChexkPerson 인터페이스를 구현하는 무명클래스를 생성해 printPersons 메서드를 호출하면 된다.
        // 클래스 선언과(정의와) 객체생성을 동시에 할 수 있는 방법이 무명클래스
        CheckPersons a;

        // 무명클래스로 구현
        // printPersons(list, new CheckPersons() {
        //     @Override
        //     public boolean is(Person p) {
        //         return p.getGender() == Sex.FEMALE;
        //     }
        // });

        // 무명 클래스를 람다식으로 구현
        // printPersons(list, (Person p)->{return p.getGender() == Sex.MALE;}); 타입을 줄 수도 있는 거다.
        // printPersons(list, (p)->{return p.getGender() == Sex.MALE;}); 람다식의 body가 return 문 하나만으로 구성되어 있으면 return 키워드, {}, 문장 끝의 ; 도 생략가능
        // printPersons(list, (p)-> p.getGender() == Sex.MALE); 매개변수가 하나인 경우 매개변수의 () 생략할 수 있다.
        // printPersons(list, p-> p.getGender() == Sex.MALE);
        
        // 람다식을 이용해서 printPersons 메서드 호출
        // 그 결과로 나이 20 ~ 30 사이의 여자만 출력되도록 구현
        // printPersons(list, p-> {return (p.getGender() == Sex.FEMALE) && (20 <= p.getAge() && p.getAge() <= 30);});
        printPersons(list, p-> (p.getGender() == Sex.FEMALE) && (20 <= p.getAge() && p.getAge() <= 30));
        
    }

    // collection framework : List, Set, Map, Stack, Queue
    // collection framework는 여러 개의 값을 저장하는 자바의 자료구조
    // 이 자료구조에 들어갈 수 있는 원소 타입을 자바의 generic 이라는 기능을 이용해 지정할 수 있다.
    // List<Person>, Set<Integer>, Map<String, Person>, ....
    public static void printPersonOlderThan(List<Person> persons, int age) {

        // persons 리스트의 각 원소에 대해서 반복문을 수행한다.
        // 각 원소의 Person 타입의 변수 p에 저장
        // 입력된 값 보다 큰 나이의 객체의 정보만 반환
        for (Person p : persons) {
            if (p.getAge() >= age) {
                p.printPerson();
            }
        }
    }

    // List<Person> list, int Low, int High
    // 위 세개의 매개변수를 통해 Person 객체 리스트와, 나이의 범위(Low 이상, high 미만)를
    // 입력으로 받아, 저 나이 범위의 Person 정보만 출력하는 메서드
    public static void printPersonWithinAgeRange(List<Person> persons, int low, int high) {
        boolean isWithinAgeRange; // flag
        boolean noOneWithinAgeRange = true; // 아무도 없는 경우

        for (Person p : persons) {
            int age = p.getAge(); // 객체의 나이

            isWithinAgeRange = low <= age && age < high; // 입력된 범위에 맞는 지 출력

            if (isWithinAgeRange) {
                if (noOneWithinAgeRange)
                    noOneWithinAgeRange = !noOneWithinAgeRange; // 한 객체라도 범위안에 들면 값 바꿔주기

                p.printPerson(); // 객체 정보 출력
            }
        }

        if (noOneWithinAgeRange)
            System.out.println("no One Within Age Range");
    }

    /*
     * Person 객체의 리스트와 CheckPersons 인터페이스를 구현한 // 객체(tester)를 전달받고, -> 객체의 메서드를 사용할
     * 수 있음(로직 전달) -> 람다의 개념
     * 리스트의 각 Person 객체를 tester.test 메소드의 인자로 전달해, 그 변환 값이 true 이면
     * 그 Person 객체의 정보를 출력.
     */
    public static void printPersons(List<Person> list, CheckPersons tester) {
        for (Person p : list) {
            if (tester.is(p)) {
                p.printPerson();
            }
        }
    }
}

interface CheckPersons {
    boolean is(Person p);
}

class CheckGender implements CheckPersons {
    // 남자인 경우
    @Override
    public boolean is(Person p) {
        Sex PersonGender = p.getGender();
        return PersonGender == Sex.MALE;
    }
}

// 오직 하나의 추상메소드만 가지는 인터페이스 타입의
// 람다식은 이름없는 메소드라 할 수 있다.
// 람다식을 이용하는 이유는 간결하기 때문이다.
// 람다식을 이용하는 메서드가 필요한 곳에 간단히 메서드를 보낼 수 있다.
// 람다식은 함수형 프로그래밍을 자바에 도입한 것
// 람닷식은 오직 하나의 추상 메소드를 가지는 함수형 인터페이스의 객체를 요구하는
// 값에 전달할 수 있다.