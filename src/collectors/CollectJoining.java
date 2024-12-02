package collectors;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectJoining {

    /*
     * The collect method is a terminal operation that collects the elements of the stream
     * into a collection.
     * The joining method returns a Collector that concatenates the input elements into a String.
     */

    public static void main(String[] args) {
        List<String> myList = Arrays.asList("apple", "banana", "cherry", "date");
        String joinedString = myList.stream()
                .collect(Collectors.joining(", "));
        System.out.println(joinedString);
    }
}
