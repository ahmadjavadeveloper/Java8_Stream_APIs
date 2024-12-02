package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamFindFirst
{
    /*
     * The findFirst method returns an Optional instance that contains the first element of the stream.
     * The findFirst method is a short-circuiting operation.
     * It processes only the elements of the stream until the first element is found.
     * The findFirst method is a terminal operation.
     */

    public static void main(String[] args) {
        List<String> myList = Arrays.asList("apple", "banana", "cherry", "date");
        Optional<String> firstElement = myList.stream()
                .findFirst();
        System.out.println(firstElement.get());
    }

    // Output: apple
}
