package Q5.LenghtOfString;

public class toCharArray {
    public static void main(String[] args) {
        String str="This is hello world";

        System.out.println("The length of the string is :"+getLength(str));
    }
    public static  int getLength(String str){
        int length=0;
        char[] arr=str.toCharArray();

        for(char ch : arr){
            length++;
        }
        return length;
    }
}
