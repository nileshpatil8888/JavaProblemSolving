package LeetCode.Array;

import java.util.Arrays;
import java.util.HashSet;

public class PlusOne {
    public int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {
            // Increment the current digit
            digits[i]++;

            // If the digit becomes 10, set it to 0 and carry over
            if (digits[i] == 10) {
                digits[i] = 0;
            } else {
                // No carryover needed, return the array
                return digits;
            }
        }

        // If we're here, all digits were 9 (e.g., 999 + 1 = 1000)
        int[] result = new int[digits.length + 1];
        result[0] = 1; // Set the first digit to 1
        return result; // Rest are already 0
    }
}
