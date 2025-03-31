package Arrays.MultiDimentionalArrays;

public class SumoFRowWithMaxValue {

    /**
     * Algorithm:
     * 1. Initialize `maxVal` to Integer.MIN_VALUE, `maxRowIndex` to -1.
     * 2. Traverse the 2D matrix:
     *    - Compare each element with `maxVal`.
     *    - If greater, update `maxVal` and store its row index in `maxRowIndex`.
     * 3. Print `maxVal`, `maxRowIndex`, and `maxColIndex` (though `maxColIndex` is unused).
     * 4. Iterate through `maxRowIndex` and sum up all its elements.
     * 5. Return the computed sum.
     *
     * Time Complexity: O(n * m), where n = number of rows, m = number of columns.
     * Space Complexity: O(1) since we use only a few extra variables.
     */

    public static int sum(int matrix[][]) {
        int maxVal = Integer.MIN_VALUE; // Stores maximum value in matrix
        int maxRowIndex = -1; // Stores row index of max value
        int maxColIndex = -1; // Stores column index of max value (not used)
        int sum = 0; // Stores sum of the row containing max value

        // Step 1: Find the maximum value and its position
        for (int i = 0; i < matrix.length; i++) { // Loop through rows
            for (int j = 0; j < matrix[i].length; j++) { // Loop through columns
                if (matrix[i][j] > maxVal) { // If current value is greater than maxVal
                    maxVal = matrix[i][j]; // Update maxVal
                    maxRowIndex = i; // Update row index
                    maxColIndex = j; // Update column index (not required)
                }
            }
        }

        // Print maximum value and its position
        System.out.println("Max value: " + maxVal);
        System.out.println("Row Index with Max value: " + maxRowIndex);
        System.out.println("Column Index with Max value: " + maxColIndex);

        // Step 2: Compute sum of elements in the row containing max value
        for (int j = 0; j < matrix[maxRowIndex].length; j++) { // Loop through columns of maxRowIndex
            sum += matrix[maxRowIndex][j]; // Add each element of that row
        }

        return sum; // Return the sum of that row
    }

    public static void main(String[] args) {
        int matrix[][] = {
                {2000, 3, 4},
                {4, 5000, 9},
                {40, 5001, 9000}
        };

        int sum = sum(matrix);
        System.out.println("Sum of Row with max value: " + sum);
    }
}
