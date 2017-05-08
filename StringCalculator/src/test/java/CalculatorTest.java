import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author Miguel Guilherme
 */
public class CalculatorTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void testEmptyStringIsZero() throws Exception {
        assertThat(Calculator.add("")).isEqualTo(0);
    }

    @Test
    public void testOneNumberIsItself() throws Exception {
        assertThat(Calculator.add("1")).isEqualTo(1);
    }

    @Test
    public void testTwoNumbersShouldReturnTheirSum() throws Exception {
        assertThat(Calculator.add("1,2")).isEqualTo(3);
    }

    @Test
    public void testThreeNumbersShouldReturnTheirSum() throws Exception {
        assertThat(Calculator.add("1,2,3")).isEqualTo(6);
    }

    @Test
    public void testNewLinesBetweenNumbers() throws Exception {
        assertThat(Calculator.add("1\n2,3")).isEqualTo(6);
    }

    @Test
    public void testWithSemicolonSeparator() throws Exception {
        assertThat(Calculator.add("//;\n1;2")).isEqualTo(3);
    }

    @Test
    public void testNegativeNumberThrowsAnException() throws Exception {
        thrown.expect(Exception.class);
        thrown.expectMessage("negatives not allowed: [-1]");
        Calculator.add("-1");
    }

    @Test
    public void testNegativeNumbersThrowsAnException() throws Exception {
        thrown.expect(Exception.class);
        thrown.expectMessage("negatives not allowed: [-1, -5, -8]");
        Calculator.add("-1,-5,3,-8");
    }

    @Test
    public void testWithBiggerThan1000ShouldBeIgnored() throws Exception {
        assertThat(Calculator.add("2,1001")).isEqualTo(2);
    }

    @Test
    public void testWithBigDelimiter() throws Exception {
        assertThat(Calculator.add("//[***]\n1***2***3")).isEqualTo(6);
    }

}