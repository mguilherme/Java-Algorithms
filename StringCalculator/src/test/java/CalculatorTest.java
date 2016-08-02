import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * @author Miguel Guilherme
 */
public class CalculatorTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testEmptyStringIsZero() throws Exception {
        assertThat(Calculator.add(""), is(equalTo(0)));
    }

    @Test
    public void testOneNumberIsItself() throws Exception {
        assertThat(Calculator.add("1"), is(equalTo(1)));
    }

    @Test
    public void testTwoNumbersShouldReturnTheirSum() throws Exception {
        assertThat(Calculator.add("1,2"), is(equalTo(3)));
    }

    @Test
    public void testThreeNumbersShouldReturnTheirSum() throws Exception {
        assertThat(Calculator.add("1,2,3"), is(equalTo(6)));
    }

    @Test
    public void testNewLinesBetweenNumbers() throws Exception {
        assertThat(Calculator.add("1\n2,3"), is(equalTo(6)));
    }

    @Test
    public void testWithSemicolonSeparator() throws Exception {
        assertThat(Calculator.add("//;\n1;2"), is(equalTo(3)));
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
        assertThat(Calculator.add("2,1001"), is(equalTo(2)));
    }

    @Test
    public void testWithBigDelimiter() throws Exception {
        assertThat(Calculator.add("//[***]\n1***2***3"), is(equalTo(6)));
    }

}