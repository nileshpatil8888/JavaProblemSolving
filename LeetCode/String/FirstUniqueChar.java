package LeetCode.String;

public class FirstUniqueChar {

    public int firstUniqChar(String s) {
        int n = s.length();

        // Iterate through each character
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            System.out.println(c);
            boolean isUnique = true;

            // Check if the character is unique by comparing it with all other characters
            for (int j = 0; j < n; j++) {
                if (i != j && s.charAt(j) == c) {
                    isUnique = false;
                    break;
                }
            }

            // If the character is unique, return its index
            if (isUnique) {
                return i;
            }
        }

        // If no unique character is found, return -1
        return -1;
    }

}
