package Strings;

/**
 Algorithm Explanation
 Initialize temp = "0" to store consecutive digits as a string.
 Initialize sum = 0 to accumulate the sum of extracted numbers.
 Iterate through each character in the given string:
 If the character is a digit, append it to temp.
 If the character is not a digit, convert temp to an integer,
 add it to sum, and reset temp to "0".
 After the loop, convert and add the last collected number to sum
 (since the last character might be a digit).
 Return the final sum.
 TC=O(n)
 SC=O(1)
 **/

public class SumConsecutiveDigits {

    // Method to calculate the sum of consecutive digits in a string
    public static int sumConsDigits(String str) {
        String temp = "0";  // Temporary string to hold consecutive digits
        int sum = 0;  // Variable to store the total sum of extracted numbers

        // Iterate over each character in the input string
        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) {
                // If the character is a digit, append it to the temporary string
                temp += ch;
            } else {
                // If a non-digit character is encountered, add the collected number to sum
                sum += Integer.parseInt(temp);
                temp = "0";  // Reset temp to collect the next number
            }
        }

        // Add the last collected number to the sum
        return sum + Integer.parseInt(temp);
    }

    public static void main(String[] args) {
        // Calling the function with a sample input string
        int sum = sumConsDigits("168Ank34us34h12pa08l80");
        System.out.println("Sum of consecutive digits :"+sum);  // Output the final sum
    }
}
