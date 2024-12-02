package collectors;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectToSet {

    /*
     * The collect method is a terminal operation that collects the elements of the stream
     * into a collection.
     * The toSet method returns a Set containing the elements of the stream.
     */

    public static void main(String[] args) {
        List<String> myList = Arrays.asList("apple", "banana", "cherry", "date", "apple");
        Set<String> collectedSet = myList.stream()
                .filter(s -> s.endsWith("a"))
                .collect(Collectors.toSet());
        System.out.println(collectedSet);
    }

    // Output: [banana]
}
