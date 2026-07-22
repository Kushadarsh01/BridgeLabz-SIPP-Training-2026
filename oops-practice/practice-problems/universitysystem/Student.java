package oopsjavapractice.practiceproblem.universitysystem;

public class Student extends Person {
    protected int StudentId;
    protected double StudentGPA;

    public Student(int personId, String name, int studentId, double gpa) {
        super(personId, name);

        this.StudentId = studentId;
        this.StudentGPA = gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "StudentId=" + StudentId +
                ", StudentGPA=" + StudentGPA +
                ", PersonId=" + PersonId +
                ", PersonName='" + PersonName + '\'' +
                '}';
    }
}
