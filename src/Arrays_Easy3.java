//Maximum-SubArray - (Microsoft + Facebook).
/*The idea of Kadane’s algorithm is to traverse over the array from left to right and for each element,
find the maximum sum among all subarrays ending at that element.*/
//Solution Preview : https://www.geeksforgeeks.org/3d-kadanes-algorithm/?ref=asr1

import java.util.*;

public class Arrays_Easy3 {
    public static void main(String[] args) {
        int arr [] = {-2, -3, 4, -1, -2, 1, 5, -3};

        int maxSum = 0;
        int currentSum = 0;

        for(int i=0 ; i < arr.length ; i++){
            currentSum += arr[i];

            if(currentSum > maxSum){
                maxSum = currentSum;
            }
            if(currentSum < 0){
                currentSum = 0;
            }
        }
        System.out.println("Maximum Sum of SubArray is: " + maxSum);

    }
}
