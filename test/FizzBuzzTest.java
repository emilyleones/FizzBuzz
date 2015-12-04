import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class FizzBuzzTest {
    private FizzBuzz fizzBuzz;

    @Before
    public void setUp() {
        fizzBuzz = new FizzBuzz(1, 100);
    }

    @Test
    public void shouldReturnOneAsSecondElement() {
        assertEquals("1", fizzBuzz.list().get(0));
    }

    @Test
    public void shouldReturnTwoAsSecondElement() {
        assertEquals("2", fizzBuzz.list().get(1));
    }

    @Test
    public void shouldReturnFizzAsThirdElement() {
        assertEquals("Fizz", fizzBuzz.list().get(2));
    }
}