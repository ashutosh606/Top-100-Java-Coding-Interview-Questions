package Q17.PairWithMinSum;

public class solution_1 {
    public static void main(String[] args) {
        int[] arr = {1, 3, -5, 7, 8, 20, -40, 6};
       int n=arr.length;

       int minSum=Integer.MAX_VALUE;
       int first=0;
       int sec=0;

        for (int i = 0; i <n-1; i++) {
            for (int j = i+1; j <n ; j++) {
               int sum=arr[i]+arr[j];
                // Update if current sum is closer to zero
               if(Math.abs(sum)<Math.abs(minSum)){
                   minSum=sum;
                   first=arr[i];
                   sec=arr[j];
               }
            }
        }
        System.out.println("the min sum of "+first+" and "+sec+" pair : "+minSum);
    }
}
