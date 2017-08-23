package School;
import java.util.*;

public class Course {
    private static List<Integer> courseList = new ArrayList<>();

    private String courseName;
    private int courseReferenceNumber;
    private final int numberOfCredits;

    private List<Student> studentList = new ArrayList<>();


    public Course (String courseName, int courseReferenceNumber, int numberOfCredits, List studentList){
        this.courseName = courseName;
        this.courseReferenceNumber = courseReferenceNumber;
        this.numberOfCredits = numberOfCredits;

        this.studentList = studentList;
    }

    @Override
    public String toString(){
        return ("\nCRN: " + courseReferenceNumber + "\nCourse Name: " + courseName + "\nNumber of Credits: " + numberOfCredits + "\nStudent List: " + studentList);
    }

    public static void main(String[] args) {
        Student stephanie = new Student("Steph", 0, 8, 4.0);
        Student max = new Student("Max");

//need to connect student IDs to individual courses, so it only displays those who are registered.
        Course history = new Course("History", 1,5, Student.studentList);
        Course science = new Course ("Science", 2, 4, Student.studentList);
        System.out.println(history);
        System.out.println(science);

    }

}
