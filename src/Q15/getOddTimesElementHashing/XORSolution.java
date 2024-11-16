package Q15.getOddTimesElementHashing;

public class XORSolution {
    public static void main(String[] args) {
        int[] arr = {20, 40, 50, 40, 50, 20, 30, 30, 50, 20, 40, 40, 20};

        int result = 0;
        for (int num : arr) {
            result ^= num;  // XOR operation
        }

        if (result != 0) {
            System.out.println(result);
        }
    }
}
/*
Key Properties of XOR (^) Operation:

XOR with 0: a ^ 0 = a
XOR with itself: a ^ a = 0
XOR is commutative: a ^ b = b ^ a
XOR is associative: (a ^ b) ^ c = a ^ (b ^ c)

 */