package Lab.Project;

import java.util.ArrayList;
import java.util.Scanner;

public class UniversityManagement {
    private ArrayList<Student> students = new ArrayList<>();
    private ArrayList<Faculty> faculties = new ArrayList<>();

    private Scanner scanner = new Scanner(System.in);

    public void start() {
        while (true) {
            System.out.println("\n--- University Management Menu ---");
            System.out.println("1. Add Student");
            System.out.println("2. Delete Student");
            System.out.println("3. Update Student");
            System.out.println("4. Search Student");
            System.out.println("5. Display All Students");
            System.out.println("6. Add Faculty");
            System.out.println("7. Delete Faculty");
            System.out.println("8. Update Faculty");
            System.out.println("9. Search Faculty");
            System.out.println("10. Display All Faculties");
            System.out.println("11. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> addStudent();
                case 2 -> deleteStudent();
                case 3 -> updateStudent();
                case 4 -> searchStudent();
                case 5 -> displayAllStudents();
                case 6 -> addFaculty();
                case 7 -> deleteFaculty();
                case 8 -> updateFaculty();
                case 9 -> searchFaculty();
                case 10 -> displayAllFaculties();
                case 11 -> {
                    System.out.println("Exiting... Thank you!");
                    return;
                }
                default -> System.out.println("Invalid choice! Try again.");
            }
        }
    }

    private void addStudent() {
        System.out.print("Enter Student Name: ");
        String name = scanner.next();
        System.out.print("Enter Student ID: ");
        int id = scanner.nextInt();
        System.out.print("Enter Course: ");
        String course = scanner.next();

        students.add(new Student(name, id, course));
        System.out.println("Student added successfully!");
    }

    private void deleteStudent() {
        System.out.print("Enter Student ID to delete: ");
        int id = scanner.nextInt();

        students.removeIf(student -> student.getId() == id);
        System.out.println("Student deleted successfully!");
    }

    private void updateStudent() {
        System.out.print("Enter Student ID to update: ");
        int id = scanner.nextInt();

        for (Student student : students) {
            if (student.getId() == id) {
                System.out.print("Enter new Course: ");
                String course = scanner.next();
                student.updateCourse(course);
                System.out.println("Student updated successfully!");
                return;
            }
        }
        System.out.println("Student not found!");
    }

    private void searchStudent() {
        System.out.print("Enter Student ID to search: ");
        int id = scanner.nextInt();

        for (Student student : students) {
            if (student.getId() == id) {
                student.displayDetails();
                return;
            }
        }
        System.out.println("Student not found!");
    }

    private void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found!");
        } else {
            for (Student student : students) {
                student.displayDetails();
            }
        }
    }

    private void addFaculty() {
        System.out.print("Enter Faculty Name: ");
        String name = scanner.next();
        System.out.print("Enter Faculty ID: ");
        int id = scanner.nextInt();
        System.out.print("Enter Department: ");
        String department = scanner.next();

        faculties.add(new Faculty(name, id, department));
        System.out.println("Faculty added successfully!");
    }

    private void deleteFaculty() {
        System.out.print("Enter Faculty ID to delete: ");
        int id = scanner.nextInt();

        faculties.removeIf(faculty -> faculty.getId() == id);
        System.out.println("Faculty deleted successfully!");
    }

    private void updateFaculty() {
        System.out.print("Enter Faculty ID to update: ");
        int id = scanner.nextInt();

        for (Faculty faculty : faculties) {
            if (faculty.getId() == id) {
                System.out.print("Enter new Department: ");
                String department = scanner.next();
                faculty.updateDepartment(department);
                System.out.println("Faculty updated successfully!");
                return;
            }
        }
        System.out.println("Faculty not found!");
    }

    private void searchFaculty() {
        System.out.print("Enter Faculty ID to search: ");
        int id = scanner.nextInt();

        for (Faculty faculty : faculties) {
            if (faculty.getId() == id) {
                faculty.displayDetails();
                return;
            }
        }
        System.out.println("Faculty not found!");
    }

    private void displayAllFaculties() {
        if (faculties.isEmpty()) {
            System.out.println("No faculties found!");
        } else {
            for (Faculty faculty : faculties) {
                faculty.displayDetails();
            }
        }
    }
}
