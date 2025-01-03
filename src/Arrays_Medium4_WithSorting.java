//Kth-Largest Element in an Array -( Amazon + Microsoft + Walmart + Adobe)
//leetcode 215.
import java.util.*;

//Solved using Sorting
public class Arrays_Medium4_WithSorting {
    public static void main(String[] args) {
        int[] arr = {3,2,1,5,6,4};
        int k = 2;

        Arrays.sort(arr);
        System.out.println(k + "th largest value is : " + arr[arr.length-k]);


    }
}
