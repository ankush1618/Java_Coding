package Arrays;
/**
Algorithm Steps
Find the maximum value in the array (O(N))
This helps determine the range of numbers to check for missing elements.
Create a result array (max + 1) (O(max+1))
The result array is used to mark the presence of numbers.
Mark the presence of elements in the result array (O(N))
Each index corresponding to an element in the array is marked as 1.
Scan the result array to find missing numbers (O(max+1))
Any index that remains 0 represents a missing number.
Store missing numbers in a list and return them (O(M))
The list contains all missing numbers.
SC=O(max + M)
TC=O(N + max + M)
 **/

import java.util.ArrayList;
import java.util.List;

public class MissingInArray_withDuplicates {

    public static List<Integer> missingElement(int arr[]){
        // Step 1: Find the maximum number in the array to determine the size needed.
        int max = 0;
        for (int num : arr) {  // O(N) - Traverses the array once
            if (num > max) {
                max = num;  // Keeps track of the largest number in the array
            }
        }

        // Step 2: Initialize a result array of size max+1 to mark presence of elements
        // O(max+1) - Allocates memory for missing tracking
        int result[] = new int[max + 1];

        // Step 3: Mark the presence of elements from the input array
        for (int i : arr) {  // O(N) - Traverses the array again
            result[i] = 1;  // Mark the index as present
        }

        // Step 4: Initialize a list to store missing elements
        List<Integer> missingNumbers = new ArrayList<>();

        // Step 5: Identify missing numbers by checking unmarked indices
        // O(max+1) - Checks for missing numbers
        for (int i = 0; i < result.length; i++) {
            if (result[i] == 0) {
                // If the number is missing, add to list
                missingNumbers.add(i);
            }
        }
        // Step 6: Return the list of missing numbers
        return missingNumbers;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,6,8,6,8};
        List<Integer> missing=missingElement(arr);
        System.out.println(missing);
    }
}
