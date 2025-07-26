import java.util.Arrays;

public class MaxValWithStreams {
    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 5, 2, 6, 2, 8, 9, 12};
        int max = Arrays.stream(arr).max().getAsInt();
        System.out.println("Maximum value (stream): " + max);
    }
}
