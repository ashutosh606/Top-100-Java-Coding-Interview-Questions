package Q16.MinimumPlatforms;

public class bruteForce {
    public static void main(String[] args) {
        double[] arrival = {1.00, 1.40, 1.50, 2.00, 2.15, 4.00};
        double[] departure = {1.10, 3.00, 2.20, 2.30, 3.15, 6.00};

        int platforms = findPlatformsBruteForce(arrival, departure);
        System.out.println("Minimum Number of Platforms Required: " + platforms);
    }
    public static int findPlatformsBruteForce(double[] arrival,double[] departure){
        int n=arrival.length;
        int maxPlatform=0;
// Check for overlapping trains
        for (int i = 0; i < n; i++) {
            int count=1;   // Include the current train
            for (int j = i+1; j < n; j++) {
                if(arrival[j]<=departure[i] && departure[j]>=arrival[i]){
                    count++;
                }
            }
            maxPlatform=Math.max(maxPlatform,count);
        }
        return maxPlatform;
    }
}
