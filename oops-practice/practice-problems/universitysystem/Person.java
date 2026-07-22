package oopsjavapractice.practiceproblem.universitysystem;

public class Person {
    protected int PersonId;
    protected String PersonName;

    public Person(int id, String name) {
        this.PersonId = id;
        this.PersonName = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "PersonId=" + PersonId +
                ", PersonName='" + PersonName + '\'' +
                '}';
    }
}
