import java.util.*;
//Trapping Rain Water - Samsung Interview Question.
//leetcode 42
//Prefix max and suffix max approach - Space : O(n) and Time : O(n) (Naive Approach)

public class Arrays_Medium5_Approach1 {

    public static void main(String[] args) {
        int height[] = {0,1,0,2,1,0,1,3,2,1,2,1} ;
        int n = height.length ;
        int left [] = new int[n];
        int right [] = new int[n];

        left[0] = height[0];
        for(int i=1 ; i<n ; i++){
            left[i] = Math.max(left[i-1],height[i]);
        }

        right[n-1] = height[n-1];
        for(int i=n-2 ; i>=0 ; i--){
            right[i] = Math.max(right[i+1],height[i]);
        }

        int ans = 0;
        for(int i=0 ; i<n ; i++){
            ans += (Math.min(left[i],right[i])-height[i]);
        }

        System.out.println(ans);
    }
}



