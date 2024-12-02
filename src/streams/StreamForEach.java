package streams;

import java.util.List;

public class StreamForEach {

    public static void main(String[] args) {
        List<String> stream = List.of("A", "B", "C", "D", "E");
        stream.forEach(System.out::println);
    }
}
