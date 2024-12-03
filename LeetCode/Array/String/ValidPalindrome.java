package LeetCode.Array.String;

public class ValidPalindrome {

    public static boolean isPalindrome(String s) {
//        var A = s.toLowerCase();
//        String B = A.replaceAll("[^a-zA-Z0-9]","");
//
//        String stringBuilder = new StringBuilder(B).reverse().toString();
//        if(s == stringBuilder){
//            return true;
//        } else {
//            return false;
//        }

        // Remove non-alphanumeric characters and convert to lowercase
        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        // Use two-pointer technique to check palindrome
        int left = 0, right = cleaned.length() - 1;
        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        isPalindrome("ABC:qwerty");
    }

}
