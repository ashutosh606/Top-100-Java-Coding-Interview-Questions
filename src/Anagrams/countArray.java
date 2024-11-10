package Anagrams;

public class countArray {
    public static void main(String[] args) {
        String word = "JavaProgramming";
        String anagram = "ProgrammingJava";


        if(word.length()!=anagram.length()) {
            System.out.println("false");
            return;
        }
        int[] count=new int[256];
        // Count characters in both strings
        for (int i = 0; i <word.length() ; i++) {
            count[word.charAt(i)]++;
            count[anagram.charAt(i)]--;
        }
        // Check if all counts are zero
        for (int i = 0; i < count.length ; i++) {
            if(count[i]!=0) {
                System.out.println("false");
                return;
            }
        }
        System.out.println("true");
    }
}
