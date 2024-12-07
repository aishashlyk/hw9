import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1
        System.out.println(1);
        Student student1 = new Student("Aziza",49);
        System.out.println(student1);
        student1.increaseYearsOfStudy();
        student1.increaseYearsOfStudy();
        System.out.println(student1);
        //2
        System.out.println(2);
        StarTriangle starTriangle1 = new StarTriangle(3);
        System.out.println(starTriangle1);
        //3
        System.out.println(3);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a side of a square: ");
        int a = scanner.nextInt();
        Square square = new Square(a);
        System.out.println(square);
        //4
        System.out.println(4);
        Temperature temp1 = new Temperature(25,'C');
        System.out.println(temp1);

    }
}
