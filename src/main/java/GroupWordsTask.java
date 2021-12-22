import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupWordsTask {
    public static Map<Character, Integer> groupWords(List<String> arr) {
        return arr
                .stream()
                .collect(Collectors.groupingBy(x -> x.charAt(0), HashMap::new, Collectors.toList()))
                .entrySet()
                .stream()
                .collect(Collectors.toMap(x -> x.getKey(), x -> GroupWordsTask.countt(x)));
    }
    public static Integer countt(Map.Entry<Character, List<String>> element) {
        int count = 0;
        for (String word : element.getValue()) {
            count += word.chars().filter(chr -> chr == element.getKey()).count();
        }
        return Integer.valueOf(count);
    }
}
