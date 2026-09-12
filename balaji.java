```java
import java.util.Scanner;

public class StudentApplication {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("===== Student Management Application =====");

        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Student ID: ");
        int id = scanner.nextInt();

        System.out.print("Enter Marks: ");
        int marks = scanner.nextInt();

        System.out.println("\n===== Student Details =====");
        System.out.println("Student Name : " + name);
        System.out.println("Student ID   : " + id);
        System.out.println("Marks        : " + marks);

        if (marks >= 50) {
            System.out.println("Result       : PASS");
        } else {
            System.out.println("Result       : FAIL");
        }

        scanner.close();
    }
}
```
