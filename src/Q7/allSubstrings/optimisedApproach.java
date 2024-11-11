package Q7.allSubstrings;

public class optimisedApproach {
    public static void printAllSubstring(String str){
        System.out.println("All substring \""+str+"\"are :");

        for (int i = 1; i <=str.length() ; i++) {
            for (int j = 0; j <=str.length()-i ; j++) {
                System.out.println(str.substring(j,j+i));
            }
        }
    }
    public static void main(String[] args) {
        String str="abba";
        printAllSubstring(str);
    }
}
//This optimized solution has a time complexity of O(n^2),