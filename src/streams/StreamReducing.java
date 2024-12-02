package streams;

import java.util.Arrays;
import java.util.List;

public class StreamReducing {

    /*
     * Sum, min, max, average, and string concatenation are all special cases of reduction.
     * The reduce method combines a stream into a single object.
     * It takes a sequence of elements, combines them in some way (like summing, concatenating,
     * or finding the maximum), and produces a single result.
     * Note :: identity value in reduce method is the initial value of the reduction
     * and the default result if the stream is empty.
     */

    public static void main(String[] args) {
        sum(); // Output: 15
        concatenate(); // Output: HelloWorldFromStreamReduce
        max(); // Output: 5
        min(); // Output: 0
    }

    public static void sum() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers.stream()
                .reduce(0, Integer::sum);
        System.out.println("Sum is : " + sum);
    }

    public static void concatenate() {
        List<String> letters = Arrays.asList("Hello", "World", "From", "Stream", "Reduce");
        String result = letters.stream()
                .reduce("", String::concat);
        System.out.println(result);
    }

    public static void max() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int max = numbers.stream()
                .reduce(0, Integer::max);
        System.out.println("Maximum is : " + max);
    }

    public static void min() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int min = numbers.stream()
                .reduce(0, Integer::min);
        System.out.println("Minimum is : " + min);
    }
}
