package Q14.findSecondLargest;

public class Optimised {
    private static Integer findSecondLargest(int[] arr) {
        // Input validation
        if (arr == null || arr.length < 2) {
            return null;
        }

        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        // First pass to find the maximum
        for (int num : arr) {
            if (num > firstMax) {
                firstMax = num;
            }
        }

        // Second pass to find second maximum
        for (int num : arr) {
            if (num > secondMax && num < firstMax) {
                secondMax = num;
            }
        }

        // Check if second largest exists
        return (secondMax == Integer.MIN_VALUE) ? null : secondMax;
    }

    public static void main(String[] args) {
        int[] arr = {45, 53, 22, 89, 77, 98, 94};
        Integer result = findSecondLargest(arr);

        if (result != null) {
            System.out.println("The second largest number is: " + result);
        } else {
            System.out.println("No second largest element exists");
        }
    }
}