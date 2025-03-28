package Arrays;

import java.util.Arrays;

public class ZerosInEnd {

    /**
     * Moves all zeroes in an array to the end while maintaining the order of non-zero elements.
     * @param arr - Input array of integers.
     *
     * Algorithm Explanation:
     * 1. Initialize Variables:
     *    - count = 0 → Points to the position where the next non-zero element should be placed.
     *    - n = arr.length → Stores the size of the array.
     * 2. Move Non-Zero Elements:
     *    - Iterate through the array.
     *    - If arr[i] is non-zero, move it to arr[count] and increment count.
     * 3. Fill Remaining Positions with Zeroes:
     *    - From count to the end of the array, fill all positions with zeroes.
     *
     * Time Complexity: O(n) - Single pass through the array.
     * Space Complexity: O(1) - No extra space used, in-place modifications.
     */
    public static void zeroToEnd(int arr[]) {
        int count = 0; // Pointer to track position for non-zero elements
        int n = arr.length; // Length of the array
        // Traverse the array and move non-zero elements to the left
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) { // If the element is non-zero
                arr[count] = arr[i]; // Move it to the correct position
                count++; // Increment the counter
            }
        }
        // Fill the remaining positions with zeroes
        while (count < n) {
            arr[count] = 0; // Assign zero
            count++; // Move forward
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 0, 5, 0, 8, 9, 9, 0, 0, 3, 4, 5, 0};
        System.out.println("Array Before: " + Arrays.toString(arr));
        zeroToEnd(arr); // Call the function to shift zeroes
        System.out.println("Array After: " + Arrays.toString(arr));
    }
}
