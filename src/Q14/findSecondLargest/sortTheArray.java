package Q14.findSecondLargest;

import java.util.Arrays;

public class sortTheArray {

    private static int findSecondLargest(int[] array) {
        if (array == null || array.length < 2) {
            return -1;
        }

        Arrays.sort(array);
        for (int i = array.length - 2; i >= 0; i--) {
            if (array[i] != array[array.length - 1]) {
                return array[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {45, 53, 22, 89, 77, 98, 94};
        int result = findSecondLargest(arr);
        System.out.println("The second largest number is: " + result);
    }
}
