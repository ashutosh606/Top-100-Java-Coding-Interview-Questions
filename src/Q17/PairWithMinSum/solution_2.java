package Q17.PairWithMinSum;

import java.util.Arrays;

public class solution_2 {
    public static void main(String[] args) {
        int[] arr = {1, 3, -5, 7, 8, 20, -40, 6};
        int n=arr.length;
        int left=0, right=n-1;
        int minSum=Integer.MAX_VALUE;
        int minLeft=left,minRight=n-1;

        Arrays.sort(arr);
        while(left<right){
            int sum=arr[left]+arr[right];
           if(Math.abs(sum)<Math.abs(minSum)){
               minSum=sum;
               minLeft=left;
               minRight=right;
           }
           if(sum<0) left++;
           else right--;

        }
        System.out.println("the pair  is: "+arr[minLeft]+ " and "+arr[minRight]);
    }
}
