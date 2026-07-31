package models;

public class Student {
   private String id;
   private String name;

   public Student(String id, String name) {
       this.id = id;
       this.name = name;

   }
    /**
     * Returns the student ID.
     * @return the unique ID of the student
     */
   public String getId() {
       return id;
   }
    /**
     * Returns the student Name.
     * @return the Name of  the student
     */
   public String getName(){
       return name;
   }
   public String toString(){
       return "models.Student ID:" +this.id + " "+"Name:"+ this.name;
   }


}
