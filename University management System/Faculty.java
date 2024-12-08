package Lab.Project;

public class Faculty extends User {
    private String department;

    public Faculty(String name, int id, String department) {
        super(name, id);
        this.department = department;
    }

    @Override
    public void displayDetails() {
        System.out.println("Faculty ID: " + id + ", Name: " + name + ", Department: " + department);
    }

    public void updateDepartment(String department) {
        this.department = department;
    }
}
