package streams;

import java.util.List;

public class StreamMapToInt {
    /*
     * The mapToInt method returns an IntStream consisting of the results of applying the given function to the elements of the stream.
     * The mapToInt method is an intermediate operation.
     */
    public static void main(String[] args) {
        List<String> intArray = List.of("1", "2", "3", "4", "5");
        int sum = intArray.stream()
                .mapToInt(Integer::parseInt)
                .sum();
        System.out.println(sum);
    }

    // Output: 15
}
