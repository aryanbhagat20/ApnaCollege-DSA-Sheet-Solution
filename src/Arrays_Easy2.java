//Reverse the Array - (Infosys, Moonfrog Labs).
import java.util.*;

public class Arrays_Easy2 {
    public static void main(String[] args) {
       int arr[] = {1, 4, 3, 2, 6, 5};

       int length = arr.length;
       int left = 0;
       int right = length - 1 ;

       while(left<right){
           int temp = arr[left];
           arr[left] = arr[right];
           arr[right] = temp;
           left++;
           right--;
       }

        System.out.println("Reversed Array is: ");
       for(int i=0 ; i < length ; i++){
           System.out.print(arr[i] + " ");
       }

    }
}
