
public class FizzBuzz {

    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        for (int i = 1; i < 101; i++){
            System.out.println(fizzBuzz.print(i));
        }
    }

    public String print(int number){
        if (number % (3*5) == 0) {
            return "FizzBuzz";
        }
        if (number % 3 == 0) {
            return "Fizz";
        }
        if (number % 5 == 0) {
            return "Buzz";
        }
        return Integer.toString(number);
    }
}
