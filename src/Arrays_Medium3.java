//Repeat and Missing Number Array - (Amazon).
//leetcode Problem - 645 and interviewbit.
import java.util.*;


public class Arrays_Medium3 {
    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 5, 3}; //1, 2, 3, 3, 5
        int n = nums.length; // Length of the array
        int actual_sum = n * (n + 1) / 2; // Calculate the sum of numbers from 1 to n using the formula n*(n+1)/2
        int array_sum = 0; // Sum of all numbers in the input array
        int unique_sum = 0; // Sum of unique numbers in the input array (eliminating duplicates)

        Set<Integer> uniqueNumbers = new HashSet<>(); // A HashSet to store unique numbers from the input array

        // Calculate the total sum of the array (including duplicates)
        for (int num : nums) {
            array_sum += num;
        }

        // Populate the HashSet with unique numbers
        for (int num : nums) {
            uniqueNumbers.add(num); // Only unique numbers are stored in the HashSet
        }

        // Calculate the sum of unique numbers from the HashSet
        for (int num : uniqueNumbers) {
            unique_sum += num;
        }

        // Calculate the missing number using the difference between the expected sum and the unique sum
        int missing = actual_sum - unique_sum;

        // Calculate the duplicate number using the difference between the total sum and the unique sum
        int duplicate = array_sum - unique_sum;

        System.out.println("Missing Number: " + missing);
        System.out.println("Duplicate Number: " + duplicate);

    }
}
