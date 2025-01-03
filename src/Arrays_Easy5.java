//Chocolate Distribution Problem - Amazon
//Solve it using Sliding Window Technique.
import java.util.*;

public class Arrays_Easy5 {
    public static void main(String[] args) {
        int arr[] = {3, 4, 1, 9, 56, 7, 9, 12};
        int m = 5; //Number of Students

        Arrays.sort(arr);//Sort the Array in Ascending Order.

        int n = arr.length;
        int minDiff = Integer.MAX_VALUE;//Initialize the minimum difference with the maximum value of Integer.

        for(int i=0 ; i+m-1 < n ; i++){
            int diff = arr[i+m-1] - arr[i]; //// calculate difference of current window

            // if current difference is smaller
            // then update the minimum difference
            if(diff < minDiff){
                minDiff = diff;
            }
        }
        System.out.println("Minimum Difference between the Maximum and Minimum Number of Chocolates distributed to the Students is: " + minDiff);

    }
}
