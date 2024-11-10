package ReverseString;

public class usingRecursion {
    public static void main(String[] args) {
        String str="JavaBasics";
        String reverse=recursive(str);
        System.out.println(reverse);
    }
    public static String recursive(String orig){
        if(orig.isEmpty()) return orig;
        int n=orig.length()-1;
        return orig.charAt(n) +recursive(orig.substring(0,n));
    }
}
