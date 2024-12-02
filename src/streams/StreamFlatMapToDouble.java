package streams;

public class StreamFlatMapToDouble {
    /*
     * The flatMapToDouble method returns a DoubleStream consisting of the results of replacing each element of this stream with the contents of a mapped stream produced by applying the provided mapping function to each element.
     * The flatMapToDouble method is an intermediate operation.
     */
    public static void main(String[] args) {
        double[][] doubleArray = {{1.1, 2.2}, {3.3, 4.4}, {5.5, 6.6}};
        double sum = java.util.Arrays.stream(doubleArray)
                .flatMapToDouble(java.util.Arrays::stream)
                .sum();
        System.out.println(sum);
    }

    // Output: 23.1
}
