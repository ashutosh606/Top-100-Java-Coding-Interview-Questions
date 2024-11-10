package Anagrams;

public class UsingStringMethods {
    public static void main(String[] args) {
            String str1="jahaj";
            String  str2="aahjj";
        System.out.println("str1 and str2 are  anagram: "+isAnagram(str1,str2));
    }
    public static boolean isAnagram(String str1,String str2){
        if(str1.length()!=str2.length()) return false;

        for (int i = 0; i <str1.length() ; i++) {
            char c =str1.charAt(i);

            int index=str2.indexOf(c);

            if(index!=-1){
                str2=str2.substring(0,index) +str2.substring(index+1,str2.length());
            }else return false;
        }
        return str2.isEmpty();
    }
}
