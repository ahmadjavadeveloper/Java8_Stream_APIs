package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSorted {

    public static void main(String[] args) {
        List<String> myList = Arrays.asList("apple", "date", "elderberry", "banana", "fig", "cherry");
        List<String> sortedList = myList.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(sortedList);
    }

    // Output: [apple, banana, cherry, date, elderberry, fig]
}
