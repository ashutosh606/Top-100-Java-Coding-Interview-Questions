package Q16.MinimumPlatforms;

import java.util.Arrays;

public class usingSorting {
    public static void main(String[] args) {
//        double[] arrival = {1.00, 1.40, 1.50, 2.00, 2.15, 4.00};
//        double[] departure = {1.10, 3.00, 2.20, 2.30, 3.15, 6.00};

        int arr[] = {100, 140, 150, 200, 215, 400};
        int dep[] = {110, 300, 220, 230,315, 600};
        int platforms = findPlatforms(arr, dep);
        System.out.println("Minimum Number of Platforms Required: " + platforms);
    }
    public static int findPlatforms(int[] arr,int[] dep){
        Arrays.sort(arr);
        Arrays.sort(dep);
        int i=0, j=0;
        int platform_needed=0, maxPlatform=0;

        int n=arr.length;
        while(i< n && j < n){
            if(arr[i]<dep[j]){
                platform_needed++;
                i++;
               // maxPlatform=Math.max(maxPlatform,platform_needed);
                    if(platform_needed>maxPlatform){
                        maxPlatform=platform_needed;
                    }
            }else {
                platform_needed--;
                j++;
            }
        }
        return maxPlatform;
    }


}
