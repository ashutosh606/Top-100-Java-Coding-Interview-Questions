package Q3.StringAllUniqueChar;

public class UsingAsciiValueOfChar {
    public static void main(String[] args) {
        System.out.println("Apple has all unique chars : "+ hasUniqueChars("apple"));
        System.out.println("index has all unique chars : "+ hasUniqueChars("index"));
    }
    public static  boolean hasUniqueChars(String word){
        boolean[] charMap=new boolean[128];

        for (int i = 0; i <word.length() ; i++) {
            char ch=word.charAt(i);
            if(charMap[ch]){
                return false;  // Character already encountered
            }
            charMap[ch]=true;  // Mark character as encountered
        }
        return true;  // All characters are unique
    }

}
