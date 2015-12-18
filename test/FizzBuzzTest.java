import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FizzBuzzTest {
    private FizzBuzz fizzbuzz;

    @Before
    public void setUp() {
        fizzbuzz = new FizzBuzz();
    }

    @Test
    public void shouldReturnNumberThatIsPassedIn() {
        String expectedOutput = "1";
        int ordinaryNumber = 1;

        String actualOutput = fizzbuzz.print(ordinaryNumber);

        assertThat(actualOutput, is(expectedOutput));
    }

    @Test
    public void shouldReturnFizzWhenNumberPassedInIsAMultipleOfThree() {
        String expectedOutput = "Fizz";
        int multipleOfThree = 9;

        String actualOutput = fizzbuzz.print(multipleOfThree);

        assertThat(actualOutput, is(expectedOutput));
    }

    @Test
    public void shouldReturnBuzzWhenNumberPassedInIsAMultipleOfFive() {
        String expectedOutput = "Buzz";
        int multipleOfFive = 10;

        String actualOutput = fizzbuzz.print(multipleOfFive);

        assertThat(actualOutput, is(expectedOutput));
    }

    @Test
    public void shouldReturnFizzBuzzWhenNumberPassedInIsAMultipleOfThreeAndFive() {
        String expectedOutput = "FizzBuzz";
        int multipleOfThreeAndFive = 15;

        String actualOutput = fizzbuzz.print((multipleOfThreeAndFive));

        assertThat(actualOutput, is(expectedOutput));
    }
}