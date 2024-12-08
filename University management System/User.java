package Lab.Project;

public abstract class User {
    protected String name;
    protected int id;

    public User(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public abstract void displayDetails();

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
