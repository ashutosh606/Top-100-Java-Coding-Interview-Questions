package Q6.firstNonReapeatedChar;
// best possible time complexity for this problem.
public class usingIndexOf {
    public static void main(String[] args) {

        System.out.println("First non repeated character for String is : "+getNonRepeatedChar("easiest"));

    }
    public static Character getNonRepeatedChar(String word){

        for (int i = 0; i <word.length() ; i++) {
            char ch=word.charAt(i);
            if(word.indexOf(ch)==word.lastIndexOf(ch)){
                return ch;
            }
        }
        return null;
    }

}
