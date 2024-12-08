package Lab.Project;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UniversityManagement system = new UniversityManagement();
        Login login = new Login();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to University Management System!");
        boolean isAuthenticated = false;

        while (!isAuthenticated) {
            System.out.println("1. Login");
            System.out.println("2. Sign Up");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                isAuthenticated = login.login();
            } else if (choice == 2) {
                login.signUp();
            } else {
                System.out.println("Invalid choice! Try again.");
            }
        }

        system.start();
    }
}
