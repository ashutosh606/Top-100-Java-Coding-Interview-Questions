package Q6.firstNonReapeatedChar;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class usingHashMap {
    public static void main(String[] args) {
        String str="analogy";

        HashMap<Character,Integer> mp=new LinkedHashMap<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }
        for(Map.Entry<Character,Integer> e :mp.entrySet()){
            if(e.getValue()==1){
                System.out.println(e.getKey());
                break;

            }
        }

//        //m1
//mp.put(str.charAt(0),1);
//        for(int i=1;i<str.length();i++){
//            char ch=str.charAt(i);
//            if(!mp.containsKey(ch)){
//                System.out.println(ch);
//                break;
//            }
//            mp.put(ch,1);
//        }
    }
}
