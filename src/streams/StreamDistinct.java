package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDistinct {

    /*
     * The distinct method returns a stream consisting of the distinct elements of the stream.
     * The elements are compared using their equals method.
     * The distinct method is a stateful operation.
     * It keeps track of the elements that have been encountered so far in a Set.
     * The Set is used to check for duplicates.
     * The distinct method is an intermediate operation.
     */

    public static void main(String[] args) {
        List<String> myList = Arrays.asList("apple", "banana", "apple", "cherry", "banana");
        List<String> distinctList = myList.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(distinctList);
    }

    // Output: [apple, banana, cherry]
}
