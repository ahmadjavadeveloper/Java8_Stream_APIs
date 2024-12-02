package streams;

import java.util.Arrays;
import java.util.List;

public class StreamDropWhile
{
    /*
     * The dropWhile method returns a stream that contains elements of the original stream
     * after the first element that does not match the given predicate.
     * The dropWhile method is a short-circuiting operation.
     * It processes only the elements of the stream until the predicate returns false for an element.
     * The dropWhile method is an intermediate operation.
     */

    public static void main(String[] args) {
        sortedArray();
        unSortedArray();
    }

    public static void sortedArray(){
        List<String> myList = Arrays.asList("apple", "banana", "cherry", "date", "almond");
        myList.stream()
                .sorted()
                .dropWhile(s -> s.startsWith("a"))
                .forEach(System.out::println);
    }

    // Output: banana
    // Output: cherry
    // Output: date

    public static void unSortedArray() {
        List<String> myList = Arrays.asList("banana", "cherry", "apple", "date", "almond");
        myList.stream()
                .dropWhile(s -> s.startsWith("a"))
                .forEach(System.out::println);
    }

    // Output: banana
    // Output: cherry
    // Output: apple
    // Output: date
    // Output: almond
}
