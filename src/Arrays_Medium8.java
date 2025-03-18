import java.util.* ;
//Find Minimum in Rotated Sorted Array -  Adobe, Amazon, Microsoft, Morgan Stanley, Samsung, Snapdeal, Times Internet
//Leetcode - 153
//Binary Search - Space : O(1) and Time : O(log n)

public class Arrays_Medium8 {
    public static void main(String[] args) {
        int []nums = {3,4,5,1,2};
        int left = 0, right = nums.length - 1;

        while(left < right) {
            int mid = left + (right - left) / 2;

            if(nums[mid] < nums[right]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        System.out.println(nums[left]);
    }
}
