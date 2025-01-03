//Maximum and Minimum Element in an Array - (Amazon, Cisco, Hike, Microsoft, Snapdeal, Google, Adobe)
import java.util.*;

public class Arrays_Easy1 {
    public static void main(String[] args) {
        int arr [] = {3, 5, 2, 1, 6, 4, 7, 8, 9, 10};

        if(arr.length == 0){ //Handle the edge case if the Array is Empty.
            System.out.println("Array is Empty");
            return;
        }

        int length = arr.length;
        int max = arr[0];
        int min = arr [0];

        for(int i=0 ; i < length ; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Maximum Element in the Array is: " + max);
        System.out.println("Minimum Element in the Array is: " + min);
    }
}
