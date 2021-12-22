
import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        System.out.println(MapTask.mapping(Arrays.asList("1", "2", "3")));
        System.out.println(FlattingTask.flattingStrings(Arrays.asList("abc", "cbd")));
        System.out.println(FizzBuzzTask.fizzBuzz(15));
        System.out.println(GroupWordsTask.groupWords(Arrays.asList("ABCA", "BCD", "ABC")));
    }
}
