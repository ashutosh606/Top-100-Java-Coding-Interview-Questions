package LenghtOfString;

public class StringIndexOutOfBoundsException {
    public static void main(String[] args) {
        String str="This is hello world";

        System.out.println("The length of the string is :"+getLengthStr(str));
    }
    public static  int getLengthStr(String str){
        int i=0;
        try {
            // Infinite loop to increment `i` until we exceed the string bounds
            for (i = 0; ; i++) {
                str.charAt(i); // Access each character until an exception is thrown
            }
        } catch (IndexOutOfBoundsException e) {
            // When i exceeds the string length, an exception is caught
        }

        return i; // i now represents the length of the string
    }
}
