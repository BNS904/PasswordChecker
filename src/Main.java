import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password;

        System.out.println("Welcome to the PasswordChecker program.");
        System.out.println("Please enter a password to be validated.");

        password = scanner.nextLine();

        PasswordValidator.isPasswordValid(password);
    }
}