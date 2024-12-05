package LeetCode.Array.String;

/**
 * The StringToInteger class provides a method to convert a string representation
 * of a number into its integer equivalent, following the rules similar to that
 * of the 'atoi' function in C/C++.
 */
public class StringToInteger {

    public static int myAtoi(String s) {
        // Step 1: Ignore leading whitespace
        s = s.trim();
        if (s.isEmpty()) return 0;

        // Step 2: Handle sign
        int sign = 1;
        int index = 0;
        if (s.charAt(0) == '-' || s.charAt(0) == '+') {
            sign = (s.charAt(0) == '-') ? -1 : 1;
            index++;
        }

        // Step 3: Convert digits into an integer
        long result = 0; // Use long to handle overflow during computation
        while (index < s.length() && Character.isDigit(s.charAt(index))) {
            result = result * 10 + (s.charAt(index) - '0');
            if (result > Integer.MAX_VALUE) break; // Stop early if we exceed bounds
            index++;
        }

        // Step 4: Apply sign
        result *= sign;

        // Step 5: Handle bounds
        if (result < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        if (result > Integer.MAX_VALUE) return Integer.MAX_VALUE;

        return (int) result;
    }

    public static void main(String[] args) {
        myAtoi("42");
    }
}
