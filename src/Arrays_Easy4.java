//Contains Duplicate - Amazon
import java.util.*;

public class Arrays_Easy4 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 1};

        HashSet<Integer> set = new HashSet<>(); //Created a HashSet to store the elements of the Array.

        for(int i=0 ; i < arr.length ; i++){
            if(set.contains(arr[i])){ //If the element is already present in the HashSet, then the Array contains Duplicate Elements.
                System.out.println("Array contains Duplicate Elements");
                return;
            }
            set.add(arr[i]); //If the element is not present in the HashSet, then add the element to the HashSet.
        }
    }
}
