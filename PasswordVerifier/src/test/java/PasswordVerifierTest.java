import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * @author Miguel Guilherme
 */
public class PasswordVerifierTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void shouldThrowExceptionIfNotLargerThanEightChars() throws Exception {
        String password = "secret";
        thrown.expect(Exception.class);
        thrown.expectMessage("password should be larger than 8 chars");
        PasswordVerifier.verify(password);
    }

    @Test
    public void shouldPassIfLargerThanEightChars() throws Exception {
        String password = "mytopSecret1";
        PasswordVerifier.verify(password);
    }

    @Test
    public void shouldThrowExceptionIfNull() throws Exception {
        String password = null;

        thrown.expect(Exception.class);
        thrown.expectMessage("password should not be null");
        PasswordVerifier.verify(password);
    }

    @Test
    public void shouldThrowExceptionIfNoUpperCaseLetter() throws Exception {
        String password = "secretwithoutuppercase";

        thrown.expect(Exception.class);
        thrown.expectMessage("password should have one uppercase letter at least");
        PasswordVerifier.verify(password);
    }

    @Test
    public void shouldThrowExceptionIfNoLowerCaseLetter() throws Exception {
        String password = "SECRETWITHOUTLOWERCASE";

        thrown.expect(Exception.class);
        thrown.expectMessage("password should have one lowercase letter at least");
        PasswordVerifier.verify(password);
    }

    @Test
    public void shouldThrowExceptionIfNoNumber() throws Exception {
        String password = "SecretWithoutNumber";

        thrown.expect(Exception.class);
        thrown.expectMessage("password should have one number at least");
        PasswordVerifier.verify(password);
    }

}