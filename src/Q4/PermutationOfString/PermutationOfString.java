package Q4.PermutationOfString;

import java.util.HashSet;
import java.util.Set;

public class PermutationOfString {
    public static void main(String[] args) {
        Set<String> permutation= permutationOfString("ABC");
        System.out.println("the permutation are :");
        for(String per : permutation){
            System.out.println(per);
        }
    }
    public static  Set<String> permutationOfString(String str){
            Set<String> set=new HashSet<>();
            // Base case: if the string is empty, add an empty string and return
            if(str.isEmpty()){
                set.add("");
                return set;
            }

            char firstChar=str.charAt(0);
            String remaining=str.substring(1);
            Set<String> remainingPer= permutationOfString(remaining);

        // Insert the first character at every possible position for each permutation

        for(String permuted : remainingPer){
            for (int i = 0; i <=permuted.length() ; i++) {
                String permutation=permuted.substring(0,i) + firstChar+ permuted.substring(i);
                set.add(permutation);
            }
        }
return set;
    }

}
