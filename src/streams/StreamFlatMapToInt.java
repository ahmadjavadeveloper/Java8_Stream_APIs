package streams;

public class StreamFlatMapToInt {
    /*
     * The flatMapToInt method returns an IntStream consisting of the results of replacing each element of this stream with the contents of a mapped stream produced by applying the provided mapping function to each element.
     * The flatMapToInt method is an intermediate operation.
     */
    public static void main(String[] args) {
        int[][] intArray = {{1, 2}, {3, 4}, {5, 6}};
        int[] newArray = java.util.Arrays.stream(intArray)
                .flatMapToInt(java.util.Arrays::stream)
                .toArray();
        System.out.println("5th index of new array is = " + newArray[5]);

        // Output: 5th index of new array is = 6

        int sum = java.util.Arrays.stream(intArray)
                .flatMapToInt(java.util.Arrays::stream)
                .sum();
        System.out.println("Sum = " +sum);

        // Output: Sum = 21
    }

    // Output: 21
}
