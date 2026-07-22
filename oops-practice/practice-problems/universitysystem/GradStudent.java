package oopsjavapractice.practiceproblem.universitysystem;

public class GradStudent extends Student{
    protected String Thesis;

    public GradStudent(int personId, String name, int studentId, double gpa, String thesis) {
        super(personId, name, studentId, gpa);

        this.Thesis = thesis;
    }

    @Override
    public String toString() {
        return "GradStudent{" +
                "PersonId=" + PersonId +
                ", PersonName='" + PersonName + '\'' +
                ", StudentId=" + StudentId +
                ", StudentGPA=" + StudentGPA +
                ", Thesis='" + Thesis + '\'' +
                '}';
    }
}
