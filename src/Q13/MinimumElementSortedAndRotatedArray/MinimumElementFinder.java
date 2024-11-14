package Q13.MinimumElementSortedAndRotatedArray;

public class MinimumElementFinder {
    public static void main(String[] args) {
        int[] arr = {16, 19, 21, 25, 3, 5, 8, 10};
        int minElement = findMinElement(arr);
        System.out.println("The minimum element is: " + minElement);
    }
    // Method to find the minimum element in a sorted and rotated array
    public static int findMinElement(int[] arr) {
        int low = 0;
        int high = arr.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] > arr[high]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return arr[low];
    }
}
