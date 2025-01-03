//Search in Rotated Sorted Array - (Microsoft, Google, Adobe, Amazon, Flipkart, Hike, MakeMyTrip, Paytm )

public class Arrays_Easy6 {
    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 0, 1, 2}; // Input rotated sorted array
        int target = 0; // Target element to search

        // Handle empty array edge case
        if (arr.length == 0) {
            System.out.println("Array is empty. No elements to search.");
            return;
        }

        int left = 0; // Left pointer
        int right = arr.length - 1; // Right pointer

        // Binary search loop
        while (left <= right) {
            int mid = left + ((right - left) / 2); // Avoid overflow for large arrays

            // Check if mid is the target
            if (arr[mid] == target) {
                System.out.println("Element found at index: " + mid);
                return;
            }

            // Determine if left half is sorted
            if (arr[left] <= arr[mid]) {
                // Check if target is in the left half
                if (target >= arr[left] && target < arr[mid]) {
                    right = mid - 1; // Narrow search to left half
                } else {
                    left = mid + 1; // Narrow search to right half
                }
            }
            else {
                // Right half is sorted
                // Check if target is in the right half
                if (target > arr[mid] && target <= arr[right]) {
                    left = mid + 1; // Narrow search to right half
                } else {
                    right = mid - 1; // Narrow search to left half
                }
            }
        }
        // If target is not found
        System.out.println("Element not found in the array.");
    }
}

