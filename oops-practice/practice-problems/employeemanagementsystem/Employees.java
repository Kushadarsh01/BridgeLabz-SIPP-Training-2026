package oopsjavapractice.practiceproblem.employeemanagementsystem;

public class Employees {
    private int Id;
    private String Name;
    private String PhoneNumber;
    private String Email;
    private double Salary;

    public Employees(int id, String name, String phoneNumber, String email, double salary) {
        Id = id;
        Name = name;
        PhoneNumber = phoneNumber;
        Email = email;
        Salary = salary;
    }

    public int getId() {
        return Id;
    }

    public String getName() {
        return Name;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public String getEmail() {
        return Email;
    }

    public double getSalary() {
        return Salary;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", PhoneNumber='" + PhoneNumber + '\'' +
                ", Email='" + Email + '\'' +
                ", Salary=" + Salary +
                '}';
    }
}