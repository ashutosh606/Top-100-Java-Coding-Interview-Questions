package Q1_ReverseString;

public class Using_for_loop {
    public static void main(String[] args) {
        String str = "JAVABasic";
        String reverse = "";
        for (int i =str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }
        System.out.println("Reverse of java2blog is: " + reverse);
    }
}
