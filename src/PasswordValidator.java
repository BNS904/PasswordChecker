public class PasswordValidator {

    public static void isPasswordValid(String password) {
        int conditionsMeet = 0;

        if (!LengthCheck.isProperLength(password)) {
            System.out.println("Password fails length requirement.");
            System.out.println("Password is not valid.");
            System.exit(1);
        } else {
            System.out.println("Password is within proper length requirements.");
        }

        if(CharacterCheck.isLowerCase(password)) {
            conditionsMeet++;
        }
        if (CharacterCheck.isUpperCase(password)) {
            conditionsMeet++;
        }
        if (CharacterCheck.hasNumbers(password)) {
            conditionsMeet++;
        }
        if (CharacterCheck.hasSpecialChar(password)) {
            conditionsMeet++;
        }

        if (conditionsMeet >= 3) {
            System.out.println("Congratulations, your password is valid.");
        } else {
            System.out.println("Unfortunately, your password isn't valid.");
        }

    }
}
