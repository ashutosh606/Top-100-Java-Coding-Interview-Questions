package Q15.getOddTimesElementHashing;

public class bruteForce {
    public static void main(String[] args) {
        int[] arr = {20, 40, 50, 40, 50, 20, 30, 30, 50, 20, 40, 40, 20};

        int n=arr.length;

        for (int i = 0; i <n ; i++) {
            int c=0;
            for (int j = 0; j <n ; j++) {
                if(arr[i]==arr[j]) c++;
            }
            if(c%2!=0) System.out.println(arr[i]);
        }

    }
}
