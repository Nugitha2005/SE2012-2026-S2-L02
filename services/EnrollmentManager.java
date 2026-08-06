package services;

import models.Student;

public class EnrollmentManager {

    public Student searchingById(Student[] list, int count, String id) {
        for (int i = 0; i < count; i++) {
            if (list[i].getId().equals(id)) {
                return list[i];
            }
        }
        return null;
    }

    public void sortStudentsByName(Student[] list, int count) {
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - i - 1; j++) {
                if (list[j].getName().compareToIgnoreCase(list[j + 1].getName()) > 0) {
                    Student temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
    }
}