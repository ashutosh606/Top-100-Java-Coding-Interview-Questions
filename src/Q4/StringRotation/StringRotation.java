package Q4.StringRotation;

public class StringRotation {
    public static void main(String[] args) {
        System.out.println( "abcd and cdab are rotation of each other : " + isRotation("abcd", "cdab"));
        System.out.println( "abcd and abdc are rotation of each other : " + isRotation("abcd", "abdc"));
    }
    public  static  boolean isRotation(String str,String str2){
        String str1=str+str;

        if(str1.contains(str2)){
            return true;
        }
        return false;
    }
}
