package models;

public class Course {
    private String code;
    private String title;

    /**
     * Constructs a new models.Course object.
     * @param code the unique course code (e.g., SE2012)
     * @param title the title of the course
     */

    public Course(String code, String title){
        this.code = code;
        this.title = title;
    }
    /**
     * Returns the course code.
     * @return the course code
     */
    public String getCode(){
        return code;
    }
    /**
     * Returns the course title.
     * @return the course title
     */
    public String getTitle(){
        return title;
    }
    /**
     * Returns a string representation of the course.
     * @return course details as a formatted string
     */
    public String toString(){
        return "models.Student Code:" +this.code + " "+"Title:"+ this.title;
    }
}
