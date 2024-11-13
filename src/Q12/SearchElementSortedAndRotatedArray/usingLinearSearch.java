package Q12.SearchElementSortedAndRotatedArray;

public class usingLinearSearch {
    public static int linearSearch(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {16, 19, 21, 25, 3, 5, 8, 10};
        int target = 5;

        int index = linearSearch(arr, target);
        if (index == -1) {
            System.out.println("Element is not found in the array");
        } else {
            System.out.println("Element found at index: " + index);
        }
    }
}
