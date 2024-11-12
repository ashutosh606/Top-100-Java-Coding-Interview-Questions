package Q11.missingNumber;

public class usingXOR {
    public static void main(String[] args) {
       // int[] arr1={7,5,6,1,4,2};
        int[] arr1={5,3,1,2};
        int n=arr1.length+1;

        int val=0;
        for (int i = 1; i <=n ; i++) {
            val^=i;
        }

        for (int i = 0; i < arr1.length ; i++) {
            val^=arr1[i];
        }
        System.out.println("Missing number from array arr1: "+val);
    }
}
