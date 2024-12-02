package streams;

import java.util.List;

public class StreamMapToDouble {
    /*
     * The mapToDouble method returns a DoubleStream consisting of the results of applying the given function to the elements of the stream.
     * The mapToDouble method is an intermediate operation.
     */
    public static void main(String[] args) {
        List<String> doubleArray = List.of("1.1", "2.2", "3.3", "4.4", "5.5");
        double sum = doubleArray.stream()
                .mapToDouble(Double::parseDouble)
                .sum();
        System.out.println(sum);
    }

    // Output: 16.5
}
