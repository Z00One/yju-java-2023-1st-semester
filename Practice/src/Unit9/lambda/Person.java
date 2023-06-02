package Unit9.lambda;

import java.time.LocalDate;
import java.time.Period;

// https://docs.oracle.com/javase/tutorial
public class Person {

    private String name;
    private LocalDate birthDate;
    private String emailAddress;
    private Sex gender;
    private int age;

    public Person(String name, LocalDate birthDate, String emailAddress, Sex gender) {
        this.name = name;
        this.birthDate = birthDate;
        this.emailAddress = emailAddress;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public LocalDate getBirthDate() {
        return this.birthDate;
    }

    public String getEmailAddress() {
        return this.emailAddress;
    }

    public Sex getGender() {
        return this.gender;
    }

    public int getAge() {
        int age = Period.between(birthDate, LocalDate.now()).getYears();
        return age;

        // method chaning : 메소드 호출을 쇠사슬이 연결된 것처럼, 이어서 쭉 호출하는 것
    }

    public void printPerson() {
        System.out.printf("Name: %s, Email: %s, Gender: %s, BirthDate: %s \n", name, emailAddress, gender.toString(), birthDate);
    }
}

