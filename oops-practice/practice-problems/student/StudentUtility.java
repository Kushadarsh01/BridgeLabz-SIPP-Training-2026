package oopsjavapractice.practiceproblem.student;

public class StudentUtility {
    public static void main(String[] args) {
        Student student = new Student();

        int id = student.getID();
        System.out.println(id);

        student.setName("Adarsh");
        String name = student.getName();
        System.out.println(name);
    }
}
