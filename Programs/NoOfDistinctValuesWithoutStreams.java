import java.util.*;

public class NoOfDistinctValuesWithoutStreams {
    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 5, 2, 6, 2, 8, 9, 12};
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        System.out.println("Number of distinct values (traditional): " + set.size());
    }
}
