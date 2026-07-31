package mainapp;

import models.Student;
import services.EnrollmentManager;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Student[]  students = new Student[100];
        int studentCount = 0;
        Scanner scanner = new Scanner(System.in);
        EnrollmentManager manager = new EnrollmentManager();

        boolean isRunning = true;

        while (isRunning) {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add a Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Sort Students by Name");
            System.out.println("5. Exit");


            System.out.println("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice) {
                case 1:
                    System.out.println("Enter Student ID: ");
                    String id = scanner.nextLine();

                    System.out.println("Enter Student Name: ");
                    String name = scanner.nextLine();


                    students[studentCount] = new Student(id, name);
                    studentCount++;
                    System.out.println("Student added successfully!");
                    break;
                case 2:
                    System.out.println("\n---------------Student List---------------");
                    for (int i = 0; i < studentCount; i++) {
                        System.out.println(students[i]);
                    }
                    break;
                case 3:
                    System.out.print("Enter Student ID to search: ");
                    String searchId = scanner.nextLine();


                    Student foundStudent = manager.searchingById(students, studentCount, searchId);

                    if (foundStudent != null) {
                        System.out.println("Student Found: " + foundStudent.toString());
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;
                case 4:
                    manager.sortStudentsByName(students, studentCount);
                    System.out.println("Students have been sorted alphabetically! (Choose Option 2 to view)");
                    break;


                case 5:
                    isRunning = false;
                    System.out.println("Existing");
                    break;
                default:
                    System.out.println("Invalid choice");

            }
        }

    }
}
