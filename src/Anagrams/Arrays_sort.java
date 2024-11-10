package Anagrams;

import java.util.Arrays;

public class Arrays_sort {
    public static void main(String[] args) {
        String word = "JavaProgramming";
        String anagram = "ProgrammingJava";

        char[] wordArr=word.toCharArray();
        char[] anagramArr=anagram.toCharArray();

        Arrays.sort(wordArr);
        Arrays.sort(anagramArr);

        if(Arrays.equals(wordArr,anagramArr)){
            System.out.println("isAnagram");
        }
        else System.out.println("isNot Anagram");
    }
}
