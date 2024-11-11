package Q3.StringAllUniqueChar;

import java.util.HashSet;

public class UsingHashSet {
    public static void main(String[] args) {
        System.out.println("Apple has all unique chars : "+ hasAllUniqueChars("apple"));
        System.out.println("index has all unique chars : "+ hasAllUniqueChars("index"));
    }
    public  static boolean hasAllUniqueChars(String word){
        HashSet<Character> set=new HashSet<>();

        for (int i = 0; i <word.length() ; i++) {
            if(set.contains(word.charAt(i))) return false;
            set.add(word.charAt(i));
        }
        return true;
    }
}
