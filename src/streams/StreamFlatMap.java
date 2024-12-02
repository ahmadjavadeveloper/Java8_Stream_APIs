package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFlatMap {

    /*
     * The flatMap method transforms each element of the stream into a stream of other objects.
     * So each object will be transformed into zero or more other objects backed by streams.
     * The flatMap method then combines all the streams into a single stream.
     */

    public static void main(String[] args) {
        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("a", "b", "c"),
                Arrays.asList("d", "e", "f"),
                Arrays.asList("g", "h", "i")
        );
        List<String> flatList = listOfLists.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
        System.out.println(flatList);

        // Output: [a, b, c, d, e, f, g, h, i]

        List<List<Integer>> listOfIntegers = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9)
        );
        List<Integer> flatListOfIntegers = listOfIntegers.stream()
                .flatMap(List::stream)
                .toList();
        System.out.println(flatListOfIntegers);

        // Output: [1, 2, 3, 4, 5, 6, 7, 8, 9]
    }
}
