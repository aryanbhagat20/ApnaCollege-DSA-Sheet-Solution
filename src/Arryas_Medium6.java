import java.util.*;
//Product of Array Except Self - Microsoft + Facebook
//Leetcode - 238
//Prefix and Suffix Arrays approach - Space : O(n) and Time : O(n)

public class Arryas_Medium6 {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4} ;
        int n = nums.length;
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        int[] ans = new int[n];

        prefix[0] = 1;
        suffix[n - 1] = 1;

        // Fill prefix array
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] * nums[i - 1];
        }

        // Fill suffix array
        for (int i = n - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] * nums[i + 1];
        }

        // Calculate the result
        for (int i = 0; i < n; i++) {
            ans[i] = prefix[i] * suffix[i];
        }

        //Printing ans
        for(int i=0 ; i<n ; i++){
            System.out.println(ans[i]);
        }

    }
}
