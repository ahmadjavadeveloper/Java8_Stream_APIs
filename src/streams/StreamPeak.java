package streams;

import java.util.Arrays;
import java.util.List;

public class StreamPeak {

    /*
     * The peek method is an intermediate operation that allows us to perform an action on each element of the stream.
     * The action is performed only if the stream is consumed by a terminal operation.
     * The peek method does not consume the stream.
     * This method exists mainly to support debugging,
     * where you want to see the elements as they flow past a certain point in a pipeline.
     */

    public static void main(String[] args) {
        List<String> myList = Arrays.asList("apple", "banana", "cherry", "date", "almond");
        List<String> filteredList = myList.stream()
                .filter(s -> s.startsWith("a"))
                .peek(e -> System.out.println("Filtered value: " + e))
                .map(String::toUpperCase)
                .peek(e -> System.out.println("Mapped value: " + e))
                .toList();
        System.out.println(filteredList);
    }

    // Output:
    // Filtered value: apple
    // Mapped value: APPLE
    // Filtered value: almond
    // Mapped value: ALMOND
    // [APPLE, ALMOND]
}
