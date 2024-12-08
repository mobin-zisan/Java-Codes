package Lab.Project;

import java.util.HashMap;
import java.util.Scanner;

public class Login {
    private HashMap<String, String> credentials = new HashMap<>();

    public void signUp() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a username: ");
        String username = scanner.nextLine();
        System.out.print("Enter a password: ");
        String password = scanner.nextLine();

        if (!credentials.containsKey(username)) {
            credentials.put(username, password);
            System.out.println("Sign Up successful!");
        } else {
            System.out.println("Username already exists! Try a different username.");
        }
    }

    public boolean login() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if (credentials.containsKey(username) && credentials.get(username).equals(password)) {
            System.out.println("Login successful!");
            return true;
        } else {
            System.out.println("Invalid username or password! Try again.");
            return false;
        }
    }
}
