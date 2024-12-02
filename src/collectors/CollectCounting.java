package collectors;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectCounting {

    /*
     * The collect method is a terminal operation that collects the elements of the stream
     * into a collection.
     * The counting method returns the count of elements in the stream.
     */

    public static void main(String[] args) {
        List<String> myList = Arrays.asList("apple", "banana", "cherry", "date");
        long count = myList.stream()
                .collect(Collectors.counting());
        System.out.println(count);
    }

    // Output: 4
}
