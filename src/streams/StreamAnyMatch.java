package streams;

import java.util.Arrays;
import java.util.List;

public class StreamAnyMatch {

    /*
     * The anyMatch method returns true if any element of the stream matches the given predicate.
     * The anyMatch method is a short-circuiting operation.
     * It processes only the elements of the stream until the predicate returns true for an element.
     * The anyMatch method is a terminal operation.
     */

    public static void main(String[] args) {
        List<String> myList = Arrays.asList("apple", "banana", "cherry", "date");
        boolean anyMatch = myList.stream()
                .anyMatch(s -> s.startsWith("a"));
        System.out.println(anyMatch);
    }

    // Output: true
}
