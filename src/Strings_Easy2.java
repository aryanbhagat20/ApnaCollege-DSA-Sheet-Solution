import java.util.* ;
//Valid Anagram -  Nagarro Media.net Directi Google Adobe Flipkart
//Leetcode - 242
//Time : O(n) and Space : O(1)


public class Strings_Easy2 {
    public static boolean isAnagram(String s , String t){
        if(s.length() != t.length()){
            return false ;
        }
        int[] count = new int[26] ;
        for(int i = 0 ; i < s.length() ; i++){
            count[s.charAt(i) - 'a']++ ;
            count[t.charAt(i) - 'a']-- ;
        }
        for(int i = 0 ; i < 26 ; i++){
            if(count[i] != 0){
                return false ;
            }
        }
        return true ;
    }
    public static void main (String[] args) {
        String s = "anagram" ;
        String t = "nagaram" ;
        System.out.println("Are the given strings anagrams? : " + isAnagram(s, t)); //true

    }
}
