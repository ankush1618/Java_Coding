package Arrays;

import java.util.Arrays;

public class ZeroesInStarting {

    /**
     * Method to move all zeroes in an array to the beginning while
     * maintaining the order of non-zero elements.
     * @param arr - Input array of integers.
    Algorithm Explanation
    Initialize Variables:
    counter = n-1 (points to the last position where a non-zero element should be placed).
    Iterate backwards from the end of the array.
    Move Non-Zero Elements:
    If arr[i] is non-zero, move it to arr[counter], then decrement counter.
    Fill Remaining Positions with Zeroes:
    All unfilled positions (from counter to 0) are set to 0
     TC=O(n)
     SC=O(1)
     */
    public static void zeroToStart(int arr[]) {
        int n = arr.length;  // Get the length of the array
        int counter = n - 1; // Counter to track position of non-zero elements from the end

        // Traverse the array from right to left
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] != 0) {  // If the element is non-zero
                arr[counter] = arr[i];  // Move the non-zero element to the correct position
                counter--;  // Decrement counter
            }
        }

        // Fill remaining positions with zeroes
        while (counter >= 0) {
            arr[counter] = 0;  // Place zeroes at the beginning
            counter--;
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 0, 5, 0, 8, 9, 9, 0, 0, 3, 4, 5, 0};
        System.out.println("Array Before: " + Arrays.toString(arr));
        zeroToStart(arr); // Call the function to shift zeroes
        System.out.println("Array After: " + Arrays.toString(arr));
    }
}
