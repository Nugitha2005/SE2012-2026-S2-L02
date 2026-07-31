package services;
import models.Student;

public class EnrollmentManager {
    /**
     * Finds a student by their ID using a linear search.
     *
     * @param list the array of students to search through
     * @param count the current number of students in the array
     * @param id the student ID to search for
     * @return the Student object if found, or null if not found
     */
    public Student searchingById(Student[] list, int count, String id){
        for(int i = 0; i < count; i++){
            if(list[i].getId().equals(id)){
                return list[i];
            }

        }
        return null;
    }
    /**
     * Sorts the array of students alphabetically by name using bubble sort.
     *
     * @param list the array of students to sort
     * @param count the current number of students in the array
     */
    public void sortStudentsByName(Student[] list, int count) {
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - i - 1; j++) {

                if (list[j].getName().compareToIgnoreCase(list[j + 1].getName()) > 0) {
                    // Swap the students
                    Student temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
    }
}
