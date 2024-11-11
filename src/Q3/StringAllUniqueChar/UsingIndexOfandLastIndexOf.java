package Q3.StringAllUniqueChar;

public class UsingIndexOfandLastIndexOf {
    public static void main(String[] args) {
        System.out.println("Apple has all unique chars : "+ hasUniqueChars("apple"));
        System.out.println("index has all unique chars : "+ hasUniqueChars("index"));
    }
    public static  boolean hasUniqueChars(String  word){
        for (int i = 0; i <word.length() ; i++) {
            char c=word.charAt(i);
            if(word.indexOf(c)!=word.lastIndexOf(c)){
                return false;
            }
        }
        return true;
    }
}
