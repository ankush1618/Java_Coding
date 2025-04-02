package Arrays.MultiDimentionalArrays;

public class SumOfBothDiagonalsOfMatrix {

    /*
       ===================== ALGORITHM =====================
       1. Initialize `sum = 0` to store the sum of both diagonals.
       2. Iterate through the matrix using index `i`:
          - Add `matrix[i][i]` (Main Diagonal element).
          - Add `matrix[i][n - i - 1]` (Other Diagonal element).
       3. If the matrix has an **odd size (n × n where n is odd)**:
          - The middle element gets counted **twice** (once in both diagonals).
          - Subtract it once from `sum` to correct the total.
       4. Return the final sum.
       ====================================================

       Time Complexity: O(N) → We traverse the matrix once.
       Space Complexity: O(1) → No extra space is used.
    */

    // Function to calculate the sum of both diagonals
    public static int sum(int [][] matrix) {
        int sum = 0;  // Stores the total sum of diagonals
        int n = matrix.length;  // Size of the matrix (assuming square matrix)

        // Step 2: Traverse the matrix diagonally
        for (int i = 0; i < n; i++) {
            sum += matrix[i][i];  // Add main diagonal element
            sum += matrix[i][n - i - 1];  // Add secondary diagonal element
        }

        // Step 3: Adjust for the middle element (if n is odd)
        if (n % 2 == 1) {
            sum -= matrix[n / 2][n / 2];  // Subtract the middle element (counted twice)
        }

        return sum;  // Return the computed sum
    }

    public static void main(String[] args) {
        // Step 4: Define a sample square matrix
        int matrix[][] = {
                {2000, 3, 4},
                {4, 5000, 9},
                {40, 5001, 9000}
        };

        // Print matrix size
        System.out.println("Matrix Size: " + matrix.length);

        // Step 5: Compute and print the sum of both diagonals
        int sum = sum(matrix);
        System.out.println("Sum of both diagonals: " + sum);
    }
}
