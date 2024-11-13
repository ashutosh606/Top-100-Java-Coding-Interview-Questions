package Q12.SearchElementSortedAndRotatedArray;

public class usingBinarySearch {
    public static void main(String[] args) {
        int arr[] = {16, 19, 21, 25, 3, 5, 8, 10};
        int target = 5;
        int result = searchInRotatedSortedArray(arr, target);
        System.out.println("Index of element " + target + " : " + result);
    }

    public static int searchInRotatedSortedArray(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid; // Target found
            }

            // Check if the right half is sorted
            if (arr[mid] <= arr[high]) {
                // Check if the target is within the sorted right half
                if (target > arr[mid] && target <= arr[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
            // Else, the left half is sorted
            else {
                // Check if the target is within the sorted left half
                if (target >= arr[low] && target < arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
        }
        return -1; // Target not found
    }
}
