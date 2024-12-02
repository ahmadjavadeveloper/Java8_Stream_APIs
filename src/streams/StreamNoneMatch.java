package streams;

import java.util.Arrays;
import java.util.List;

public class StreamNoneMatch
{
    /*
     * The noneMatch method returns true if no element of the stream matches the given predicate.
     * The noneMatch method is a short-circuiting operation.
     * It processes only the elements of the stream until the predicate returns true for an element.
     * The noneMatch method is a terminal operation.
     */

    public static void main(String[] args) {
        List<String> myList = Arrays.asList("apple", "banana", "cherry", "date");
        boolean noneMatch = myList.stream()
                .noneMatch(s -> s.startsWith("z"));
        System.out.println(noneMatch);
    }

    // Output: true
}
