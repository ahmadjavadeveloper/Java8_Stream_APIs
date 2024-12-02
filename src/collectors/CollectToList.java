package collectors;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectToList {

    /*
     * The collect method is a terminal operation that collects the elements of the stream
     * into a collection.
     * The toList method returns a List containing the elements of the stream.
     */

    public static void main(String[] args) {
        List<String> myList = Arrays.asList("apple", "banana", "cherry", "date");
        List<String> collectedList = myList.stream()
                .filter(s -> s.startsWith("a"))
                .collect(Collectors.toList());
        System.out.println(collectedList);
    }

    // Output: [apple]
}
