package collectors;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectToMap {

    /*
     * The collect method is a terminal operation that collects the elements of the stream
     * into a collection.
     * The toMap method returns a Map containing the elements of the stream.
     * The first argument is the key mapper function and the second argument is the value mapper function.
     */

    public static void main(String[] args) {
        List<String> myList = Arrays.asList("apple", "banana", "cherry", "date");
        Map<String, Integer> collectedMap = myList.stream()
                .collect(Collectors.toMap(s -> s, String::length));
        System.out.println(collectedMap);
    }

    // Output: {banana=6, cherry=6, date=4, apple=5}
}
