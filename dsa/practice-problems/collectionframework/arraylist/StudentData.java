package oopsjavapractice.practiceproblem.collectionframework.arraylist;

public class StudentData {
    int Id;
    String Name;
    int Age;
    String Branch;

    public StudentData(int id, String name, int age, String branch) {
        Id = id;
        Name = name;
        Age = age;
        Branch = branch;
    }

    @Override
    public String toString() {
        return "ID: " + Id + "\nName: " + Name + "\nAge: " + Age + "\nBranch: " + Branch;
    }
}
