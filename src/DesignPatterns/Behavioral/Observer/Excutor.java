package DesignPatterns.Behavioral.Observer;


public class Excutor {
    public static void main(String[] args) {
        Student malik = new Student("malik");
        Student Ahmed = new Student("Ahmed");
        Student Ali = new Student("Ali");
        Student Mohamed = new Student("Mohammed");


        Course java = new Course("Java Course");

        java.subscribe(malik);
        java.subscribe(Ahmed);
        java.subscribe(Ali);
        java.subscribe(Mohamed);

        java.setAvailability(false);
    }
}
