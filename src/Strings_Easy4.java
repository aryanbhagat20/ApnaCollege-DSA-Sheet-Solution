import java.util.* ;
//Remove Consecutive Characters - Samsung + Adobe
//GFG
//Time : O(n) and Space : O(n)

public class Strings_Easy4 {
    public static String removeConsecutiveCharacter(String s){
        StringBuilder sb = new StringBuilder();

        for(int i=0 ; i < s.length() ; i++){
            sb.append(s.charAt(i));

            while(i+1 < s.length() && s.charAt(i+1) == s.charAt(i)){
                i++ ;
            }
        }

        return sb.toString();
    }
    public static void main(String[] args) {
        String s = "abcddcba";
        System.out.println("The string after removing consecutive characters is : " + removeConsecutiveCharacter(s));
    }
}
