package Strings;

public class SumDigits {
    /**
     * Method to sum all individual digits present in a given string.
     * @param str - Input string containing digits and non-digit characters.
     * @return sum of all the individual digits found in the string.
     * Algorithm Explanation
     * Initialize sum = 0 to store the sum of digits
     * Loop through each character in the string:
     * If the character is a digit, convert it to an integer using
     * Character.getNumericValue(ch) and add it to sum.
     * If the character is not a digit, ignore it.
     * After iterating through the string, return the total sum.
     *  TC=O(n)
     *  SC=O(1)
     */
    public static int sumDigits(String str) {
        int sum = 0;  // Variable to store the sum of digits

        // Iterate through each character in the string
        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) {
                // If character is a digit, convert it to integer and add to sum
                sum += Character.getNumericValue(ch);
            }
        }
        return sum; // Return the total sum of digits
    }

    public static void main(String[] args) {
        // Test the function with a sample string
        int sum = sumDigits("An23ku76s");
        System.out.println("Sum of Digits: " + sum); // Expected output: 2+3+7+6 = 18
    }
}
