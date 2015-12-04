import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {
    private FizzBuzz fizzBuzz;

    @Test
    public void shouldReturnOne() {
        fizzBuzz = new FizzBuzz();
        assertEquals(1, fizzBuzz.output());
    }

}