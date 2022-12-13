import java.util.Scanner;

public class Login {
    // Define the correct username and password
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "password";

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Prompt the user for their username and password
        System.out.print("Enter username: ");
        String username = input.nextLine();
        System.out.print("Enter password: ");
        String password = input.nextLine();

        while(true)
        {
            // Validate the user's input
            if (username.equals(USERNAME) && password.equals(PASSWORD)) {
                // If the username and password are correct, display a welcome message
                System.out.println("Welcome");
                break;
            } else {
                // If the username and password are incorrect, display an error message and prompt the user to try again
                System.out.println("\nIncorrect username or password. Try again.");
                System.out.print("Enter username: ");
                username = input.nextLine();
                System.out.print("Enter password: ");
                password = input.nextLine();
            }
        }
    }
}

