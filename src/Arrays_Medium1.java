//Next Permutation - (Uber + Goldman Sachs + Adobe Interview).
//Leetcode Problem - 31
import java.util.*;

public class Arrays_Medium1 {
    public static void nextPermutation(int[] arr) {
        int n = arr.length;

        //Find the pivot element/index
        int pivot = -1;
        for(int i = n-2; i >= 0; i--) {
            if(arr[i] < arr[i+1]) {
                pivot = i;
                break;
            }
        }

        //if Pivot is not found, then reverse the array
        if(pivot == -1) {
            reverse(arr, 0, n-1);
            return;
        }

        //Find the element which is just greater than pivot element
        for(int i = n-1; i > pivot; i--) {
            if(arr[i] > arr[pivot]) {
                swap(arr, i, pivot);
                break;
            }
        }

        //Reverse the array from pivot+1 to n-1
        reverse(arr, pivot+1, n-1);
    }

    //Function to reverse the array
    public static void reverse(int[] arr, int start, int end) {
        while(start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    //Function to swap the elements
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        nextPermutation(arr);
        System.out.println("Next Permutation is : " + Arrays.toString(arr));
    }
}
