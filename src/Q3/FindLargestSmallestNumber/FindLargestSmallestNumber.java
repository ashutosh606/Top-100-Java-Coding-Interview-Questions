package Q3.FindLargestSmallestNumber;

public class FindLargestSmallestNumber {
    public static void main(String[] args) {
        int[] arr={12,56,76,89,100,343,21,234};

        int largest=arr[0];
        int smallest=arr[0];

        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>largest){
                largest=arr[i];
            }
            else if(arr[i]<smallest){
                smallest=arr[i];
            }
        }
        System.out.println("Smallest Number is :" +smallest);
        System.out.println("Largest Number is : "+largest);
    }
}
//Time Complexity of above program is o(n).
