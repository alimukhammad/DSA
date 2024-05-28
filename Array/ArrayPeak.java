package Array;

public class ArrayPeak {
    public static void main(String[] args) {
        int[] arr = {5, 10, 20, 15};
        System.out.println(findPeak(arr));
    }

    public static int findPeak(int[] arr) {
        int low = 0;
        int high = arr.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] > arr[mid + 1]) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return arr[low];
    }
}