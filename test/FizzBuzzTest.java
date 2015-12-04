import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class FizzBuzzTest {
    private FizzBuzz fizzBuzz;

    @Test
    public void shouldReturnOneAsSecondElement() {
        fizzBuzz = new FizzBuzz(1, 100);
        List<Integer> testList = Arrays.asList(1);
        assertEquals(testList.get(0), fizzBuzz.list().get(0));
    }

    @Test
    public void shouldReturnTwoAsSecondElement() {
        fizzBuzz = new FizzBuzz(1, 100);
        List<Integer> testList = Arrays.asList(1, 2);
        assertEquals(testList.get(1), fizzBuzz.list().get(1));
    }
}