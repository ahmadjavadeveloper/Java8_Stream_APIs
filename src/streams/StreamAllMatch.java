package streams;

import java.util.Arrays;
import java.util.List;

public class StreamAllMatch
{
    /*
     * The allMatch method returns true if all elements of the stream match the given predicate.
     * The allMatch method is a short-circuiting operation.
     * It processes only the elements of the stream until the predicate returns false for an element.
     * The allMatch method is a terminal operation.
     */

    public static void main(String[] args) {
        List<String> myList = Arrays.asList("apple", "banana", "cherry", "date");
        boolean allMatch = myList.stream()
                .allMatch(s -> s.startsWith("a"));
        System.out.println(allMatch);
    }

    // Output: false
}
