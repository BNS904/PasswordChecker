import java.lang.*;

public class CharacterCheck {
    public static boolean isLowerCase (String password) {
        char temp;
        for (int i = 0; i < password.length(); i++) {
            temp = password.charAt(i);

            if (Character.isLowerCase(temp)) {
                System.out.println("Password has lowercase letter(s).");
                return true;
            }
        }
        System.out.println("Password does not have lowercase letter(s).");
        return false;
    }

    public static boolean isUpperCase (String password) {
        char temp;
        for (int i = 0; i < password.length(); i++) {
            temp = password.charAt(i);

            if (!Character.isLowerCase(temp) && Character.isLetter(temp)) {
                System.out.println("Password has uppercase letter(s).");
                return true;
            }
        }
        System.out.println("Password does not have uppercase letter(s).");
        return false;
    }

    public static boolean hasNumbers (String password) {
        char temp;
        for (int i = 0; i < password.length(); i++) {
            temp = password.charAt(i);

            if (Character.isDigit(temp)) {
                System.out.println("Password has number(s).");
                return true;
            }
        }
        System.out.println("Password does not have number(s).");
        return false;
    }

    public static boolean hasSpecialChar (String password) {
        char temp;
        for (int i = 0; i < password.length(); i++) {
            temp = password.charAt(i);

            if (temp == 33 || temp == 126 || temp == 64 || temp == 35 ||
                    temp == 36 || temp == 37 || temp == 94 || temp == 38 || temp == 42 || temp == 40 || temp == 41
            || temp == 45 || temp == 61 || temp == 43 || temp == 95) {
                System.out.println("Password has select special character(s).");
                return true;
            }
        }
        System.out.println("Password does not have select special character(s).");
        return false;
    }
}
