package streams;

import java.util.Arrays;
import java.util.List;

public class StreamTakeWhile
{
    /*
     * The takeWhile method returns a stream that contains elements of the original stream
     * until the first element that does not match the given predicate.
     * The takeWhile method is a short-circuiting operation.
     * It processes only the elements of the stream until the predicate returns false for an element.
     * The takeWhile method is an intermediate operation.
     */

    public static void main(String[] args) {
        List<String> myList = Arrays.asList("apple", "banana", "cherry", "date", "almond");
        myList.stream()
                .takeWhile(s -> s.startsWith("a"))
                .forEach(System.out::println);
    }

    // Output: apple
}
