import java.util.Scanner;

class Student {
    String name;
    int roll;
    double marks;

    void input() {
        try(Scanner sc = new Scanner(System.in)) {
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Roll No: ");
        roll = sc.nextInt();
        System.out.print("Enter Marks: ");
        marks = sc.nextDouble();
    }
}

    void display() {
        System.out.println("\n--- Student Details ---");
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
        System.out.println("Marks: " + marks);
    }
}

public class StudentManagement {
    public static void main(String[] args) {
        Student s = new Student();
        s.input();
        s.display();

    }
}


