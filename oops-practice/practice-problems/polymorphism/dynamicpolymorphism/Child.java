package oopsjavapractice.practiceproblem.polymorphism.dynamicpolymorphism;

public class Child extends Parent{

    @Override
    public void add() {
        int c = 15 + 10;
        System.out.println("I am a child" + " " + c);
    }
}