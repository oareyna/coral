import java.util.ArrayList;
import java.util.List;

class Main {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        int c = 15;
        int d = 21;
        List<Integer> numbers = new ArrayList<>();

        numbers.add(a);
        numbers.add(b);
        numbers.add(c);
        numbers.add(d);
        for (int s : numbers) {

    
        if (s % 15 == 0) {
            System.out.println("FizzBuzz");
        }
        else if (s % 3 == 0) {
            System.out.println("Fizz");
        }
        else if (s % 5 == 0) {
            System.out.println("Buzz");
        }
        else {
            System.out.println("No fizz or buzz!!! :(");
        }
        }
    }
}
