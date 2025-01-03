//Kth-Largest Element in an Array -( Amazon + Microsoft + Walmart + Adobe).
//leetcode 215
import java.util.*;

//Solved without Sorting (Using Min Heap)
public class Arrays_Medium4_WithoutSorting {
    public static void main(String[] args) {
        int[] nums = {3,2,1,5,6,4};
        int k = 2;

        // Create a min-heap (PriorityQueue) to store the k largest elements
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : nums) {
            minHeap.add(num);
            if (minHeap.size() > k) {
                minHeap.poll(); // Remove the smallest element
            }
        }

        // The root of the heap is the kth largest element
        System.out.println(k + "th largest value is : " + minHeap.peek());
    }
}
