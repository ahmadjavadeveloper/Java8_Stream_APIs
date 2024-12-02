package collectors;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectGroupingBy {

    /*
     * The collect method is a terminal operation that collects the elements of the stream
     * into a collection.
     * The groupingBy method returns a Collector that groups the elements of the stream
     * by a classifier function.
     */

    public static void main(String[] args) {
        List<String> myList = Arrays.asList("apple", "banana", "cherry", "date", "apricot");
        Map<Character, List<String>> groupedByFirstLetter = myList.stream()
                .collect(Collectors.groupingBy(s -> s.charAt(0)));
        System.out.println(groupedByFirstLetter);
    }

    // Output: {a=[apple, apricot], b=[banana], c=[cherry], d=[date]}
}
