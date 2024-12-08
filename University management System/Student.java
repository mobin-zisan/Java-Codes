package Lab.Project;

public class Student extends User {
    private String course;

    public Student(String name, int id, String course) {
        super(name, id);
        this.course = course;
    }

    @Override
    public void displayDetails() {
        System.out.println("Student ID: " + id + ", Name: " + name + ", Course: " + course);
    }

    public void updateCourse(String course) {
        this.course = course;
    }
}
