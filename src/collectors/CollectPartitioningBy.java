package collectors;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectPartitioningBy {

    /*
     * The collect method is a terminal operation that collects the elements of the stream
     * into a collection.
     * The partitioningBy method returns a Map containing the elements of the stream partitioned
     * according to the given predicate.
     */

    public static void main(String[] args) {
        List<String> myList = Arrays.asList("apple", "banana", "cherry", "date");
        Map<Boolean, List<String>> partitionedByLength = myList.stream()
                .collect(Collectors.partitioningBy(s -> s.length() > 5));
        System.out.println(partitionedByLength);
    }

    // Output: {false=[apple, date], true=[banana, cherry]}
}
