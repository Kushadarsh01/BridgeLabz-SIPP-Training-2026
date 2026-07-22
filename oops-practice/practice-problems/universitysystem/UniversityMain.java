package oopsjavapractice.practiceproblem.universitysystem;

public class UniversityMain {
    public static void main(String[] args) {
        GradStudent gradStudent = new GradStudent(
                101,
                "Adarsh",
                1,
                7.0,
                "Artificial Intelligence"
        );

        System.out.println(gradStudent);
    }
}
