import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    private int start;
    private int end;

    public FizzBuzz(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public FizzBuzz(){

    }

    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        for (int i = 1; i < 101; i++){
            System.out.println(fizzBuzz.print(i));
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

    public String print(int number){
        if (number % 3 == 0) {
            return "Fizz";
        }

        if (number % 5 == 0) {
            return "Buzz";
        }

        return Integer.toString(number);
    }
}
