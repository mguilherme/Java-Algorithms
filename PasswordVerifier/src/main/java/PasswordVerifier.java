/**
 * @author Miguel Guilherme
 */
public class PasswordVerifier {

    public static void verify(String password) throws Exception {
        if (password == null)
            throw new Exception("password should not be null");
        if (password.length() <= 8)
            throw new Exception("password should be larger than 8 chars");
        if (password.equals(password.toLowerCase()))
            throw new Exception("password should have one uppercase letter at least");
        if (password.equals(password.toUpperCase()))
            throw new Exception("password should have one lowercase letter at least");
        if (!password.matches(".*\\d+.*"))
            throw new Exception("password should have one number at least");
    }
}
