import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FizzBuzz {

    private int start;
    private int end;

    public FizzBuzz(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public List<Integer> list() {
        List<Integer> fizzBuzzList = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            fizzBuzzList.add(i);
        }
        return fizzBuzzList;
    }
}
