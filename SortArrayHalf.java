import java.util.Arrays;
import java.util.Collections;

public class SortArrayHalf {
    public static void main(String[] args) {
        // Example input array
        int[] arr = {8, 3, 1, 7, 6, 4, 2, 5};

        // Function call
        sortHalfArray(arr);

        // Print the result
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void sortHalfArray(int[] arr) {
        int n = arr.length;
        int mid = n / 2;

        // First half: Sort in ascending order
        Arrays.sort(arr, 0, mid);

        // Second half: Sort in descending order
        Integer[] secondHalf = new Integer[n - mid];
        for (int i = mid; i < n; i++) {
            secondHalf[i - mid] = arr[i];
        }
        Arrays.sort(secondHalf, Collections.reverseOrder());

        // Combine both parts back into the original array
        for (int i = mid; i < n; i++) {
            arr[i] = secondHalf[i - mid];
        }
    }
}

