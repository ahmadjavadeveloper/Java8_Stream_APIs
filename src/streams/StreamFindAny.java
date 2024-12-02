package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamFindAny
{
    /*
     * The findAny method returns an Optional instance that contains any element of the stream.
     * The findAny method is a short-circuiting operation.
     * It processes only the elements of the stream until any element is found.
     * The findAny method is a terminal operation.
     */

    public static void main(String[] args) {
        List<String> myList = Arrays.asList("apple", "banana", "cherry", "date");
        Optional<String> anyElement = myList.stream()
                .findAny();
        System.out.println(anyElement.get());
    }

    // Output: apple
}
