import java.util.*;
import java.util.stream.*;

public class DistinctValuesWithStream {
    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 5, 2, 6, 2, 8, 9, 12};
        List<Integer> distinct = Arrays.stream(arr)
                                       .distinct()
                                       .boxed()
                                       .collect(Collectors.toList());
        System.out.println("Distinct values (stream): " + distinct);
    }
}
