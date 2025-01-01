package LeetCode.Array;

public class ReverseNumberOfArray {

    public int[] reverse(int[] nums) {
        int n =nums.length;
        int[] reversed = new int[n];

        for(int i=0; i < n; i++){
            reversed[i] = nums[n-1-i];
        }
        return reversed;
    }
}
