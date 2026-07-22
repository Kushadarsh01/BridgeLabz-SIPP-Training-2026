package oopsjavapractice.practiceproblem.collectionframework.vector;

import java.util.Vector;

public class StudentMain {
    public static void main(String[] args) {
        StudentData studentData = new StudentData(101, "Adarsh", 22, "CSE");
        StudentData studentData1 = new StudentData(102, "Tushar", 25, "CSE");
        StudentData studentData2 = new StudentData(103, "Aditya", 29, "CSE");
        StudentData studentData3 = new StudentData(104, "Aman", 23, "CSE");

        Vector<StudentData> vector = new Vector<>();

        vector.add(studentData);
        vector.add(studentData1);
        vector.add(studentData2);
        vector.add(studentData3);

        for (StudentData data : vector) {
            System.out.println("---------------------------");
            System.out.println(data);
            System.out.println("---------------------------");
        }
    }
}
