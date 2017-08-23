package School;
import java.util.*;

public class Student {

    private static int nextStudentId = 1;
    public static ArrayList<Integer> idList = new ArrayList<>();
    public static ArrayList<Student> studentList = new ArrayList<>();
    private String name;
    private final int studentId;
    private int numberOfCredits;
    private double gpa;


    public Student(String name, int studentId,
                   int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
        idList.add(studentId);
        studentList.add(this);
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    public Student(String name, int numberOfCredits, double gpa){
        this(name, nextStudentId, numberOfCredits, gpa);
        nextStudentId++;
    }

    /* id duplicate verification --current build allows duplicate IDs */


    /* getters and setters */
    public String getName() {
        return name;
    }
    public void setName(String aName) {
        name = aName;
    }

    public Integer getNumberOfCredits() {
        return numberOfCredits;
    }
    public void setNumberOfCredits(int aNumberOfCredits) {
        numberOfCredits = aNumberOfCredits;
    }

    public Double getGPA() {
        return gpa;
    }
    public void setGPA(double aGPA) {
        gpa = aGPA;
    }

    public Integer getStudentId() {
        return studentId;
    }


    @Override
    public String toString(){
        return ("\nID: " + studentId + "\nName: " + name + "\nNumber of Credits: " + numberOfCredits + "\nGPA: " + gpa);
    }


    public static void main(String[] args) {
        Student stephanie = new Student("Steph", 777, 8, 4.0);

        Student max = new Student("Max");
        Student uriae = new Student("Uri");

        Student sheena = new Student("Sheena", 4, 3.8);
        Student alex = new Student("Alex", 8, 2.1);

        System.out.println(stephanie);
        System.out.println(max);
        System.out.println(uriae);
        System.out.println(sheena);
        System.out.println(alex);
        System.out.println(idList);

    }
}