package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSkip {

    /*
     * The skip method returns a stream consisting of the remaining elements of the stream
     * after discarding the specified number of elements from start.
     * The skip method is a stateful operation.
     * It keeps track of the number of elements that have been discarded so far.
     * The skip method is an intermediate operation.
     */

    public static void main(String[] args) {
        List<String> myList = Arrays.asList("apple", "banana", "cherry", "date");
        List<String> skippedList = myList.stream()
                .skip(2)
                .collect(Collectors.toList());
        System.out.println(skippedList);
    }

    // Output: [cherry, date]
}
