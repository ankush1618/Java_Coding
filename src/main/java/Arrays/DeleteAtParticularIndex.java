package Arrays;

import java.util.Arrays;

public class DeleteAtParticularIndex {

    /*
       ===================== ALGORITHM =====================
       1. Check if the given index is valid (within bounds).
       2. Create a new array of size (N-1), since one element will be removed.
       3. Copy all elements from the original array except the one at the given index:
          - Iterate over the original array.
          - If the current index is the deletion index, skip it.
          - Otherwise, copy the element to the new array.
       4. Return the new array after deletion.
       ====================================================

       Time Complexity: O(N) → As we iterate through the array once.
       Space Complexity: O(N) → A new array of size (N-1) is created.
    */

    // Function to delete an element at a particular index
    public static int[] deleteAtParticularIndex(int arr[], int index) {
        int n = arr.length; // Get the length of the array
        // Step 1: Check if the index is valid
        if (index < 0 || index >= n) {
            System.out.println("Invalid index"); // Print error if index is out of range
            return arr;  // Return original array as is
        }
        System.out.println("Before Deletion: " + Arrays.toString(arr)); // Print original array
        // Step 2: Create a new array with one less element
        int[] newArr = new int[n - 1];
        // Step 3: Copy elements except the one at the given index
        int count=0;
        for (int i = 0; i < n; i++) {
            if (i == index) continue;  // Skip the element at the given index
            newArr[count++] = arr[i];  // Copy elements to new array
        }
        System.out.println("After Deletion: " + Arrays.toString(newArr)); // Print updated array
        return newArr;  // Return the new array
    }

    public static void main(String[] args) {
        // Step 4: Initialize an array
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};

        // Step 5: Delete the element at index 2 and update the array
        arr = deleteAtParticularIndex(arr, 2);
    }
}
