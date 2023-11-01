public class LengthCheck {
    public static boolean isProperLength(String password) {
        if (password.length() < 8 ) {
            System.out.println("Password is too short.");
            return false;
        } else if (password.length() > 16) {
            System.out.println("Password is too long.");
            return false;
        } else {
            return true;
        }
    }
}
