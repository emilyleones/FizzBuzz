import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    private int start;
    private int end;

    public FizzBuzz(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz(1, 100);
        for (String element : fizzBuzz.list()) {
            System.out.println(element);
        }
    }

    public List<String> list() {
        List<String> fizzBuzzList = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            if (i % (3*5) == 0) {
                fizzBuzzList.add("FizzBuzz");
            } else if (i % 3 == 0) {
                fizzBuzzList.add("Fizz");
            } else if (i % 5 == 0) {
                fizzBuzzList.add("Buzz");
            } else {
                fizzBuzzList.add(String.valueOf(i));
            }
        }
        return fizzBuzzList;
    }
}
