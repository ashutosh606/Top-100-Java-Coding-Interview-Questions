package Q5.duplicateCharacters;

import java.util.HashMap;

public class StringFindDuplicate {
    public static void main(String[] args) {
        String str="Hello World";

        HashMap<Character,Integer> mp=new HashMap<>();

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(mp.containsKey(ch)){
                mp.put(ch,mp.get(ch)+1);
            }else{
                mp.put(ch,1);
            }
        }
        for(Character ch: mp.keySet()){
            if(mp.get(ch)>2){
                System.out.println("duplicate character : " + ch + " ==" + " count : " + mp.get(ch));
            }
        }
    }
}
