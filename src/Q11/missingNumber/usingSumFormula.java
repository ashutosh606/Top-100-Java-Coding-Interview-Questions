package Q11.missingNumber;

public class usingSumFormula {
    public static void main(String[] args) {

        int[] arr1={7,5,6,1,4,2};
        int n=arr1.length+1;

        int sum=n*(n+1)/2;

        int resSum=0;

        for (int i = 0; i < arr1.length; i++) {
            resSum+=arr1[i];
        }
        System.out.println("Missing number from array arr1: "+(sum-resSum));
    }
}
