import java.util.* ;
//Valid Palindrome - Amazon Cisco D-E-Shaw Facebook FactSet Morgan Stanley Paytm Zoho Interview Qs
//Leetcode - 125
//Two Pointer Approach - Space : O(1) and Time : O(n)

public class Strings_Easy1 {
    public static boolean isPalindrome(String s){
        //Edge Case
        if(s.isEmpty()){
            return true ;
        }

        int left = 0 ;
        int right = s.length() - 1 ;
        while(left <= right){
            char currLeft = s.charAt(left);
            char currRight = s.charAt(right);
            if(!Character.isLetterOrDigit(currLeft)){
                left++ ;
            }
            else if(!Character.isLetterOrDigit(currRight)){
                right-- ;
            }
            else{
                if(Character.toLowerCase(currLeft) != Character.toLowerCase(currRight)){
                    return false ;
                }
                left++ ;
                right-- ;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama" ;
        System.out.println("Is the given string a palindrome? : " + isPalindrome(s)); //true
    }
}
