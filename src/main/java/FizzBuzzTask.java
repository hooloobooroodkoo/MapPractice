import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzzTask {
    public static List<Serializable> fizzBuzz(int n) {
        return IntStream.rangeClosed(1, n).mapToObj(x -> x % 3 == 0 ? (x % 5 ==0 ? "FizzBuzz" : "Fizz"): (x % 5 == 0 ? "Buzz": x)).collect(Collectors.toList());
    }
}
