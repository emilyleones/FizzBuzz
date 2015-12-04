import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    private int start;
    private int end;

    public FizzBuzz(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public List<String> list() {
        List<String> fizzBuzzList = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            if (i % 3 == 0) {
                fizzBuzzList.add("Fizz");
            }
            fizzBuzzList.add(String.valueOf(i));
        }
        return fizzBuzzList;
    }
}
