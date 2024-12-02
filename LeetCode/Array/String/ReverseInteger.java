package LeetCode.Array.String;

public class ReverseInteger {

    public int reverse(int x) {
        int reversed = 0;

        for (int num = x; num != 0; num /= 10) {
            int digit = num % 10;

            // Check for overflow before updating reversed
            if (reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0; // Overflow
            }
            if (reversed < Integer.MIN_VALUE / 10 || (reversed == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0; // Underflow
            }

            reversed = reversed * 10 + digit; // Update reversed number
        }

        return reversed; // Return reversed number
    }
}
