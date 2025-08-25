package Day_1;

import java.util.Scanner;

public class Student {
    String name;
    long roll_no;
    String branch ;
    String address;
//    int marks[] = new int[10];

    // Constructor
    Student(String name, long roll_no, String branch, String address) {
        this.name = name;
        this.roll_no = roll_no;
        this.branch = branch;
        this.address = address;
    }

    // Method
    void check_result() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + roll_no);
        System.out.println("Branch: " + branch);
        System.out.println("Address: " + address);
        System.out.println("------------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create array of Student objects
        Student[] students = new Student[4];

        for (int i = 0; i < students.length; i++) {
            System.out.println("Enter details for Student " + (i + 1));

            System.out.print("Name: ");
            String name = sc.next();

            System.out.print("Roll No: ");
            long roll_no = sc.nextLong();

            System.out.print("Branch: ");
            String branch = sc.next();

            System.out.print("Address: ");
            String address = sc.next();

            students[i] = new Student(name, roll_no, branch, address);
        }

        System.out.println("\n--- Student Details ---");
        for (Student s : students) {
            s.check_result();
        }

        sc.close();
    }
}
