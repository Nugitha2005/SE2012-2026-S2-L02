package mainapp;

import models.Student;
import services.EnrollmentManager;
import java.util.Scanner;

public class Main {

    static Student[] students = new Student[10];
    static int studentCount = 0;
    static EnrollmentManager manager = new EnrollmentManager();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("-------------Student Management System-------------");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Sort Student By Name");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    addStudent();
                    break;

                case 2:
                    System.out.println("\n---------------Student List---------------");
                    if (studentCount == 0) {
                        System.out.println("No students available.");
                    } else {
                        for (int i = 0; i < studentCount; i++) {
                            System.out.println(students[i]);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Student ID to search: ");
                    String searchId = scanner.nextLine();

                    Student foundStudent = manager.searchingById(students, studentCount, searchId);

                    if (foundStudent != null) {
                        System.out.println("Student Found: " + foundStudent);
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 4:
                    manager.sortStudentsByName(students, studentCount);
                    System.out.println("Students have been sorted alphabetically!");
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 5);

        scanner.close();
    }

    public static void addStudent() {

        if (studentCount >= students.length) {
            System.out.println("Student list is full.");
            return;
        }

        System.out.print("Enter the student ID: ");
        String id = scanner.nextLine();

        System.out.print("Enter the student Name: ");
        String name = scanner.nextLine();

        students[studentCount] = new Student(id, name);
        studentCount++;

        System.out.println("Student added successfully.");
    }
}