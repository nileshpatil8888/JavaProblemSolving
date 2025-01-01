package LeetCode.String;

import java.util.Arrays;

public class ValidAnagram {

    public boolean isAnagram(String s, String t) {

//        var A = s.toCharArray();
//        var B = t.toCharArray();
//        boolean istrue = false;
//        for(var i =0; i < A.length; i++){
//            for(var j=0; j <B.length; j++){
//                if(A[i] == B[j]){
//                    istrue = true;
//                } else {
//                    istrue = false;
//                }
//            }
//        }
//        return istrue;

        // Check if lengths are different; if so, they can't be anagrams
        if (s.length() != t.length()) {
            return false;
        }

        // Convert strings to character arrays
        var A = s.toCharArray();
        var B = t.toCharArray();

        // Sort both arrays
        Arrays.sort(A);
        Arrays.sort(B);

        // Compare sorted arrays
        return Arrays.equals(A, B);
    }
}
