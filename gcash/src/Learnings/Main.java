package Learnings;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("First Name: ");
        String firstName = scanner.nextLine();
        System.out.println("Last Name: ");
        String lastName = scanner.nextLine();
        System.out.println("Sex: ");
        String sex = scanner.nextLine();
        System.out.println("Age: ");
        Integer age = scanner.nextInt() ;


        Person per =new Person(firstName, lastName, sex, age);
    }
}
