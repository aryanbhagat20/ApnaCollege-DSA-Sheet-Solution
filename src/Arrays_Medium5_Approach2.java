import java.util.*;
//Trapping Rain Water - Samsung Interview Question.
//leetcode 42
//Two Pointer Approach - Space : O(1) and Time : O(n)

public interface Arrays_Medium5_Approach2 {
    public static void main(String[] args) {
        int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        int total = 0; // Initialize total water trapped
        int l = 0, r = height.length - 1; // Two pointers, left (l) and right (r)
        int lmax = 0, rmax = height[r]; // Initialize max heights for left and right

        while (l < r) {
            if (height[l] <= height[r]) {
                // If left height is less than or equal to right height
                if (height[l] < lmax) {
                    total += lmax - height[l]; // Water trapped on the left
                } else {
                    lmax = height[l]; // Update left max height
                }
                l++; // Move left pointer
            } else {
                // If right height is less than left height
                if (height[r] < rmax) {
                    total += rmax - height[r]; // Water trapped on the right
                } else {
                    rmax = height[r]; // Update right max height
                }
                r--; // Move right pointer
            }
        }
        System.out.println(total);; // Return total water trapped
    }
}
