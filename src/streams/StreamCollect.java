package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamCollect {

    /*
     * The collect method is a terminal operation that collects the elements of the stream
     * into a collection.
     * The toUnmodifiableSet method returns an unmodifiable Set containing the elements of the stream.
     */

    public static void main(String[] args) {
        List<String> myList = Arrays.asList("apple", "banana", "cherry", "date", "apple");
        Set<String> mySet = myList.stream()
                .collect(Collectors.toUnmodifiableSet());
        System.out.println(mySet);
    }

    // Output: [banana, cherry, date, apple]
}
