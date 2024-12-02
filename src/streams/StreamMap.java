package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMap {

    public static void main(String[] args) {
        List<String> myList = Arrays.asList("apple", "banana", "cherry", "date", "almond");
        List<String> upperCaseList = myList.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(upperCaseList);
    }

    // Output: [APPLE, BANANA, CHERRY, DATE, ALMOND]
}
