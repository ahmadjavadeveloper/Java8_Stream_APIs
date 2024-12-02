package collectors;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class CollectSummarizing {

    /*
     * The summarizingInt method returns an IntSummaryStatistics object that contains
     * the count, sum, min, average, and max of the elements of the stream.
     */

    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(1, 2, 3, 4, 5);
        IntSummaryStatistics stats = myList.stream()
                .collect(Collectors.summarizingInt(Integer::intValue));
        System.out.println(stats);
    }

    // Output: IntSummaryStatistics{count=5, sum=15, min=1, average=3.000000, max=5}
}
