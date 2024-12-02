package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilter {

    public static void main(String[] args) {
        List<String> myList = Arrays.asList("apple", "banana", "cherry", "date", "almond");
        List<String> filteredList = myList.stream()
                .filter(s -> s.startsWith("a"))
                .collect(Collectors.toList());
        System.out.println(filteredList);
    }

    // Output: [apple, almond]
}
