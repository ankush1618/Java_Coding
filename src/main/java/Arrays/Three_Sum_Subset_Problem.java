package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Three_Sum_Subset_Problem {

    /**
     * Algorithm:
     * 1. Sort the array to simplify finding pairs efficiently.
     * 2. Iterate through each element (`arr[i]`) and treat it as the potential sum of two other elements.
     * 3. Use two pointers (`left` and `right`) to check pairs whose sum equals `arr[i]`:
     *    - If `sum == arr[i]`, add it to the result list and move both pointers.
     *    - If `sum < arr[i]`, decrease the `right` pointer.
     *    - If `sum > arr[i]`, increase the `left` pointer.
     * 4. Skip duplicate elements to avoid duplicate subsets.
     * 5. Return the list of valid subsets.
     *
     * Complexity Analysis:
     * - Sorting the array: O(n log n)
     * - Iterating through each element: O(n)
     * - Two-pointer search for each element: O(n)
     * - Overall Complexity: O(n^2)
     * SC=O(K), where K is the number of valid triplets found.
     */

    public static List<List<Integer>> sumSubSet(int arr[]) {
        int n = arr.length;
        Arrays.sort(arr); // Sort the array to make two-pointer approach work

        List<List<Integer>> finalRes = new ArrayList<>(); // List to store unique triplets
        if (n < 3) return finalRes; // If less than 3 elements, return empty list

        for (int i = 0; i < n; i++) { // Iterate through each element as the target sum
            if (i > 0 && arr[i] == arr[i - 1]) continue; // Skip duplicate elements

            int left = 0; // Left pointer starts from the beginning
            int right = n - 1; // Right pointer starts from the end

            while (left < right) { // Ensure left and right pointers do not cross
                int sum = arr[left] + arr[right]; // Compute sum of two elements

                if (sum == arr[i]) { // Check if sum matches the target element
                    // Add to result
                    finalRes.add(Arrays.asList(arr[i], arr[left], arr[right]));
                    left++; // Move left pointer forward
                    right--; // Move right pointer backward
                    // Skip duplicate elements
                    while (left < right && arr[left] == arr[left - 1]) left++;
                    while (left < right && arr[right] == arr[right + 1]) right--; // Skip duplicate elements
                }
                else if (sum < arr[right]) { // If sum is smaller, move right pointer left
                    right--;
                } else { // If sum is greater, move left pointer right
                    left++;
                }
            }
        }
        return finalRes; // Return list of valid subsets
    }

    public static void main(String[] args) {
        int arr[] = {1, 1, 2, -2, 2, 0, 5, 3, 2}; // Input array
        List<List<Integer>> subset = sumSubSet(arr); // Call function to find subsets
        System.out.println(subset); // Print the resulting subsets
    }
}
