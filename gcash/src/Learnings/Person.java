package Learnings;
public class Person {
    String firstName;
    String lastName;
    String sex;
    int age;

    Person(String firstName, String lastName, String sex, int age){
        this.firstName=firstName;
        this.lastName=lastName;
        this.sex=sex;
        this.age=age;
        System.out.println("Person created!");
        System.out.println("Hi " + firstName+ " " + lastName+ "!\nWelcome to Gcash!\nYour age is: " + age + "\nYour sex is: "+ sex);


    }
}
