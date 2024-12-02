package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamLimit {

    /*
     * The limit method returns a stream consisting of the elements of the stream
     * that are limited to the specified maximum size.
     * The limit method is a stateful operation.
     * It keeps track of the number of elements that have been encountered so far.
     * The limit method is a short-circuiting operation.
     * It stops processing elements once the limit is reached.
     * The limit method is an intermediate operation.
     */

    public static void main(String[] args) {
        List<String> myList = Arrays.asList("apple", "banana", "cherry", "date");
        List<String> limitedList = myList.stream()
                .limit(2)
                .collect(Collectors.toList());
        System.out.println(limitedList);
    }

    // Output: [apple, banana]
}
