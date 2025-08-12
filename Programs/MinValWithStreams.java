import java.util.Arrays;

public class MinValWithStreams {
    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 5, 2, 6, 2, 8, 9, 12};
        int min = Arrays.stream(arr).min().getAsInt();
        System.out.println("Minimum value : " + min);
    }
}
